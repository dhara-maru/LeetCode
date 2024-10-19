// LC 217 : Contains Duplicate

var containsDuplicate = function(nums) {
    nums.sort(function(a, b) {
      return a - b; 
  });

  for (let i = 1; i < nums.length; i++) {
      if (nums[i] === nums[i - 1]) {
          return true; 
      }
  }

  return false; 
};

let nums = [1,2,3,4,51,1];
console.log(containsDuplicate(nums));