const dartResult = "1D2S#10S";

function another_solution(dartResult) {
  const bonus = { S: 1, D: 2, T: 3 };
  const options = { "*": 2, "#": -1, undefined: 1 };

  let darts = dartResult.match(/\d.?\D/g);

  for (let i = 0; i < darts.length; i++) {
    let split = darts[i].match(/(^\d{1,})(S|D|T)(\*|#)?/);
    let score = Math.pow(split[1], bonus[split[2]]) * options[split[3]];

    if (split[3] === "*" && darts[i - 1]) darts[i - 1] *= options["*"];
    darts[i] = score;
  }

  return darts.reduce((a, b) => a + b);
}

function solution(dartResult) {
  let count = [0, 0, 0];
  let tmp = "";
  let k = 0;
  for (let i = 0; i < dartResult.length; i++) {
    if (dartResult[i] === "S") {
      count[k] = parseInt(tmp) ** 1;
      tmp = "";
      k += 1;
    } else if (dartResult[i] === "D") {
      count[k] = parseInt(tmp) ** 2;
      tmp = "";
      k += 1;
    } else if (dartResult[i] === "T") {
      count[k] = parseInt(tmp) ** 3;
      tmp = "";
      k += 1;
    } else if (dartResult[i] === "*") {
      for (let j = k - 1; j > k - 3; j--) {
        count[j] = count[j] * 2;
      }
    } else if (dartResult[i] === "#") {
      count[k - 1] = count[k - 1] * -1;
    } else {
      tmp = tmp + dartResult[i];
    }
  }

  return count[0] + count[1] + count[2];
}

console.log(solution(dartResult));
console.log(another_solution(dartResult));
