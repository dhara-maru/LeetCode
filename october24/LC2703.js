// LC 2703 : Return Length of Arguments Passed
var argumentsLength = function(...args) {
    let count = args.length;
    return count;
};

let result = argumentsLength(1, [], null, 4, 5.6);  //5
console.log(result)
