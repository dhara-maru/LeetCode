// LC 1929 : Concatenation of Array
var getConcatenation = function(nums) {
    
    let ans = nums.concat(nums);
    return ans;
};
let nums = new Array(1,34,56,4,76,7,34);
console.log(getConcatenation(nums));