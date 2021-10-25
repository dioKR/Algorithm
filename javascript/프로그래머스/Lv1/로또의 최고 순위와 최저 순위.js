{
  const testCase = {
    case1: {
      lottos: [44, 1, 0, 0, 31, 25],
      win_nums: [31, 10, 45, 1, 6, 19],
    }, // [3,5]
    case2: {
      lottos: [0, 0, 0, 0, 0, 0],
      win_nums: [38, 19, 20, 40, 15, 25],
    }, // [1,6]
    case3: {
      lottos: [45, 4, 35, 20, 3, 9],
      win_nums: [45, 4, 35, 20, 3, 9],
    }, // [1,1]
  };

  function findUniqElem(arr1, arr2) {
    return arr1.filter((item) => !arr2.includes(item));
  }

  function countZero(arr1, arr2) {
    let count = arr1.filter((item) => item === 0).length;
    let L = arr2.length;
    return L >= count ? count : L;
  }

  function solution(lottos, win_nums) {
    let answer = [];

    // rank
    // 인덱스 : 맞은 번호의 개수
    // 값 : 순위
    let rank = [6, 6, 5, 4, 3, 2, 1];

    //1. lottos와 win_nums 일치하는 개수 찾기
    let after_lottos = findUniqElem(lottos, win_nums);
    let after_win_nums = findUniqElem(win_nums, lottos);

    let min = lottos.length - after_lottos.length;
    let max = min + countZero(after_lottos, after_win_nums);

    answer.push(rank[max]);
    answer.push(rank[min]);

    return answer;
  }

  console.log(solution(testCase.case1.lottos, testCase.case1.win_nums));
}

{
  // 다른 사람 풀이
  function solution(lottos, win_nums) {
    const rank = [6, 6, 5, 4, 3, 2, 1];

    let minCount = lottos.filter((v) => win_nums.includes(v)).length;
    let zeroCount = lottos.filter((v) => !v).length;

    const maxCount = minCount + zeroCount;

    return [rank[maxCount], rank[minCount]];
  }
}
