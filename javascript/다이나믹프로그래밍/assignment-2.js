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
{
  const n = 5;
  const arr = [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]];

  function solution(n, arr) {
    const dp = Array.from(Array(n), () => Array(n).fill(0));

    dp[0][0] = arr[0][0];

    for (let i = 1; i < n; i++) {
      for (let j = 0; j < arr[i].length; j++) {
        const left = j - 1 < 0 ? 0 : dp[i - 1][j - 1];
        const right = dp[i - 1][j];
        dp[i][j] = arr[i][j] + Math.max(left, right);
      }
    }

    return Math.max(...dp[n - 1]);
  }

  print(solution(n, arr));
}

// 퇴사 ****
// https://techblog-history-younghunjo1.tistory.com/290
{
  const n = 7;
  const t = [3, 5, 1, 1, 2, 4, 2];
  const p = [10, 20, 10, 20, 15, 40, 200];

  function solution(n, t, p) {
    let max = 0;
    const dp = new Array(n + 1).fill(0);

    for (let i = n - 1; i > -1; i--) {
      let time = t[i] + i;
      if (time <= n) {
        dp[i] = Math.max(p[i] + dp[time], max);
        max = dp[i];
      } else {
        dp[i] = max;
      }
    }
    return max;
  }

  print(solution(n, t, p));
}

// 병사 배치하기
// https://techblog-history-younghunjo1.tistory.com/296

{
  const n = 7;
  const arr = [15, 11, 4, 8, 5, 2, 4];
  function solution(n, arr) {
    const reverse_arr = [...arr].reverse();
    const dp = new Array(n).fill(1);

    for (let i = 1; i < n; i++) {
      for (let j = 0; j < i; j++) {
        if (reverse_arr[j] < reverse_arr[i]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }

    return n - Math.max(...dp);
  }
  print(solution(n, arr));
}

// 못생긴 수
// https://techblog-history-younghunjo1.tistory.com/303

// 편집거리
// https://chairking-95.tistory.com/116
