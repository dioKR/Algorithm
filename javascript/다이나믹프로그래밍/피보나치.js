function print(x) {
  console.log(x);
}

// 단순계산(재귀)은 비효율적
function fibo(x) {
  if (x === 1 || x === 2) {
    return 1;
  }
  return fibo(x - 1) + fibo(x - 2);
}
print(fibo(4));

// 메모제이션 기법
// 다이나믹 프로그래밍을 구현하는 방법 중 한 방법
// 탑다운방식
d = new Array(100);
d.fill(0);

function memo(x) {
  if (x === 1 || x === 2) {
    return 1;
  }

  if (d[x] !== 0) {
    return d[x];
  }

  d[x] = memo(x - 1) + memo(x - 2);
  return d[x];
}
print(memo(99));

// 바텁업 방식
d.fill(0);
d[1] = 1;
d[2] = 1;
n = 99;

// for (let i = 3; i < n + 1; i++) {
//   d[i] = d[i - 1] + d[i - 2];
// }

d.forEach((i, idx) => {
  if (idx > 0 && i === 0) d[idx] = d[idx - 1] + d[idx - 2];
});

print(d[n]);
