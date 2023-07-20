function shortestWord(arr){
    let shortest=arr[0];
    for(let i=0;i<arr.length;i++){
        if(arr[i].length<=shortest.length)
        {
            shortest=arr[i];
        }
    }
    return shortest;
}
console.log(shortestWord(['hello', 'world', 'this', 'is', 'a', 'test']));
console.log(shortestWord(['hello', 'world', 'this', 'is', 'test', 'of', 'the', 'shortest', 'word']));