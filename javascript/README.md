# JavaScript를 이용한 알고리즘 문제풀이

## 0.입출력

---

```javascript
// 백준 input 파일은 "/dev/stdin"에 존재

0. 기본 입력 방식
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

## 1.그리디 알고리즘

---

---

## 2.DFS & BFS

---

- DFS/BFS

  - 대표적인 그래프 탐색 알고리즘
    - 그래프란
      ```
      - 정점과 그 정점을 연결하는 간선으로 이루어진 자료구조
      - 간선의 방향이 한족이면 Directed Graph, 간선의 방향이 양쪽이면 Undirected Graph
      ```
  - "탐색"이란 많은 양의 데이터 중에서 원하는 데이터를 찾는 과정
  - DFS, BFS 알고리즘을 구현하기 위해서는 스택과 큐 자료구조를 알고 있어야 한다.
    <br></br>

- 스택

  - Last In, First Out : LIFO
  - 먼저 들어 온 데이터가 나중에 나가는 형식(선입후출)의 자료구조
  - 프링글스 통을 상상해보자
  - 자바스크립트에서는 배열을 사용하면 된다.

    ```javascript
    let stack = new Array(); // let stack = [];

    stack.push(1); // 원소를 삽입
    stack.pop(); // 원소를 삭제
    ```

- 큐

  - First In, First Out : FIFO
  - 먼저 들어 온 데이터가 먼저 나가는 형식(선입선출)의 자료구조
  - 터널을 생각해보자
  - 자바스크립트에서는 배열이 큐로도 사용할 수 있지만 시간복잡도를 생각하면 링크드리스트를 이용하여 큐를 직접 구현하여 사용하자.

    ```javascript
    let queue = new Array();

    //삽입
    queue.push(1);

    //삭제
    queue.shift(); // 또는
    queue.splice(0, 1); // splice는 삭제될 원소를 배열로 반환
    // 원본값에서는 삭제만 된다.
    ```

  <br/>

- 재귀 함수

  - 재귀 함수(Recursive Function)란 자기 자신을 다시 호출하는 함수를 의미
  - 재귀 함수를 문제풀이에 사용할 때는 재귀 함수의 종료 조건을 반드시 명시해야한다.
  - 종료 조건을 제대로 명시하지 않으면 함수가 무한 호출되고 stack overflow가 발생한다.

    ```javascript
    function recursive_function() {
      console.log("재귀 함수를 호출합니다");
      recursive_function();
    }

    recursive_function();
    // stack overflow
    // 컴퓨터 시스템의 스택 프레임에 쌓인다.
    // 컴퓨터 메모리에 올라간다. 메모리는 한정적

    // 종료조건
    function recursive_function(i) {
      if (i == 0) return;
      console.log(
        `${i} 번째 재귀함수에서 ${i + 1} 번째 재귀 함수를 호출합니다.`
      );
      recursive_function(i + 1);
      console.log(`${i} 번째 재귀함수를 종료합니다.`);
    }

    recursive_function(1);
    ```

- 재귀 함수 사용의 유의 사항
  - 재귀 함수를 잘 활용하면 복잡한 알고리즘을 간결하게 작성할 수 있다.
  - 모든 재귀 함수는 반복문을 이용하여 동일한 기능을 구현할 수 있다.
  - 재귀 함수가 반복문보다 유리한 경우도 있고 불리한 경우도 있다.
  - 컴퓨터가 함수를 연속적으로 호출하면 컴퓨터 메모리 내부의 스택 프레임에 쌓인다.
    - 스택을 사용해야 할 때 구현상 스택 라이브러리 대신에 재귀 함수를 이용하는 경우가 많다.

<br></br>

- DFS(Depth-First Search) : 깊이우선탐색 알고리즘

  - 그래프에서 깊은 부분을 우선적으로 탐색하는 알고리즘
  - 스택 자료구조(혹은 재귀 함수)를 이용한다.
  - 동작과정
    1. 탐색 시작 노드를 스택에 삽입하고 방문 처리
    2. 스택의 최상단 노드에 방문하지 않은 인접한 노드가 하나라도 있으면 그 노드를 스택에 넣고 방문처리.(방문 기준이 필요) 방문하지 않은 인접노드가 없으면 스택에서 최상단 노드를 꺼낸다.
    3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복

- Tip

  ```javascript
  1. 배열 원하는 값으로 채우기
  const arr = new Array(10).fill(false); // 배열을 10개 만들고 false로 값을 채운다.

  // 방문처리할 배열만들때 유용
  const visited = new Array(10).fill(false);


  2. 인접 리스트
  const graph = [
      [], // 인덱스 0은 사용하지 않는다 => 헷갈리지 않고 직관적
      [1,2,3],
      [2,3],
      ...
  ]

  ```

<br></br>

- BFS(Breadth-First Search) : 너비우선탐색 알고리즘
  - 그래프에서 가까운 노드부터 우선적으로 탐색하는 알고리즘
  - 큐 자료구조를 이용한다.
  - 동작과정
    1. 탐색 시작 노드를 큐에 삽입하고 방문 처리를 한다.
    2. 큐에서 노드를 꺼낸 뒤에 해당 노드의 인접 노드중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리한다.
    3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복

```javascript
function bfs(x, y) {
  // 1번 과정
  const queue = []; // 큐 생성
  queue.push([x, y]); // 시작 노드 삽입
  visited[x][y] = true; // 방문처리

  ...

  // 2~3번 과정 반복
  while(queue.length !== 0) {
    const top = queue.shift();
    let x = top[0];
    let y = top[1];

    // 인접 노드 방문
    for (let i = 0; i < 4; i++) {
        let nx = x + dx[i];
        let ny = y + dy[i];

        if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
        if (graph[nx][ny] === 0) continue;
        if (graph[nx][ny] === 1) {

          ...

          q.push([nx, ny]);
        }
      }

  }
}
```

---
