{
  const fs = require("fs");
  let input = fs.readFileSync("./11021.txt").toString();

  input = input.split("\n");
  let T = +input[0];

  let inputTestCase = [];
  for (let i = 1; i < input.length; i++) {
    let arr = input[i].split(" ").map((i) => +i);
    inputTestCase.push(arr);
  }

  function solution(C, testCase) {
    for (let i = 0; i < C; i++) {
      console.log(
        "Case #" + (i + 1) + ":" + " " + (testCase[i][0] + testCase[i][1])
      );
    }
  }

  solution(T, inputTestCase);
}

// const fs = require("fs");
// let input = fs.readFileSync("./11021.txt").toString();
// input = input.split("\n");

// for (let i = 0; i < input[0]; i++) {
//   let arr = input[i + 1].split(" ").map((i) => +i);
//   console.log("Case #" + (i + 1) + ":" + " " + (arr[0] + arr[1]));
// }
