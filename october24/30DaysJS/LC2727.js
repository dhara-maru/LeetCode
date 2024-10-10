//LC 2727 : Is Object Empty

var isEmpty = function(obj) {
    if(Array.isArray(obj)){
        return obj.length === 0;

    } else if (typeof obj === 'object' && obj !== null) {
        
        return Object.keys(obj).length === 0;
    }
    return false; 
};
console.log(isEmpty({"x": 5, "y": 42}));  // false
console.log(isEmpty({}));                 // true
console.log(isEmpty([1, 2, 3]));          // false
console.log(isEmpty([]));                 // true





