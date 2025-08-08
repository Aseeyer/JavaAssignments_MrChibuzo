public class TaskFour{
    public static void main(String[] args){
    int squareMultiplier = 1;
    int sumMultiplier = 0;
    int square = 1;
    int sumSquare = 0;
	for(int number = 1; number <= 10; number++){
            if(number % 4 == 0 && number != 8){
                for(int loop = 0; loop < 5; loop++){
                    squareMultiplier *= number;
                    sumMultiplier += squareMultiplier;
                }System.out.print(sumMultiplier + " ");
            }
            if (number % 4 == 0 && number != 4){
                for(int loop = 0; loop < 5; loop++){
                    square *= number;
                    sumSquare += square;
                }System.out.print(sumSquare + " ");
            }
        }
    }
}