const afterNYears=(array,n)=>{
    for (let i=0;i<array.length;i++){
        array[i].age+=n;
    }
    return array;
}
console.log(afterNYears([
{
    name:"Joel",
    age:32
},
{
    name:"Fred",
    age:44
}
],2));