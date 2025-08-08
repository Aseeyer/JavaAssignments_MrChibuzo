console.log("Numbers from one to 10: ");
let square = 1;
let squared = 1;
    for(number = 1; number <= 10; number++){
        if(number % 4 == 0 && number != 8){
	    for(loop = 0; loop < 5; loop++){
                square *= number;
                console.log(square)}
         }
    if(number % 4 == 0 && number != 4){
	    for(loop = 0; loop < 5; loop++){
                squared *= number;
                console.log(squared)}
         }

}