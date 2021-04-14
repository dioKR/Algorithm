//  입력 1 - 배열 크기, 더 할 횟수, 제한 (5,8,3)
//  입력 2 - 배열에 들어갈 수 (2,4,5,4,6)
//  출력 - 제일 큰 수
'use strict'

function BigNum(n,m,k,data) {
    let result = 0
    data.sort();
    const first = data[n-1];
    const second = data[n-2];

    let count = Math.floor(m/(k+1)) * k
    count += m % (k+1)

    result += first * count
    result += second * (m-count)
    return result
}

console.log(BigNum(5,8,3,[2,4,5,4,6]));