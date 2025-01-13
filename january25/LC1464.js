// LC 1464 : Maximum Product of Two Elements in an Array
var maxProduct = function(nums) {
    let max = -Infinity;
    let smax = -Infinity;

    for (let num of nums) {
        if (num > max) {
            smax = max; 
            max = num; 
        } else if (num > smax) {
            smax = num;
        }
    }

    let newMax = max - 1;
    let newSmax = smax - 1;
    return newMax * newSmax;
};
