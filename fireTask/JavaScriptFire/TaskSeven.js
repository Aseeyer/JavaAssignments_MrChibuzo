console.log("Numbers from one to 10: ");
let square = 1;
let sumSquare = 0;
let squared = 1;
let sumSquared = 0;

    for(number = 1; number <= 10; number++){
        if(number % 4 == 0 && number != 8){
	    for(loop = 0; loop < 5; loop++){
                square *= number;
                sumSquare += square
         }console.log(sumSquare)}

    if(number % 4 == 0 && number != 4){
	    for(loop = 0; loop < 5; loop++){
                squared *= number;
                sumSquared += squared
         }console.log(sumSquared)}

}