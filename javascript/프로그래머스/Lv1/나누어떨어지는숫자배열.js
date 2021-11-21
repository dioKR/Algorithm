{
  const arr = [5, 9, 7, 10]; // [5,10];
  const divisor = 5;

  function solution(arr, divisor) {
    const answer = arr.filter((val) => val % divisor === 0);
    return answer.length === 0 ? [-1] : answer.sort((a, b) => a - b);
  }

  console.log(solution(arr, divisor));
}
