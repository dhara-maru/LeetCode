// LC 989 : Add to Array-Form of Integer
var addToArrayForm = function(num, k) {
    const wholeNumber = BigInt(num.join(''));
    let sum = wholeNumber + BigInt(k);
    const numArray = sum.toString().split('').map(Number);
    return numArray;
};