//LC 2626 : Array Reduce Transformation
var reduce = function(nums, fn, init) {
   let arrlen  = nums.length;

   if(arrlen==0){
    return init;
   }

   let val;
   for(i=0; i<arrlen; i++){
    if(i==0){
        val = fn(init, nums[i])
    }else{
        val = fn(val, nums[i])
    }
   }

   return val;
};