//LC 2634 : Filter Elements from Array

var filter = function(arr, fn) {
    const filteredArr = [];
    
   for (let i = 0; i < arr.length; i++) {
     if (fn(arr[i], i)) {
            filteredArr.push(arr[i]);
       }
   }

   return filteredArr;
};

const arr1 = [0, 10, 20, 30];
const fn1 = function greaterThan10(n) { return n > 10; };
console.log(filter(arr1, fn1)); // Output: [20, 30]