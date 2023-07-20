function getSumOfPeopleBudget(arr){
    let sum=0;
    for(let i=0;i<arr.length;i++){
        sum=sum+arr[i].budget;
    }
    return sum;
}
console.log(getSumOfPeopleBudget([
    { name: "John", age: 21, budget: 23000 },
    { name: "Steve", age: 32, budget: 40000 },
    { name: "Martin", age: 16, budget: 2700 }
  ]));
console.log(getSumOfPeopleBudget([
    { name: "John", age: 21, budget: 29000 },
    { name: "Steve", age: 32, budget: 32000 },
    { name: "Martin", age: 16, budget: 1600 }
  ]));