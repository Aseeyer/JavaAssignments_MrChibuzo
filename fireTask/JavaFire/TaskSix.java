public class TaskFour{
    public static void main(String[] args){
    int squareMultiplier = 1;
    int square = 1;
	for(int number = 1; number <= 10; number++){
            if(number % 4 == 0 && number != 8){
                for(int loop = 0; loop < 5; loop++){
                    squareMultiplier *= number;
		    System.out.print(squareMultiplier + " ");}
            }
            if (number % 4 == 0 && number != 4){
                for(int loop = 0; loop < 5; loop++){
                    square *= number;
		    System.out.print(square + " ");}
            }
        }
    }
}