// LC 509 : Fibonacci Number
var fib = function(n) {
    if (n === 0){
         return 0;
    }
    if (n === 1){
        return 1;
    } 
    let first = 0;
    let second = 1;
   
    for (let i = 2; i <= n; i++) {
           
            let next = first + second;
            first = second;
            second = next;
        }

return second;
};
