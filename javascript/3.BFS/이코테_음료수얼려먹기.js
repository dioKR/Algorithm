{
  const fs = require("fs");

  let input = fs.readFileSync("./input.txt").toString();
  input = input.split("\n");

  const t = input[0].split(" ");
  const n = +t[0];
  const m = +t[1];

  const map = [];
  for (let i = 1; i <= n; i++) {
    map.push(input[i].split("").map((i) => +i));
  }

  let dx = [1, 0, -1, 0];
  let dy = [0, 1, 0, -1];

  let result = 0;
  function bfs(x, y) {
    const queue = [];

    queue.push([x, y]);
    map[x][y] = 1;

    while (queue.length !== 0) {
      const cur = queue.shift();

      for (let i = 0; i < 4; i++) {
        let nx = cur[0] + dx[i];
        let ny = cur[1] + dy[i];
        if (nx < 0 || ny < 0 || nx >= n || ny >= m || map[nx][ny] === 1)
          continue;
        if (map[nx][ny] === 0) {
          queue.push([nx, ny]);
          map[nx][ny] = 1;
        }
      }
    }

    result++;
  }

  for (let i = 0; i < n; i++) {
    for (let j = 0; j < m; j++) {
      if (map[i][j] === 0) {
        bfs(i, j);
        console.log(map);
      }
    }
  }
  console.log(result);
}
