"use strict";
// 숫자 문자열과 영단어
const testCase = "1zerotwozero3";
{
  function solution(s) {
    const answer = s
      .replace(/zero/g, "0")
      .replace(/one/g, "1")
      .replace(/two/g, "2")
      .replace(/three/g, "3")
      .replace(/four/g, "4")
      .replace(/five/g, "5")
      .replace(/six/g, "6")
      .replace(/seven/g, "7")
      .replace(/eight/g, "8")
      .replace(/nine/g, "9");

    return answer;
  }
  //console.log(solution(testCase));
}

{
  function solution(s) {
    let numbers = [
      "zero",
      "one",
      "two",
      "three",
      "four",
      "five",
      "six",
      "seven",
      "eight",
      "nine",
    ];

    let answer = s;

    for (let i = 0; i < numbers.length; i++) {
      let arr = answer.split(numbers[i]);
      console.log("case " + i + "-------");
      console.log(arr);
      answer = arr.join(i);
      console.log(answer);
    }
  }
  console.log(solution(testCase));
}
