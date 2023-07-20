const sumOfAllNumbersInString=(str)=>{
     const regex = /\d+/g;
     arr = str.match(regex);
     if(arr === null){
         return 0;
    }
    else{
        return arr.map(element=>parseInt(element)).reduce((sum,element)=>sum+element);
    }
}
console.log(sumOfAllNumbersInString('hello world'));
console.log(sumOfAllNumbersInString('hello 1 world 2'));
console.log(sumOfAllNumbersInString('1hello 1 world 2'));