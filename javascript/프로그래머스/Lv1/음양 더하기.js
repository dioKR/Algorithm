// 내 풀이
{
  function solution(absolutes, signs) {
    var answer = 0;

    for (let i = 0; i < absolutes.length; i++) {
      answer += signs[i] ? absolutes[i] : -1 * absolutes[i];
    }

    return answer;
  }
}

{
  function solution(absolutes, signs) {
    return absolutes.reduce(
      (acc, val, i) => acc + val * (signs[i] ? 1 : -1),
      0
    );
  }
}
