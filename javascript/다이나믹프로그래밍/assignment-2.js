function print(x) {
  console.log(x);
}
// 금광
// https://unie2.tistory.com/229
{
  function solution(n, m, arr) {
    const map = Array.from(Array(n), () => new Array(m));

    for (let i = 0; i < n; i++) {
      for (let j = 0; j < m; j++) {
        map[i][j] = arr[n * i + i + j];
      }
    }

    const dp = Array.from(Array(n), () => new Array(m).fill(0));
    for (let i = 0; i < n; i++) {
      dp[i][0] = map[i][0];
    }

    for (let i = 1; i < m; i++) {
      for (let j = 0; j < n; j++) {
        const leftUp = j - 1 < 0 ? 0 : dp[j - 1][i - 1];
        const left = dp[j][i - 1];
        const leftDown = j + 1 >= n ? 0 : dp[j + 1][i - 1];
        console.log();

        dp[j][i] = map[j][i] + Math.max(leftUp, left, leftDown);
      }
    }

    const answer = [];
    for (let i = 0; i < n; i++) {
      answer.push(dp[i][m - 1]);
    }

    return Math.max(...answer);
  }

  print(solution(3, 4, [1, 3, 3, 2, 2, 1, 4, 1, 0, 6, 4, 7]));
  //   print(solution(4, 4, [1, 3, 1, 5, 2, 2, 4, 1, 5, 0, 2, 3, 0, 6, 1, 2]));
}

// 정수 삼각형
// https://www.acmicpc.net/problem/1932

// 퇴사
// https://techblog-history-younghunjo1.tistory.com/290

// 병사 배치하기
// https://techblog-history-younghunjo1.tistory.com/296

// 못생긴 수
// https://techblog-history-younghunjo1.tistory.com/303

// 편집거리
// https://chairking-95.tistory.com/116
