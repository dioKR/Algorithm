const price = 3;
const money = 20;
const count = 4;

function solution(price, money, count) {
  let tot = 0;
  for (let i = 1; i <= count; i++) {
    tot += price * i;
  }
  answer = tot - money;
  return answer <= 0 ? 0 : answer;
}

function another_solution(price, money, count) {
  const answer = (price * count * (count + 1)) / 2 - money;
  return answer > 0 ? answer : 0;
}
