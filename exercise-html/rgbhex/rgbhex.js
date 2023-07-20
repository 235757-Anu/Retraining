const rgbBtn=document.getElementById("rgb");
const hexBtn=document.getElementById("hex");

const rgbRandom = function(){
    return `rgb(${Math.floor(Math.random()*256)},${Math.floor(Math.random()*256)},${Math.floor(Math.random()*256)})`;
}

const rgbClickHandler=function(event)
{
    document.body.style.backgroundColor = rgbRandom();
    rgbBtn.style.backgroundColor = rgbRandom();
    rgbBtn.style.color = rgbRandom();
}

const hexRandom = function(){
    let color="#";
    let list = "0123456789abcdef";
    for(let i=0;i<6;i++){
        color = color+list[Math.floor(Math.random()*list.length)];
    }
    return color;
}

const hexClickHandler=function(event)
{
    // #6664ff
    document.body.style.backgroundColor = hexRandom();
    hexBtn.style.backgroundColor = hexRandom();
    hexBtn.style.color = hexRandom();
}

const reload = function(event){
    rgbClickHandler();
    hexClickHandler();
}

document.addEventListener('DOMContentLoaded',reload)

rgbBtn.addEventListener('click',rgbClickHandler);
hexBtn.addEventListener('click',hexClickHandler);