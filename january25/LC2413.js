// LC 2413 : Smallest Even Multiple
var smallestEvenMultiple = function(n) {
    // If n is even, the smallest even multiple is n itself
    // If n is odd, the smallest even multiple is 2 * n
    return n % 2 === 0 ? n : 2 * n;
};