const list = [
  {
    id: 1,
    name: "최상위 폴더",
    folderType: "ROOT",
  },
  {
    id: 2,
    parentId: 1,
    name: "기본 메세지",
    folderType: "NORMAL",
  },
  {
    id: 3,
    parentId: 1,
    name: "학생 식당",
    folderType: "NORMAL",
  },
  {
    id: 4,
    parentId: 2,
    name: "연습",
    folderType: "NORMAL",
  },
];

// const treeModel = (arrayList, rootId) => {
//   let rootNodes = [];

//   const traverse = (nodes, item, index) => {
//     if (nodes instanceof Array) {
//       return nodes.some((node) => {
//         if (node.id === item.parentId) {
//           node.children = node.children || [];
//           return node.children.push(arrayList.splice(index, 1)[0]);
//         }
//         return traverse(node.children, item, index);
//       });
//     }
//   };

//   // some : 하나라도 true이면 true 리턴과 함께 순회 중단

//   while (arrayList.length > 0) {
//     arrayList.some((item, index) => {
//       const parentId = item.parentId === undefined ? 0 : item.parentId;
//       if (parentId === rootId) {
//         // splice : 원본 배열을 변경하고 제거된 배열을 반환
//         // splice(index, 1) 인덱스부터 한개 제거
//         return rootNodes.push(arrayList.splice(index, 1)[0]);
//       }
//       return traverse(rootNodes, item, index);
//     });
//   }

//   return rootNodes;
// };

const treeModel = (folderList, rootId) => {
  const rootNodes = [];

  const traverse = (nodes, item, index) => {
    if (nodes instanceof Array) {
      return nodes.some((node) => {
        if (node.id === item.parentId) {
          node.children = node.children || [];
          const tmp = folderList.splice(index, 1)[0];
          const newData = {
            id: tmp.id,
            labelText: tmp.name,
          };
          return node.children.push(newData);
        }
        return traverse(node.children, item, index);
      });
    }
  };
  // some : 하나라도 true이면 true 리턴과 함께 순회 중단
  while (folderList.length > 0) {
    folderList.some((folder, index) => {
      const parentId = folder.parentId === undefined ? 0 : folder.parentId;
      if (parentId === rootId) {
        // 	// splice : 원본 배열을 변경하고 제거된 배열을 반환
        // 	// splice(index, 1) 인덱스부터 한개 제거
        const tmp = folderList.splice(index, 1)[0];
        const newData = {
          id: tmp.id,
          labelText: tmp.name,
        };

        return rootNodes.push(newData);
      }
      return traverse(rootNodes, folder, index);
    });
  }

  return rootNodes;
};

console.log(treeModel(list, 0)[0]);
