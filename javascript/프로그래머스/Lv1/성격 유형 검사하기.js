function solution(survey, choices) {
  let answer = "";

  const p = {
    R: 0,
    T: 0,
    C: 0,
    F: 0,
    J: 0,
    M: 0,
    A: 0,
    N: 0,
  };

  for (let i = 0; i < survey.length; i++) {
    const choice = choices[i];
    const left = survey[i][0];
    const right = survey[i][1];

    switch (choice) {
      case 1:
        p[left] += 3;
        break;
      case 2:
        p[left] += 2;
        break;
      case 3:
        p[left] += 1;
        break;
      case 5:
        p[right] += 1;
        break;
      case 6:
        p[right] += 2;
        break;
      case 7:
        p[right] += 3;
        break;
      default:
        break;
    }
  }

  if (p["R"] >= p["T"]) {
    answer += "R";
  } else {
    answer += "T";
  }

  if (p["C"] >= p["F"]) {
    answer += "C";
  } else {
    answer += "F";
  }

  if (p["J"] >= p["M"]) {
    answer += "J";
  } else {
    answer += "M";
  }

  if (p["A"] >= p["N"]) {
    answer += "A";
  } else {
    answer += "N";
  }

  return answer;
}

function solution(survey, choices) {
  var answer = "";
  let indi = new Map();
  ["R", "T", "C", "F", "J", "M", "A", "N"].forEach((item) => indi.set(item, 0));

  choices.forEach((item, index) => {
    let [A, B] = survey[index].split("");
    if (item > 4) indi.set(B, indi.get(B) + item - 4);
    else if (item < 4) indi.set(A, indi.get(A) + 4 - item);
  });
  answer += indi.get("R") >= indi.get("T") ? "R" : "T";
  answer += indi.get("C") >= indi.get("F") ? "C" : "F";
  answer += indi.get("J") >= indi.get("M") ? "J" : "M";
  answer += indi.get("A") >= indi.get("N") ? "A" : "N";
  return answer;
}

function solution(survey, choices) {
  let answer = "";
  const obj = {
    R: 0,
    T: 0,
    C: 0,
    F: 0,
    J: 0,
    M: 0,
    A: 0,
    N: 0,
  };

  const aplph = survey.map((v, i) => {
    if (choices[i] > 4) obj[v.substring(1, 2)] += choices[i] - 4;
    if (choices[i] < 4) obj[v.substring(0, 1)] += 4 - choices[i];
  });

  obj["R"] >= obj["T"] ? (answer += "R") : (answer += "T");
  obj["C"] >= obj["F"] ? (answer += "C") : (answer += "F");
  obj["J"] >= obj["M"] ? (answer += "J") : (answer += "M");
  obj["A"] >= obj["N"] ? (answer += "A") : (answer += "N");

  return answer;
}
