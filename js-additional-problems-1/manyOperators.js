function manyOperators(num1,num2){
    let a=num1*num2;
    let b=a/num1;
    let result=b-num2;
    return result;
}
console.log(manyOperators(5, 10));
console.log(manyOperators(10, 5));