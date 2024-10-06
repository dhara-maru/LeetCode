//LC 189 : Rotate Array

 const numsrev = (nums, start, end) => {
    while(start < end){
        [nums[start], nums[end]] = [nums[end], nums[start]];
        start++;
        end--;
    }
 }
var rotate = function(nums, k) {
   k = k % nums.length;

   nums.reverse();      //[7,6,5,4,3,2,1]
   numsrev(nums, 0, k-1);       //[5,6,7]
   numsrev(nums, k, nums.length-1);     //[1,2,3,4]

};

let nums = [1, 2, 3, 4, 5, 6, 7];
let k = 3; 

console.log("Original array:", nums);
rotate(nums, k);
console.log("Array after rotating by", k, "steps:", nums);
