const formatNumber=function(number)
{
    result=[];
    number=number.toString();
    number=number.split('.');
    while(number[0].length!=0)
    {
        result.unshift(number[0].slice(-3));
        number[0]=number[0].slice(0,-3);
    }
    return '$'+result.join(',')+'.'+number[1];
}
console.log(formatNumber(1234567.89))