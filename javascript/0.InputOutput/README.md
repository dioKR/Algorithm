# [Node.js] 표준 입력 받기 : readline

- readline
  - 데이터를 읽기위한 인터페이스 제공 모듈
  - 한번에 한 줄씩 Readable Stream에서 데이터를 읽는다.

```javascript
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stout,
});

1;
rl.question("", (input) => {
  solution(input);
  rl.close();
});

2;
rl.on("line", (line) => {
  console.log(line);
});

rl.close();
```
