const fs = require("fs");

let input = fs.readFileSync("./10952.txt").toString();
input = input.split("\n");

const inputTestCase = [];
for (let i = 0; i < input.length; i++) {
  const arr = input[i].split(" ").map((i) => +i);
  if (arr[0] === 0 && arr[1] === 0) break;

  const testCase = [arr[0], arr[1]];
  inputTestCase.push(testCase);
}

function solution(testCase) {
  let N = testCase.length;
  for (let i = 0; i < testCase.length; i++) {
    const T = testCase[i];
    let result = T[0] + T[1];
    console.log(result);
  }
}

solution(inputTestCase);
