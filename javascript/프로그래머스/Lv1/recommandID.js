testCase = {
  case1: {
    new_id: "...!@BaT#*..y.abcdefghijklm", // "bat.y.abcdefghi"
  },
  case2: {
    new_id: "z-+.^.", // "z--"
  },
  case3: {
    new_id: "=.=", // "aaa"
  },
  case4: {
    new_id: "123_.def", // "123_.def"
  },
  case5: {
    new_id: "abcdefghijklmn.p", // "abcdefghijklmn"
  },
};

// 1. 정규식 공부 필요
// 2. String 메서드 공부 필요 (slice ... )
//      slice(start, end) start인덱스에서 end인덱스(end 미포함)까지
//      즉 "abcde".slice(0, length) => length: 5 5인덱스 미포함 => 전체다 가져온다
// 3. 체이닝 공부 필요

// 나의 풀이
{
  function solution(new_id) {
    let answer = new_id
      .toLowerCase()
      .replace(/[^a-z0-9\-\_\.]/g, "")
      .replace(/\.{2,}/g, ".");

    if (answer.charAt(0) === ".") {
      answer = answer.slice(1, answer.length);
    }
    if (answer.charAt(answer.length - 1) === ".") {
      answer = answer.slice(0, answer.length - 1);
    }
    if (answer.length >= 16) {
      answer = answer.slice(0, 15);
    }
    if (answer.charAt(answer.length - 1) === ".") {
      answer = answer.slice(0, answer.length - 1);
    }
    while (answer.length <= 2) {
      answer = answer + answer.charAt(answer.length - 1);
    }
    return answer;
  }

  console.log(solution(testCase.case1.new_id));
}

// 다른 사람 풀이
// 정규식 /^문자열, | , /문자열$ , /^$
// repeat 함수
{
  function solution(new_id) {
    const answer = new_id
      .toLowerCase()
      .replace(/[^\w-_.]/g, "")
      .replace(/\.+/g, ".")
      .replace(/^\.|\.$/g, "")
      .replace(/^$/, "a")
      .slice(0, 15)
      .replace(/\.$/, "");

    const len = answer.length;
    return len > 2 ? answer : answer + answer.charAt(len - 1).repeat(3 - len);
  }

  console.log(solution(testCase.case5.new_id));
}
