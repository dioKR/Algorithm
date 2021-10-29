{
  testCase = {
    case1: {
      numbers: [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5],
      hand: "right",
    },
    case2: {
      numbers: [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2],
      hand: "left",
    },
    case3: {
      numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 0],
      hand: "right",
    },
  };

  function solution(numbers, hand) {
    let answer = "";

    let left = 11;
    let right = 12;

    for (let i = 0; i < numbers.length; i++) {
      if (numbers[i] === 1 || numbers[i] === 4 || numbers[i] === 7) {
        answer += "L";
        left = numbers[i];
      } else if (numbers[i] === 3 || numbers[i] === 6 || numbers[i] === 9) {
        answer += "R";
        right = numbers[i];
      } else {
        let leftToNum = calculateDistance(left, numbers[i]);
        let rightToNum = calculateDistance(right, numbers[i]);
        console.log(
          `case ${i} : leftToNum = ${leftToNum}, rightToNum = ${rightToNum}`
        );

        if (leftToNum < rightToNum) {
          answer += "L";
          left = numbers[i];
        } else if (leftToNum > rightToNum) {
          answer += "R";
          right = numbers[i];
        } else {
          if (hand === "left") {
            answer += "L";
            left = numbers[i];
          } else {
            answer += "R";
            right = numbers[i];
          }
        }
      }
    }

    return answer;
  }

  function calculateDistance(prev, curr) {
    const keypad = [
      [3, 1],
      [0, 0],
      [0, 1],
      [0, 2],
      [1, 0],
      [1, 1],
      [1, 2],
      [2, 0],
      [2, 1],
      [2, 2],
      [],
      [3, 0],
      [3, 2],
    ];

    const prev_coordi = keypad[prev];
    const curr_coordi = keypad[curr];

    return (
      Math.abs(prev_coordi[0] - curr_coordi[0]) +
      Math.abs(prev_coordi[1] - curr_coordi[1])
    );
  }
}

// 다른 사람 풀이
{
  const solution = (numbers, hand) => {
    const answer = [];

    let leftHandPosition = "*";
    let rightHandPosition = "#";

    numbers.forEach((number) => {
      if (number === 1 || number === 4 || number === 7) {
        answer.push("L");
        leftHandPosition = number;
        return;
      }

      if (number === 3 || number === 6 || number === 9) {
        answer.push("R");
        rightHandPosition = number;
        return;
      }

      const leftHandDistance = getDistance(leftHandPosition, number);
      const rightHandDistance = getDistance(rightHandPosition, number);

      if (leftHandDistance === rightHandDistance) {
        if (hand === "right") {
          answer.push("R");
          rightHandPosition = number;
          return;
        }

        if (hand === "left") {
          answer.push("L");
          leftHandPosition = number;
          return;
        }
      }

      if (leftHandDistance > rightHandDistance) {
        answer.push("R");
        rightHandPosition = number;
      }

      if (leftHandDistance < rightHandDistance) {
        answer.push("L");
        leftHandPosition = number;
      }
    });

    return answer.join("");
  };

  const getDistance = (locatedNumber, target) => {
    const keyPad = {
      1: [0, 0],
      2: [0, 1],
      3: [0, 2],
      4: [1, 0],
      5: [1, 1],
      6: [1, 2],
      7: [2, 0],
      8: [2, 1],
      9: [2, 2],
      "*": [3, 0],
      0: [3, 1],
      "#": [3, 2],
    };

    const nowPosition = keyPad[locatedNumber];
    const targetPosition = keyPad[target];

    return (
      Math.abs(targetPosition[0] - nowPosition[0]) +
      Math.abs(targetPosition[1] - nowPosition[1])
    );
  };
}
