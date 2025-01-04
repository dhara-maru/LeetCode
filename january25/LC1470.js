// LC 1470 : Shuffle the Array
var shuffle = function(nums, n) {
    let arr1 = new Array();
    let arr2 = new Array();

    for(i=0; i<n; i++){
        arr1.push(nums[i]);

    }
    for(i=n; i<nums.length; i++){
        arr2.push(nums[i])
    }

    // console.log(arr1);
    // console.log(arr2);

    let shuffledArr = new Array();

    for(i=0; i<n; i++){
            shuffledArr.push(arr1[i]);
            shuffledArr.push(arr2[i]);
    }

    return shuffledArr;
    
    
};

let nums = [1,2,3,4,4,3,2,1];
let n = 4
console.log(shuffle(nums, n));
