const fs = require("fs");

let input = fs.readFileSync("./input.txt").toString();
input = input.split("\n");

const inputC = +input[0];
const inputTestCase = [];

for (let i = 1; i <= inputC; i++) {
  const arr = input[i].split(" ").map((i) => +i);
  const newArr = [];
  for (let i = 1; i <= arr[0]; i++) {
    newArr.push(arr[i]);
  }
  const testCase = {
    N: arr[0],
    arr: newArr,
  };
  inputTestCase.push(testCase);
}

console.log("result : \n", inputTestCase);

// 1. solution 함수를 작성
// 2. 입력을 solution에 어떻게 주어야 풀 수 있을지 생각 해볼 것
function solution(C, testCase) {}
