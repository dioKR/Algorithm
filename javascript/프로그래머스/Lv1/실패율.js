// 나의 문제 풀이
{
  function solution(N, stages) {
    let failureRates = [];

    for (let i = 1; i <= N; i++) {
      let players = stages.filter((stage) => stage >= i).length;
      let clear = stages.filter((stage) => stage === i).length;
      let failureRate = clear / players;
      failureRates.push([i, failureRate]);
    }

    failureRates.sort(compare);

    const answer = failureRates.map((i) => i[0]);
    return answer;
  }

  function compare(a, b) {
    if (a[1] === b[1]) {
      return a[0] - b[0];
    } else {
      return b[1] - a[1];
    }
  }
}

// 다른 사람 풀이
{
  function solution(N, stages) {
    let ans = [];

    for (let i = 1; i <= N; ++i) {
      let usersReachedCurrentStage = stages.reduce(
        (acc, curStage) => acc + (curStage >= i ? 1 : 0),
        0
      );
      let usersStagnatedCurrentStage = stages.reduce(
        (acc, curStage) => acc + (curStage == i ? 1 : 0),
        0
      );
      if (usersReachedCurrentStage === 0) {
        ans.push({ stage: i, failRate: 0 });
        continue;
      }

      ans.push({
        stage: i,
        failRate: usersStagnatedCurrentStage / usersReachedCurrentStage,
      });
    }

    return ans
      .sort((a, b) => {
        if (a.failRate > b.failRate) return -1;
        if (a.failRate < b.failRate) return 1;
        return a.stage - b.stage;
      })
      .map((entry) => entry.stage);
  }
}
