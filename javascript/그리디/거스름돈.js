//  거스름돈으로 사용할 동전 : 500, 100, 50, 10
//  INPUT - 거슬러줘야할 돈 : N원 (N은 10의 배수)
//  OUTPUT - 거슬러줘야할 동전의 최소 개수 

// 반복문에서
// for ... in 
// for ... of
// 두 개의 차이점을 알았다.
// for in 의 경우 인덱스를
// for of 의 경우 해당 값을

// 문제를 풀면서
// 자바스크립트에는 몫을 구하는 연산자가 없다는 것을 알게 되었다.
// 몫은 금액에서 동전을 나눈 후 Math함수를 통해서 내림을 하였다.
// 몫을 구하는 방법은
// parseInt()나, Math.floor()를 사용하는 방법 외에도 >> 0이나 | 0처럼 비트연산자를 이용해서 구할 수 있지만
// 코드 가독성을 위해서 Math함수를 이용하였다.

function change_coin(n) {
    let count = 0;
    const coins = [500, 100, 50, 10];
    for (coin of coins) {
        count += Math.floor(n/coin)
        n %= coin
    }
    return count;
}

console.log(change_coin(1260))