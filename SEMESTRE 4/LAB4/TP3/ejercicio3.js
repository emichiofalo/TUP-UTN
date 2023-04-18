"use strict";
function findVowels(phrase) {
    const vowels = ["a", "e", "i", "o", "u"];
    let count = 0;
    for (let i = 0; i < phrase.length + 1; i++) {
        if (vowels.includes(phrase.charAt(i))) {
            count++;
        }
    }
    return count;
}
const example = "esto es una prueba de codigo";
console.log(findVowels(example));
