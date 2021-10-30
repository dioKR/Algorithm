{
  const fs = require("fs");

  let input = fs.readFileSync("./input.txt").toString();
  input = input.split("\n");

  let c = input[0].split(" ");
  const n = c[0];
  const m = c[1];

  const map = [];
  for (let i = 1; i <= n; i++) {
    const arr = input[i].split("").map((i) => +i);
    map.push(arr);
  }

  function solution() {
    function dfs(x, y) {
      if (x < 0 || y < 0 || x >= n || y >= m) return false;
      if (map[x][y] === 0) {
        map[x][y] = 1;
        dfs(x - 1, y);
        dfs(x, y - 1);
        dfs(x + 1, y);
        dfs(x, y + 1);
        return true;
      }
      return false;
    }

    let result = 0;
    for (let i = 0; i < n; i++) {
      for (let j = 0; j < m; j++) {
        if (dfs(i, j)) result++;
      }
    }

    console.log(result);
  }

  solution();
}
