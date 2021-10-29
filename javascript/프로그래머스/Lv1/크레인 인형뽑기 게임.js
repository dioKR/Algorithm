{
  function solution(board, moves) {
    let bucket = [];
    let answer = 0;
    let toy = 0;
    const L = board.length;
    for (let i = 0; i < moves.length; i++) {
      let num = moves[i] - 1;

      for (let j = 0; j < L; j++) {
        if (board[j][num] != 0) {
          toy = board[j][num];
          board[j][num] = 0;
          break;
        }
      }

      if (toy != 0) {
        if (bucket[bucket.length - 1] === toy) {
          answer = answer + 2;
          bucket.pop();
        } else {
          bucket.push(toy);
        }
        toy = 0;
      }
    }
    return answer;
  }
}
// 다른 사람 풀이
{
  const transpose = (matrix) =>
    matrix.reduce(
      (result, row) => row.map((_, i) => [...(result[i] || []), row[i]]),
      []
    );

  const solution = (board, moves) => {
    const stacks = transpose(board).map((row) =>
      row.reverse().filter((el) => el !== 0)
    );
    const basket = [];
    let result = 0;

    for (const move of moves) {
      const pop = stacks[move - 1].pop();
      if (!pop) continue;
      if (pop === basket[basket.length - 1]) {
        basket.pop();
        result += 2;
        continue;
      }
      basket.push(pop);
    }

    return result;
  };
}
