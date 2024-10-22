// LC 1832 : Check if the Sentence is Pangram
var checkIfPangram = function(sentence) {
    let alphabets = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'];

      let temp = new Array();
     
       for( i=0; i<sentence.length; i++){
           let char = sentence[i];
           if (alphabets.includes(char) && !temp.includes(char)) {
               temp.push(char);
           }
       }

     return temp.length === 26;
};
let s1 = 'thequickbrownfoxjumpsoverthelazydog'    //true
let s2 = 'bhaveshjoshithesuperhero'     //false
console.log(checkIfPangram(s1))
console.log(checkIfPangram(s2))