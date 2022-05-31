//  2018 카카오 블라인드 1차 비밀지도

const n = 5;
const arr1 = [9, 20, 28, 18, 11];
const arr2 = [30, 1, 21, 17, 28];

function toBinary(count, num) {
  let result = "";
  while (num > 0) {
    if (num % 2 === 0) {
      result = "0" + result;
    } else {
      result = "1" + result;
    }
    num = paresInt(num / 2);
  }

  const sub = count - result.length;

  for (let i = 0; i < sub; i++) {
    result = "0" + result;
  }
  return result;
}

function solution(n, arr1, arr2) {
  let answer = [];

  for (let i = 0; i < n; i++) {
    const a = toBinary(n, arr1[i]);
    const b = toBinary(n, arr2[i]);

    let c = "";
    for (let j = 0; j < n; j++) {
      if (a[j] === "1" || b[j] === "1") {
        c = c + "#";
      } else if (a[j] === 0 && b[j] === 0) {
        c = c + " ";
      }
    }
    answer.push(c);
  }
  return answer;
}
