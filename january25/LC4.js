// LC 4 : Median of Two Sorted Arrays
var findMedianSortedArrays = function(nums1, nums2) {
    let merged = [...nums1, ...nums2];
    merged.sort((a, b) => a - b);

    const n = merged.length;

    if (n % 2 === 1) {
        return parseFloat(merged[Math.floor(n / 2)].toFixed(5));
    } else {
        const mid1 = merged[n / 2 - 1];
        const mid2 = merged[n / 2];
        return parseFloat(((mid1 + mid2) / 2).toFixed(5));
    }
};

let nums1 = [1,3];
let nums2 = [2];
findMedianSortedArrays(nums1, nums2)