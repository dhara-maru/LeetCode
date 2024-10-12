// LC 2469 : Convert the Temperature
var convertTemperature = function(celsius) {
    let kelvin = celsius + 273.15;
    let fahrenheit = celsius * 1.80 + 32.00;

    let ans = [];
    ans.push(kelvin);
    ans.push(fahrenheit);

    return ans;
};

let test1 = convertTemperature(122.11);     //[395.26000,251.79800]
let test2 = convertTemperature(36.50);      //[309.65000,97.70000]

console.log(test1);
console.log(test2);

