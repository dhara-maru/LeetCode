// LC 268 : Missing Number
var missingNumber = function(nums) {
    let n = nums.length;
    let expectedSum = (n * (n+1)) / 2;

    let actualSum=0;
    for(let i=0; i<n; i++){
        actualSum += nums[i];
    }

    let missing = expectedSum - actualSum;

    return missing;

};