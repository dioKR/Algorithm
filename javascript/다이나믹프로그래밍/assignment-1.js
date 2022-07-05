function print(x) {
  console.log(x);
}
// 1로 만들기
// https://velog.io/@suzieep/Algorithm-%EC%9D%B4%EC%BD%94%ED%85%8C-1%EB%A1%9C-%EB%A7%8C%EB%93%A4%EA%B8%B0-%ED%8C%8C%EC%9D%B4%EC%8D%AC
// 풀이시간 : 28분
{
  function soluton(x) {
    const d = new Array(x + 1);
    d.fill(0);

    for (let i = 2; i <= x; i++) {
      d[i] = d[i - 1] + 1;
      d[i] = Math.min(
        i % 5 === 0 ? d[i / 5] + 1 : d[i],
        i % 3 === 0 ? d[i / 3] + 1 : d[i],
        i % 2 === 0 ? d[i / 2] + 1 : d[i]
      );
    }
    return d[x];
  }

  // print(soluton(26));
}

// 개미 전사
//https://velog.io/@suzieep/Algorithm-%EC%9D%B4%EC%BD%94%ED%85%8C-%EA%B0%9C%EB%AF%B8-%EC%A0%84%EC%82%AC-%ED%8C%8C%EC%9D%B4%EC%8D%AC
// 문제풀이 : 8분
{
  function solution(n, k) {
    const arr = [...k];
    for (let i = 2; i < n; i++) {
      arr[i] = Math.max(arr[i - 2] + arr[i], arr[i - 1]);
    }
    return arr[n - 1];
  }

  n = 4;
  k = [1, 3, 1, 5];
  // print(solution(n, k));
}

// 바닥 공사
// https://unie2.tistory.com/321
{
  function solution(n) {
    const arr = new Array(n);
  }

  print(solution(n));
}

// 효율적인 화폐 구성
// https://velog.io/@suzieep/Algorithm-%EC%9D%B4%EC%BD%94%ED%85%8C-%ED%9A%A8%EC%9C%A8%EC%A0%81%EC%9D%B8-%ED%99%94%ED%8F%90-%EA%B5%AC%EC%84%B1-%ED%8C%8C%EC%9D%B4%EC%8D%AC
{
}
