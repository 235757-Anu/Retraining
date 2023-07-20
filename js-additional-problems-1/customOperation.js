function customOperation(num1,num2,op){
    let res;
    switch(op){
        case '+' : res=num1+num2;
                   break;
        case '-' : res=num1-num2;
                   break;
        case '*' : res=num1*num2;
                   break;
        case '/' : res=num1/num2;
                   break;
        case '%' : res=num1%num2;
                   break;   
        default :console.log("Invalid");
                 break;
    }
    return res;
}
console.log(customOperation(5, 10, '+'));
console.log(customOperation(10, 5, '-'));
console.log(customOperation(5, 10, '*'));
console.log(customOperation(10, 5, '/'));
console.log(customOperation(10, 5, '%'));