function findVowels(phrase:string):number{
    const vowels : string[] = ["a", "e", "i", "o", "u"];
    let count : number = 0;
    for (let i = 0; i < phrase.length+1; i++) {
        if(vowels.includes(phrase.charAt(i))){
            count++;
        }
    }
    return count;
}

const example : string = "esto es una prueba de codigo"; 
console.log(findVowels(example));