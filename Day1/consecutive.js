// function readInput(){
//     const n = prompt("Enter the limit");
//     let arr=[];
//     for(let i=0;i<n;i++)
//     {
//         const arr[i]=prompt
//     }
// }

class CheckingForConsecutiveNumbersApp {
    readInput() {
      const input = prompt("Enter the numbers :");
      this.inputValidator(input);
    }
    inputValidator(input) {
      const numbers = input.trim().split(",");
      for (let i = 0; i < numbers.length; i++) {
        if (isNaN(numbers[i])) {
          console.log("Invalid input");
          return;
        }
      }
      const isConsecutive = this.checkForConsecutive(numbers);
      if (isConsecutive) {
        this.outputPrinter("Given numbers are Consecutive");
      } else {
        this.outputPrinter("Given numbers are not Consecutive");
      }
    }
    checkForConsecutive(numbers) {
      const sortedNumbers = numbers.sort((a, b) => a - b);
      for (let i = 1; i < sortedNumbers.length; i++) {
        if (sortedNumbers[i] - sortedNumbers[i - 1] !== 1) {
          return false;
        }
      }
      return true;
    }
    outputPrinter(output) {
      console.log(output);
    }
  }
  const app = new CheckingForConsecutiveNumbersApp();
  app.readInput();