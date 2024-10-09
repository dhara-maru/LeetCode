// LC 2665 : Counter II
var createCounter = function(init) {
    let count = init;
 
     return {
         increment: function() { 
             count++; 
             return count; 
         },
         decrement: function() { 
             count--; 
             return count;
         },
         reset: function() {
             count = init; 
             return count; 
         }
     };
    
 };
 
 /**
  * const counter = createCounter(5)
  * counter.increment(); // 6
  * counter.reset(); // 5
  * counter.decrement(); // 4
  */