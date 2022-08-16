function solution(n) {
  let answer = [];

  const arr = Array.from(Array(n), () => Array(n).fill(null));

  let count = 1;
  let x = 0;
  let y = 0;
  arr[x][y] = count;
  for (let i = n; i > 0; i--) {
    let dx;
    let dy;

    if ((n - i) % 3 === 0) {
      dx = 1;
      dy = 0;
    } else if ((n - i) % 3 === 1) {
      dx = 0;
      dy = 1;
    } else {
      dx = -1;
      dy = -1;
    }

    for (let j = 0; j < i; j++) {
      if (x + dx >= n || y + dy >= n) continue;
      x = x + dx;
      y = y + dy;
      count += 1;
      arr[x][y] = count;
    }
  }

  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      if (arr[i][j] !== null) {
        answer.push(arr[i][j]);
      }
    }
  }

  return answer;
}
