const s1="helloworld";
const s2="world";

const findString = (s1,s2) => {
   return s1.toUpperCase().includes(s2.toUpperCase());
}

console.log(findString(s1,s2));