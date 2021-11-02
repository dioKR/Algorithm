1. parseInt()

문자열 인자를 구문분석하여 특정 진수의 정수를 반환

```javascript
let hex = parseInt('OxF', 16);
let 3진수 = parseInt('00211', 3);

나눗셈에서 정수가 필요할 때
let  = parseInt(10/3); // 3 , parseInt를 사용하지않으면 3.3333
```

2. toString

문자열 반환 + 선택적으로 radix를 매개변수로 취해서 다른 진수로 변환 가능

```javascript
let 이진수 = 10.toString(2);
let 3진수 = 10.toString(3);

```

3. spread syntax : 전개구문 [...args]
