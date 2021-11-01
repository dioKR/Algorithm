// 나의 풀이
{
  function solution(nums) {
    let setPoketmon = new Set(nums);
    let setLength = [...setPoketmon].length;
    let L = nums.length / 2;

    if (L < setLength) return L;
    else return setLength;
  }
}

// 다른사람풀이
{
  function solution(nums) {
    const max = nums.length / 2;
    const arr = [...new Set(nums)];

    return arr.length > max ? max : arr.length;
  }
}
