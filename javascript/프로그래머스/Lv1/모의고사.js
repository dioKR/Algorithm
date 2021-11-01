// 내 풀이
// 새롭게 알았던 사실 Max는 두개이상의 파라미터도 들어간다.
{
  function solution(answers) {
    var answer = [];

    let a = [1, 2, 3, 4, 5];
    let b = [2, 1, 2, 3, 2, 4, 2, 5];
    let c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

    let aCount = 0;
    let bCount = 0;
    let cCount = 0;

    for (let i = 0; i < answers.length; i++) {
      if (a[i % a.length] === answers[i]) aCount++;
    }

    for (let i = 0; i < answers.length; i++) {
      if (b[i % b.length] === answers[i]) bCount++;
    }

    for (let i = 0; i < answers.length; i++) {
      if (c[i % c.length] === answers[i]) cCount++;
    }

    let max = Math.max(aCount, bCount, cCount);

    if (aCount === max) answer.push(1);
    if (bCount === max) answer.push(2);
    if (cCount === max) answer.push(3);

    return answer;
  }
}

// 다른사람풀이
{
  function solution(answers) {
    var answer = [];
    var a1 = [1, 2, 3, 4, 5];
    var a2 = [2, 1, 2, 3, 2, 4, 2, 5];
    var a3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

    var a1c = answers.filter((a, i) => a === a1[i % a1.length]).length;
    var a2c = answers.filter((a, i) => a === a2[i % a2.length]).length;
    var a3c = answers.filter((a, i) => a === a3[i % a3.length]).length;
    var max = Math.max(a1c, a2c, a3c);

    if (a1c === max) {
      answer.push(1);
    }
    if (a2c === max) {
      answer.push(2);
    }
    if (a3c === max) {
      answer.push(3);
    }

    return answer;
  }
}
