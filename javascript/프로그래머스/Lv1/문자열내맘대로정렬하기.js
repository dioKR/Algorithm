const strings = ["abce", "abcd", "cdx"];

function solution(strings, n) {
  return strings.sort((a, b) => {
    if (a[n] === b[n]) {
      return a.localeCompare(b);
    }
    return a.charCodeAt(n) - b.charCodeAt(n);
  });
}

function another_solution(strings, n) {
  return strings.sort((a, b) =>
    a[n] === b[n] ? a.localeCompare(b) : a[n].localeCompare(b[n])
  );
}

console.log(solution(strings, 2));
console.log(another_solution(strings, 2));
