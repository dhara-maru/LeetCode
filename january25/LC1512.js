// LC 1512 : Number of Good Pairs
var numIdenticalPairs = function(nums) {
      let freq = {}; 
    let count = 0; 
    
    for (let num of nums) {
        if (freq[num]) {
            count += freq[num]; 
            freq[num]++;       
        } else {
            freq[num] = 1;    
        }
    }
    
    return count; 
};