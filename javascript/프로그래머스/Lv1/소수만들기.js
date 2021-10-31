{
  nums = [1, 2, 3, 4];

  function solution(nums) {
    let answer = 0;

    let result = getCombinations(nums, 3);
    console.log(result);

    result.forEach((arr) => {
      sum = arr.reduce((prev, cur) => prev + cur, 0);
      if (isPrime(sum)) answer++;
    });

    return answer;
  }

  function getCombinations(arr, selectNumber) {
    const results = [];
    if (selectNumber === 1) return arr.map((i) => [i]);
    arr.forEach((fixed, index, origin) => {
      const rest = origin.slice(index + 1);

      const combinations = getCombinations(rest, selectNumber - 1);

      const attached = combinations.map((combination) => [
        fixed,
        ...combination,
      ]);

      results.push(...attached);
    });
    return results;
  }

  function isPrime(sum) {
    for (let i = 2; i < sum; i++) if (sum % i === 0) return false;
    return sum > 1;
  }

  console.log(solution(nums));
}

//다른사람풀이

{
  function isPrime(n) {
    for (let i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  function solution(nums) {
    let cnt = 0;
    for (let i = 0; i < nums.length - 2; i++) {
      for (let j = i + 1; j < nums.length - 1; j++) {
        for (let k = j + 1; l < nums.length; k++) {
          if (isPrime(nums[i] + nums[j] + nums[k])) {
            cnt++;
          }
        }
      }
    }
    return cnt;
  }
}
