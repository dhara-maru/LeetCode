//LC 977 : Squares of a Sorted Array
var sortedSquares = function(nums) {
    let sqarr = new Array();
    for(let i=0; i<nums.length; i++){
        sqarr.push(nums[i] * nums[i]);
    }

    sqarr.sort((a, b) => a - b);

    return sqarr;
};