{
  const arr = [1, 1, 3, 3, 0, 1, 1]; // [1,3,0,1]
  function solution(arr) {
    let answer = [];

    answer.push(arr[0]);

    for (let i = 1; i < arr.length; i++) {
      if (arr[i - 1] !== arr[i]) answer.push(arr[i]);
    }

    return answer;
  }

  function solution2(arr) {
    return arr.filter((val, idx) => val !== arr[idx + 1]);
  }

  console.log(solution(arr));
  console.log(solution2(arr));
}
