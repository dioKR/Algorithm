// 내풀이
{
  function solution(a, b) {
    let answer = 0;

    for (let i = 0; i < a.length; i++) {
      answer += a[i] * b[i];
    }

    return answer;
  }
}

// 다른사람풀이
// reduce(prev, curr, Indx)
{
  const a = [1, 2, 3, 4];
  const b = [-3, -1, 0, 2];

  function solution(a, b) {
    return a.reduce((acc, _, i) => (acc += a[i] * b[i]), 0);
  }

  console.log(solution(a, b));
}
