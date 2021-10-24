{
  const fs = require("fs");
  let input = fs.readFileSync("./11004.txt").toString();
  input = input.split("\n");

  let arr = input[0].split(" ").map((i) => +i);
  let a = input[1].split(" ").map((i) => +i);

  const inputTestCase = {
    N: arr[0],
    K: arr[1],
    array: a,
  };

  function solution(testCase) {
    let N = testCase.N;
    let K = testCase.K;
    let array = testCase.array;

    array.sort((a, b) => a - b);
    let result = array[K - 1];
    console.log(result);
  }

  solution(inputTestCase);
}
