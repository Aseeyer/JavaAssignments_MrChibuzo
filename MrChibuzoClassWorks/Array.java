import java.util.Scanner;

public class Array{
    public static void main(String[] args){
    Scanner arrayInput = new Scanner(System.in);
    System.out.println("Enter five scores: ");
    int[] scores = new int[5];

    for (int i = 0; i < 5; i++) {
        scores[i] = arrayInput.nextInt();
        }
  
  /*  scores[0] = arrayInput.nextInt();
    scores[1] = arrayInput.nextInt();
    scores[2] = arrayInput.nextInt();
    scores[3] = arrayInput.nextInt();
    scores[4] = arrayInput.nextInt(); */

    for(int i = 0; i < 5; i+=2){
        System.out.println(scores[i]);
            }  

        }
    }