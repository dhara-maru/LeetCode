//LC2620 : Counter
var createCounter = function(n) {
    var count = n;
    return function() {
        const currentCount = count;
        count++;
        return currentCount;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */