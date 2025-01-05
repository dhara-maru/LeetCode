// LC 2553 : Separate the Digits in an Array
var separateDigits = function(nums) {
    let answer = new Array();
    nums.forEach(num => {
        let digits = String(num).split("").map(Number); 
        answer.push(...digits);
    });

    return answer;
    
};

nums = [13,25,83,77]
console.log(separateDigits(nums))