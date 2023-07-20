
let orderArray = '[{"pId": 1200,"unitCost": 50,"Quantity": 2},{"pId": 1232,"unitCost": 30,"Quantity": 4}]';

function finalPrice(orderArray){
    // code here
    let total=0;
    const orderString = JSON.parse(orderArray);
    for(let i=0;i<orderString.length;i++)
    {
        total+=orderString[i].unitCost * orderString[i].Quantity;
    }
    return total;
}

console.log(finalPrice(orderArray));
 
