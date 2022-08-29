const fs = require("fs");
let input = fs.readFileSync("./input.txt").toString();
input = input.split("\n");

const n = Number(input[0].split(" ")[0]);
let k = Number(input[0].split(" ")[1]);
const coins = input
  .slice(1, n + 1)
  .reverse()
  .map((i) => Number(i));

// function solution(k, coins) {
//   let result = 0;
//   coins.forEach((coin) => {
//     if (coin <= k) {
//       result += parseInt(k / coin);
//       k %= coin;
//     }
//   });
//   return result;
// }

// 모두 다 돌아야하는 단점이 있음
// const result = coins.reduce((prev, coin) => {
//   let sum = prev;
//   if (coin <= k) {
//     sum += parseInt(k / coin);
//     k %= coin;
//   }
//   return sum;
// }, 0);
// console.log(result);

// 다름사람 풀이
function another_solution() {
  let count = 0;

  for (let i = 0; i < coins.length; i++) {
    if (k < coins[i]) {
      continue;
    } else {
      const value = Math.floor(k / coins[i]);
      k -= value * coins[i];
      count += value;

      if (k === 0) {
        break;
      }
    }
  }

  return count;
}

console.log(another_solution());
