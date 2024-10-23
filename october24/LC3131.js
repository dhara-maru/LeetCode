// LC 3131 : Find the Integer Added to Array I
var addedInteger = function(nums1, nums2) {
    const min1 = Math.min(...nums1);    //found mins in both
    const min2 = Math.min(...nums2);

    const x = min2 - min1;  //stores them in x

    const adjustedNums1 = nums1.map(num => num + x);    // each element of nums1 has x added to it.

    adjustedNums1.sort((a, b) => a - b);    //sorting
    nums2.sort((a, b) => a - b);    //sorting 2nd

    for (let i = 0; i < adjustedNums1.length; i++) {
        if (adjustedNums1[i] !== nums2[i]) {        //compare
            return -1; 
        }
    }

    return x;
};