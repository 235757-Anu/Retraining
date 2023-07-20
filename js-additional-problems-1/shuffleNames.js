function shuffleNames(str){
    const Name=str.split(' ');
    const shuffleNames=Name.reverse().join(', ');
    return shuffleNames;
}
console.log(shuffleNames('Donald Trump'));
console.log(shuffleNames("Rosie O'Donnell"));