'use strict'

const data = [
    [7,3,1,8],
    [3,3,3,4],
]

function CardGame(data) {
    let max = -9999
    for (let i of data) {
        console.log(i)
        if (max < Math.min.apply(null,i)){
            max = Math.min.apply(null,i)
        }
    }
    return max
}

console.log(CardGame(data))