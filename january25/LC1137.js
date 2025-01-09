// LC 1137 : N-th Tribonacci Number
var tribonacci = function(n) {
    let first = 0;
    let second = 1;
    let third = 1;

    for(let i=1; i<=n; i++){
        let fourth = first + second + third;
        first = second;
        second = third;
        third = fourth;
    }

    return first;
};