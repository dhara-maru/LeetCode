// LC 13 : Roman To Integer
var romanToInt = function(s) {
    const givenmap = { I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000 };
    let res = 0;

    s.split('').forEach((romanNum, i) => {
        if (givenmap[romanNum] < givenmap[s[i + 1]]) {  // for example, in "IV" (4), 'I' is placed before 'V' and should be subtracted (5 - 1 = 4).
            res -= givenmap[romanNum];
        } else {
            res += givenmap[romanNum];
        }
    });

    return res;
};


let rn = "xiv";

    let result = romanToInt(rn);   
    console.log(result);                  
