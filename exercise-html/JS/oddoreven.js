const oddOrEvenNumber=function(n)
{
    if(n%2==0)
    {
        return "Even";
    }
    else
    {
        return "Odd";
    }
}
console.log(oddOrEvenNumber(45));


const oddOrEvenArray=function(arrays)
{
    const res=[];
    for(let i=0;i<arrays.length;i++)
    {
        res.push(oddOrEvenNumber(arrays[i]));
    }
    return res;
}
console.log(oddOrEvenArray([1,2,3,4,5,6]));
