// LC 1 : Two Sum
var twoSum = function(nums, target) {
    let ans = new Array();
    
    for(let i=0; i<nums.length; i++){
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] === target) {
                return [i, j];
            }
        }
    }

    return ans;
};