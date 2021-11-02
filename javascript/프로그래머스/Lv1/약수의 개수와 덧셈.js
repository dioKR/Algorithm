// 나의 풀이
{
  function solution(left, right) {
    let answer = 0;

    for (let i = left; i <= right; i++) {
      if (countDivisor(i) % 2 === 0) {
        answer += i;
      } else {
        answer -= i;
      }
    }

    return answer;
  }

  function countDivisor(num) {
    let result = 0;
    for (let i = 1; i <= num; i++) {
      if (num % i === 0) result++;
    }
    return result;
  }
}

// 다른사람풀이
{
  function solution(left, right) {
    var answer = 0;
    for (let i = left; i <= right; i++) {
      if (Number.isInteger(Math.sqrt(i))) {
        answer -= i;
      } else {
        answer += i;
      }
    }
    return answer;
  }
}
