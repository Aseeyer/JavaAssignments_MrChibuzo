import java.util.Scanner;

public class Nokia3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int userSelection;

    do {
        System.out.println("""

              Welcome!! To Nokia 3310 Main Menu      
                               """);
        System.out.println(" 1. Phone book");
        System.out.println(" 2. Messages");
        System.out.println(" 3. Chat");
        System.out.println(" 4. Call Register");
        System.out.println(" 5. Tones");
        System.out.println(" 6. Settings");
        System.out.println(" 7. Call Divert");
        System.out.println(" 8. Games");
        System.out.println(" 9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM Services");
        System.out.println("""  
                                Press 0 to exit menu""");

        System.out.print("Enter a number of your choice: ");
        userSelection = input.nextInt();

        switch (userSelection) {
            case 0: System.out.println("See You Later..."); break;

            case 1:
   	         NokiaFunction.phoneBookSection(input);
   		 break;


            case 2:
    		 NokiaFunction.messagesSection(input);
    		 break;


            case 3:
                System.out.println("You selected: Chat");
                break;

            case 4:
    		 NokiaFunction.callRegisterSection(input);
   		 break;


            case 5:
    		 NokiaFunction.tonesSection(input);
   		 break;


            case 6:
    		 NokiaFunction.settingsSection(input);
    		 break;

       
            case 7:
                System.out.println("You selected: Call Divert"); break;

            case 8:
                System.out.println("You selected: Games"); break;
            case 9:
                System.out.println("You selected: Calculator"); break;
            case 10:
                System.out.println("You selected: Reminder"); break;

            case 11:
    		 NokiaFunction.clockSection(input);
    		 break;


            case 12:
    		System.out.println("You selected: Profiles"); break;

	    case 13:
    		System.out.println("You selected: SIM Services"); break;


            default:
                System.out.println("Invalid Main Menu selection");
                break;
      
         }
          System.out.println("""     


                                     """);

        } while (userSelection != 0);
      
    }
}