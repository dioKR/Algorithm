{
    n = 5;
    lost = [2, 4];
    reverse = [1, 3, 5];
    
    function solution(n, lost, reverse) {
        
        // _lost, _reverse는 여벌 옷이 있는데 도둑 맞은 경우 ==> 결국 자신의 옷 하나만 있다.
        let _lost = lost.filter(i => reverse.includes(i) === false);
        let _reverse = reverse.filter(i => lost.includes(i) === false);

        // answer = 체육 수업을 들을 수 있는 학생의 수
        // 전체 학생 수에서 옷이 없는 학생 수를 빼면 된다.
        const answer = n - _lost.filter(i => {
            const a = _reverse.find(j => Math.abs(i - j) <= 1)
            // a = 존재하면 숫자, 존재하지않으면 undefined
            // a가 flase 이면 lost의 원소를 가져간다.
            // 즉 i와j의 차이가 2이상이여야한다.
            // 즉 i와j가 한칸 차이라면 a가 true이고 lost의 해당 원소는 걸러진다.
            if (!a) return true;
            _reverse = _reverse.filter(k => k !== a);
        }).length

        return answer;
    }

    console.log(solution(n, lost, reverse));
}