const addBtn = document.getElementById("todo");
const inputText = document.getElementById("add");
const list = document.getElementById("list")

const elimate = function(event){
    event.target.parentNode.remove();
}

const addContent =function (value)
{
    const items=document.createElement('div');
    const checkbox=document.createElement('input');
    checkbox.type='checkbox';

    checkbox.addEventListener('change',elimate)

    const task=document.createElement('label');

    task.innerText=value;

    items.appendChild(checkbox);
    items.appendChild(task);

    return items;
}

const addClick = function(event)
{
    event.preventDefault();
    list.appendChild(addContent(inputText.value));
    inputText.value="";
}

addBtn.addEventListener('click',addClick)