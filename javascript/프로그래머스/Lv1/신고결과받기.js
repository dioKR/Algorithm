// 2022 KAKAO BLIND

const id_list = ["muzi", "frodo", "apeach", "neo"];
const report = [
  "muzi frodo",
  "apeach frodo",
  "frodo neo",
  "muzi neo",
  "apeach muzi",
];
const k = 2;

function solution(id_list, report, k) {
  let answer = [];

  const a = {};
  const b = {};

  id_list.forEach((i) => {
    a[i] = new Set();
    b[i] = 0;
  });

  report.forEach((i) => {
    const data = i.split(" ");
    a[data[0]].add(data[1]);
  });

  for (let i = 0; i < id_list.length; i++) {
    const p = id_list[i];

    for (let j = 0; j < id_list.length; j++) {
      if (i === j) continue;
      a[id_list[j]].forEach((n) => {
        if (p === n) {
          b[p] += 1;
        }
      });
    }
  }

  const result = [];
  for (let key in b) {
    if (b[key] >= k) result.push(key);
  }

  for (let key in a) {
    let count = 0;
    result.forEach((i) => {
      if (a[key].has(i)) count += 1;
    });
    answer.push(count);
  }

  return answer;
}

function another_solution(id_list, report, k) {
  let reports = [...new Set(report)].map((a) => {
    return a.split(" ");
  });

  let counts = new Map();
  for (const bad of reports) {
    counts.set(bad[1], counts.get(bad[1]) + 1 || 1);
  }

  let good = new Map();
  for (const report of reports) {
    if (counts.get(report[1]) >= k) {
      good.set(report[0], good.get(report[0]) + 1 || 1);
    }
  }
  let answer = id_list.map((a) => good.get(a) || 0);
  return answer;
}

console.log(another_solution(id_list, report, k));
