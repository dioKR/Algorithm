// 내 풀이
{
  function solution(n) {
    let answer = 0;
    const ternary = [];

    while (n > 0) {
      let remainder = n % 3;
      n = parseInt(n / 3);
      ternary.push(remainder);
    }

    for (let i = 0; i < ternary.length; i++) {
      answer += ternary[i] * 3 ** (ternary.length - 1 - i);
    }

    return answer;
  }
}

// 다른 사람 풀이
{
  const solution = (n) => {
    return parseInt([...n.toString(3)].reverse().join(""), 3);
  };

  let num = 45;

  console.log(parseInt([...num.toString(3)].reverse().join(""), 3));
}
