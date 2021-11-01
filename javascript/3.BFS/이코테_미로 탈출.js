// BFS : 간선의 비용이 같을 때 최단거리 구하는 알고리즘
{
  const fs = require("fs");

  let input = fs.readFileSync("./input.txt").toString();
  input = input.split("\n");

  let firstline = input[0];
  firstline = firstline.split(" ").map((i) => +i);

  let n = firstline[0];
  let m = firstline[1];

  let map = [];
  for (let i = 1; i <= n; i++) {
    map.push(input[i].split("").map((i) => +i));
  }

  let newMap = [];
  for (let i = 0; i < n; i++) {
    newMap.push(new Array(m).fill(0));
  }

  const dx = [1, 0, -1, 0];
  const dy = [0, 1, 0, -1];

  function solution() {
    bfs(0, 0);
    console.log(newMap[n - 1][m - 1]);
  }

  function bfs(a, b) {
    // 시작 좌표를 큐에 삽입하고 방문처리
    // 방문처리 : 새로운 맵에 데이터가 들어간 형태
    const q = [];
    q.push([a, b]);
    newMap[a][b] = 1;

    // 큐에서 좌표를 꺼낸 뒤 인접 좌표 중
    // 방문하지 않은 좌표를 큐에 삽입하고 방문처리
    // 이때 방문 처리는 꺼낸 좌표값의 1을 더한 값
    while (q.length !== 0) {
      const v = q.shift();
      let x = v[0];
      let y = v[1];

      for (let i = 0; i < 4; i++) {
        let nx = x + dx[i];
        let ny = y + dy[i];

        if (nx < 0 || ny < 0 || nx >= n || ny >= m || map[nx][ny] === 0)
          continue;
        if (newMap[nx][ny] === 0) {
          q.push([nx, ny]);
          newMap[nx][ny] = newMap[x][y] + 1;
        }
      }
    }
  }

  solution();
}
