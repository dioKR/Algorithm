// 1260
// 백준에서 /dev/stdin 으로 입출력을 사용할 시 에러가 발생한다는 공지
// 따라서 readline으로 입출력하는 방식으로 풀이필요
// readline 공부
{
  const fs = require("fs");

  let input = fs.readFileSync("./input.txt").toString().trim();
  console.log(input);
  input = input.split("\n");
  let arr = input[0].split(" ").map((i) => +i);

  let n, m, v;
  [n, m, v] = [...arr];
  let result = [];

  const visited = new Array(n + 1).fill(false);
  const graph = [];
  for (let i = 0; i <= n; i++) {
    graph.push([]);
  }

  for (let i = 1; i <= m; i++) {
    let edge = input[i].split(" ").map((i) => +i);
    graph[edge[0]].push(edge[1]);
    graph[edge[1]].push(edge[0]);
  }

  for (let i = 1; i <= m; i++) {
    graph[i].sort((a, b) => a - b);
  }

  function dfs(v) {
    visited[v] = true;
    result.push(v);

    graph[v].forEach((node) => {
      if (!visited[node]) {
        dfs(node);
      }
    });
  }

  function bfs(v) {
    const q = [];
    q.push(v);
    visited[v] = true;
    while (q.length !== 0) {
      const cur = q.shift();

      result.push(cur);

      graph[cur].forEach((node) => {
        if (!visited[node]) {
          q.push(node);
          visited[node] = true;
        }
      });
    }
  }

  dfs(v);
  console.log(result.join(" "));
  visited.fill(false);
  result = [];
  bfs(v);
  console.log(result.join(" "));
}
