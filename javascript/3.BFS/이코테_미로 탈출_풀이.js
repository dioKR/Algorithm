{
  // 인풋 데이터 정제
  const fs = require("fs");
  let input = fs.readFileSync("./input.txt").toString();
  input = input.split("\n");
  let firstline = input[0];
  firstline = firstline.split(" ").map((i) => +i);

  let n = firstline[0];
  let m = firstline[1];

  let graph = [];
  for (let i = 1; i <= n; i++) {
    graph.push(input[i].split("").map((i) => +i));
  }

  // 방향
  const dx = [-1, 1, 0, 0];
  const dy = [0, 0, -1, 1];

  // 문제풀이
  function bfs(x, y) {
    const q = [];
    q.push([x, y]);
    while (q.length !== 0) {
      let top = q.shift();

      let x = top[0];
      let y = top[1];

      console.log(graph);
      for (let i = 0; i < 4; i++) {
        let nx = x + dx[i];
        let ny = y + dy[i];

        if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
        if (graph[nx][ny] === 0) continue;
        if (graph[nx][ny] === 1) {
          graph[nx][ny] = graph[x][y] + 1;
          q.push([nx, ny]);
        }
      }
    }
    return graph[n - 1][m - 1];
  }

  console.log(bfs(0, 0));
}
