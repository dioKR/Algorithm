# JavaScript Array Method

<h3>sort([compareFunction])</h3>

배열의 원소를 알파벳순으로, 또는 지정된 함수에 따른 순서로 정렬한다.
모든 원소를 문자열로 취급해 사전적으로 정렬

```javascript
let arr = [6,4,2,1,3,5];
arr.sort();
console.log(arr); // [1,2,3,4,5,6]

*유의사항*
let test = [1,30,4,21,100000];
test.sort();

* 기본 정렬 순서는 문자열의 유니코드 코드 포인트를 따르기 때문에 숫자 정렬이 제대로 되지않는다.
console.log(test) // [1, 10000, 21, 30, 4];

*해결 방안

// compareFuntion 함수 정의
function compareNumbers(a,b) {
    return a-b;
}

// sort 함수에 매개변수로 사용
test.sort(compareNumbers);
console.log(test); // [1, 4, 21, 30, 10000];


```

---

<h3>splice(index, 제거할 요소 개수, 배열에 추가될 요소)</h3>

배열의 특정위치에 요소를 추가하거나 삭제

```javascript
let arr = [1, 2, 3, 4, 5];
arr.splice(1, 2); // 1번 인덱스에서부터 2개 삭제
console.log(arr); // [1,4,5]
```

---

<h3>slice(startIndex, endIndex)</h3>

배열의 startIndex부터 endIndex까지(endIndex 포함(X)) shallow copy를 _새로운 배열 객체_ 로 반환

```javascript
let arr = [1, 2, 3, 4, 5];
let newArr = arr.slice(0, 2);
console.log(newArr); // [1,2]
```
