//LC 2704 : To Be or Not To Be
var expect = function(val) {
  function toBe(expected){
    if(expected === val){
        return true;
    }
    else{
        throw new Error("Not Equal");
    }
  }

  function notToBe(expected){
    if(expected !== val){
        return true;
    }
    else{
        throw new Error("Equal")
    }
  }

  return {
    toBe, notToBe
  }
};


let result1 = expect(5).toBe(5); // true
let result2 = expect(5).notToBe(5); // throws "Equal"

console.log(result1)
console.log(result2)
