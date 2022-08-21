function solution(n, a, b) {
  let answer = 0;
  while (true) {
    a = parseInt(a / 2) + (a % 2);
    b = parseInt(b / 2) + (b % 2);
    answer += 1;
    if (a === b) break;
  }
  return answer;
}

function solution(n, a, b) {
  let answer = 0;
  while (a !== b) {
    a = Math.ceil(a / 2);
    b = Math.ceil(b / 2);
    answer++;
  }

  return answer;
}
