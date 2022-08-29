const fs = require("fs");
let input = fs.readFileSync("./input.txt").toString();
input = input.split("\n");

const n = Number(input[0].split(" ")[0]);
let k = Number(input[0].split(" ")[1]);
const coins = input
  .slice(1, n + 1)
  .reverse()
  .map((i) => Number(i));

function solution(k, coins) {
  let result = 0;
  coins.forEach((coin) => {
    if (coin < k) {
      result += parseInt(k / coin);
      k %= coin;
    }
  });
  return result;
}

const result = coins.reduce((prev, coin) => {
  let sum = prev;
  if (coin < k) {
    sum += parseInt(k / coin);
    k %= coin;
  }
  return sum;
}, 0);
console.log(result);
