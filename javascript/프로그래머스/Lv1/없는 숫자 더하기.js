// 나의 풀이
{
  function solution(numbers) {
    let answer = 0;

    for (let i = 0; i < 10; i++) {
      if (!numbers.includes(i)) {
        answer += i;
      }
    }

    return answer;
  }
}

// 다른 사람 풀이
{
  function solution(numbers) {
    return 45 - numbers.reduce((cur, acc) => cur + acc, 0);
  }
}
