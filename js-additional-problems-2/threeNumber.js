const threeNumber=(n)=>{
    let array=[];
    while (n!=1){
        array.push(n);
        if (n%2==0)
            n=n/2;
        else
            n=(n*3)+1;
    }
    array.push(n);
    let array1=array.toString();
    return array1;
}
console.log(threeNumber(22));