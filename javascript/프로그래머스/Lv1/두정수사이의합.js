function solution(a, b) {
  let start = a;
  let end = b;

  if (a > b) {
    start = b;
    end = a;
  }

  let answer = 0;

  for (let i = start; i <= end; i++) {
    answer += i;
  }

  return answer;
}

function adder(a, b) {
  return ((a + b) * (Math.abs(b - a) + 1)) / 2;
}

console.log(adder(3, 5));
