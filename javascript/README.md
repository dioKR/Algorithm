# JavaScript를 이용한 알고리즘 문제풀이

0. 입출력

---

```javascript
// 백준 input 파일은 "/dev/stdin"에 존재

0. 기본 방식
const fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString();
input = input.split("\n");



------------------------- 다앙한 방식 -------------------------------


1. 하나의 값을 입력 받을 때
const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim();


2. 공백으로 구분된 한 줄의 값들을 입력 받을 때
const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("");

3. 여러 줄의 값들을 입력 받을 때
const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

4. 첫 번째 줄에 자연수 n을 입력받고, 그 다음줄에 공백으로 구분된 n개의 값들을 입력 받을 때
const fs = require("fs");
const [n, ...arr] = fs.readFileSync("/dev/stdin").toString().trim().split(/\s/);

5. 첫 번째 줄에 자연수 n을 입력받고, 그 다음줄부터 n개의 줄에 걸쳐 한 줄에 하나의 값을 입력 받을 때
const fs = require("fs");
const [n, ...arr] = fs.readFileSync("dev/stdin").toString().trim().split("\n");

6. 하나의 값 또는 공백으로 구분된 여러 값들을 여러 줄에 걸쳐 뒤죽박죽 섞야서 입력 받을 때
const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s/);
const n = input[0];
const n_arr = input.slice(1, n+1);
const [m, ...m_arr] = input.slice(n+1);


```

1. 그리디 알고리즘

---
