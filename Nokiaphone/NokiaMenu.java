import java.util.Scanner;

public class NokiaMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int userSelection;

    do {
        System.out.println("""

              Welcome To Nokia 3310 Main Menu      
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
                int phoneBookSelection;
            do {
                System.out.println("""

                    Phone Book Section:   """);
                System.out.println(" 1. Search");
                System.out.println(" 2. Service Nos.");
                System.out.println(" 3. Add Name");
                System.out.println(" 4. Erase");
                System.out.println(" 5. Edit");
                System.out.println(" 6. Assign Tone");
                System.out.println(" 7. Send B'Card");
                System.out.println(" 8. Options");
                System.out.println(" 9. Speed Dials");
                System.out.println("10. Voice Tags");
                System.out.print("Enter a selection: ");

                phoneBookSelection = input.nextInt();
                switch (phoneBookSelection) {
                    case 0: System.out.println("Leaving PhoneBook Section..."); break;
                    case 1: System.out.println("You selected: Search"); break;
                    case 2: System.out.println("You selected: Service Nos."); break;
                    case 3: System.out.println("You selected: Add Name"); break;
                    case 4: System.out.println("You selected: Erase"); break;
                    case 5: System.out.println("You selected: Edit"); break;
                    case 6: System.out.println("You selected: Assign Tone"); break;
                    case 7: System.out.println("You selected: Send B'Card"); break;
                    case 8:
                        System.out.println("Options:");
                        System.out.println("1. Type of View");
                        System.out.println("2. Memory Status");
                        System.out.print("Enter a selection: ");
                        int optionsSelection = input.nextInt();
                        switch (optionsSelection) {
                            case 1: System.out.println("You selected: Type of View"); break;
                            case 2: System.out.println("You selected: Memory Status"); break;
                            default: System.out.println("Invalid Options selection"); break;
                        }
                        break;
                    case 9: System.out.println("You selected: Speed Dials"); break;
                    case 10: System.out.println("You selected: Voice Tags"); break;
                    default: System.out.println("Invalid Phone Book selection");
                }
                 System.out.println("""   

                                               """);
               }while (phoneBookSelection != 0);
                break;

            case 2:
                int messageSelection;
            do {
                System.out.println("Messages Section:");
                System.out.println(" 1. Write Messages");
                System.out.println(" 2. Inbox");
                System.out.println(" 3. Outbox");
                System.out.println(" 4. Picture Messages");
                System.out.println(" 5. Templates");
                System.out.println(" 6. Smileys");
                System.out.println(" 7. Message Settings");
                System.out.println(" 8. Info Service");
                System.out.println(" 9. Voice Mailbox Number");
                System.out.println("10. Service Command Editor");
                System.out.print("Enter a selection: ");

                messageSelection = input.nextInt();
          
                switch (messageSelection) {
                    case 0: System.out.println("Bye From Messages..."); break;
                    case 1: System.out.println("You selected: Write Messages"); break;
                    case 2: System.out.println("You selected: Inbox"); break;
                    case 3: System.out.println("You selected: Outbox"); break;
                    case 4: System.out.println("You selected: Picture Messages"); break;
                    case 5: System.out.println("You selected: Templates"); break;
                    case 6: System.out.println("You selected: Smileys"); break;
                    case 7:
                        System.out.println("Message Settings:");
                        System.out.println("1. Set 1");
                        System.out.println("2. Common");
                        System.out.print("Enter a selection: ");
                        int settingSelection = input.nextInt();
                        switch (settingSelection) {
                            case 1:
                                System.out.println("Set 1:");
                                System.out.println("1. Message Centre Number");
                                System.out.println("2. Messages Sent As");
                                System.out.println("3. Message Validity");
                                System.out.print("Enter a selection: ");
                                int set1Selection = input.nextInt();
                                switch (set1Selection) {
                                    case 1: System.out.println("You selected: Message Centre Number"); break;
                                    case 2: System.out.println("You selected: Messages Sent As"); break;
                                    case 3: System.out.println("You selected: Message Validity"); break;
                                    default: System.out.println("Invalid Set 1 selection"); break;
                                }
                                break;
                            case 2:
                                System.out.println("Common:");
                                System.out.println("1. Delivery Reports");
                                System.out.println("2. Reply via Same Centre");
                                System.out.println("3. Character Support");
                                System.out.print("Enter a selection: ");
                                int commonSelection = input.nextInt();
                                switch (commonSelection) {
                                    case 1: System.out.println("You selected: Delivery Reports"); break;
                                    case 2: System.out.println("You selected: Reply via Same Centre"); break;
                                    case 3: System.out.println("You selected: Character Support"); break;
                                    default: System.out.println("Invalid Common selection"); break;
                                }
                                break;
                            default: System.out.println("Invalid Message Settings selection"); break;
                        }
                        break;
                    case 8: System.out.println("You selected: Info Service"); break;
                    case 9: System.out.println("You selected: Voice Mailbox Number"); break;
                    case 10: System.out.println("You selected: Service Command Editor"); break;
                    default: System.out.println("Invalid Messages selection");
                }
                System.out.println(""" 

                                         """);
                }while (messageSelection != 0);
                break;

            case 3:
                System.out.println("You selected: Chat");
                break;

            case 4:
                int callRegSelection;

             do {
                System.out.println("Call Register:");
                System.out.println("1. Missed Calls");
                System.out.println("2. Received Calls");
                System.out.println("3. Dialed Numbers");
                System.out.println("4. Erase Recent Call Lists");
                System.out.println("5. Show Call Duration");
                System.out.println("6. Show Call Costs");
                System.out.println("7. Call Cost Settings");
                System.out.println("8. Prepaid Credit");
                System.out.print("Enter a selection: ");

                callRegSelection = input.nextInt();

                switch (callRegSelection) {
                    case 0: System.out.println("Leaving Call Registration Section"); break;
                    case 1: System.out.println("You selected: Missed Calls"); break;
                    case 2: System.out.println("You selected: Received Calls"); break;
                    case 3: System.out.println("You selected: Dialed Numbers"); break;
                    case 4: System.out.println("You selected: Erase Recent Call Lists"); break;
                    case 5:
                        System.out.println("Show Call Duration:");
                        System.out.println("1. Last Call Duration");
                        System.out.println("2. All Calls' Duration");
                        System.out.println("3. Received Calls' Duration");
                        System.out.println("4. Dialed Calls' Duration");
                        System.out.println("5. Clear Timers");
                        System.out.print("Enter a selection: ");
                        int durationSelection = input.nextInt();
                        switch (durationSelection) {
                            case 1: System.out.println("You selected: Last Call Duration"); break;
                            case 2: System.out.println("You selected: All Calls' Duration"); break;
                            case 3: System.out.println("You selected: Received Calls' Duration"); break;
                            case 4: System.out.println("You selected: Dialed Calls' Duration"); break;
                            case 5: System.out.println("You selected: Clear Timers"); break;
                            default: System.out.println("Invalid Duration selection"); break;
                        }
                        break;
                    case 6:
                        System.out.println("Show Call Costs:");
                        System.out.println("1. Last Call Cost");
                        System.out.println("2. All Calls' Cost");
                        System.out.println("3. Clear Counters");
                        System.out.print("Enter a selection: ");
                        int costSelection = input.nextInt();
                        switch (costSelection) {
                            case 1: System.out.println("You selected: Last Call Cost"); break;
                            case 2: System.out.println("You selected: All Calls' Cost"); break;
                            case 3: System.out.println("You selected: Clear Counters"); break;
                            default: System.out.println("Invalid Cost selection"); break;
                        }
                        break;
                    case 7:
                        System.out.println("Call Cost Settings:");
                        System.out.println("1. Call Cost Limit");
                        System.out.println("2. Show Costs In");
                        System.out.print("Enter a selection: ");
                        int costSettingsSelection = input.nextInt();
                        switch (costSettingsSelection) {
                            case 1: System.out.println("You selected: Call Cost Limit"); break;
                            case 2: System.out.println("You selected: Show Costs In"); break;
                            default: System.out.println("Invalid Call Cost Settings selection"); break;
                        }
                        break;
                    case 8: System.out.println("You selected: Prepaid Credit"); break;
                    default: System.out.println("Invalid Call Register selection"); break;
                }
                  System.out.print("""   
                            
                                         """);

            }while (callRegSelection !=0);
                break;

            case 5:
                int tonesSelection;
            do {
                System.out.println("""

                                       Tones:""");
                System.out.println("1. Ringing Tone");
                System.out.println("2. Ringing Volume");
                System.out.println("3. Incoming Call Alert");
                System.out.println("4. Composer");
                System.out.println("5. Message Alert Tone");
                System.out.println("6. Keypad Tones");
                System.out.println("7. Warning and Game Tones");
                System.out.println("8. Vibrating Alert");
                System.out.println("9. Screen Saver");
                System.out.print("Enter a selection: ");
                tonesSelection = input.nextInt();
                switch (tonesSelection) {
                    case 0: System.out.println("Leaving Tones Section..."); break;
                    case 1: System.out.println("You selected: Ringing Tone"); break;
                    case 2: System.out.println("You selected: Ringing Volume"); break;
                    case 3: System.out.println("You selected: Incoming Call Alert"); break;
                    case 4: System.out.println("You selected: Composer"); break;
                    case 5: System.out.println("You selected: Message Alert Tone"); break;
                    case 6: System.out.println("You selected: Keypad Tones"); break;
                    case 7: System.out.println("You selected: Warning and Game Tones"); break;
                    case 8: System.out.println("You selected: Vibrating Alert"); break;
                    case 9: System.out.println("You selected: Screen Saver"); break;
                    default: System.out.println("Invalid Tones selection"); break;
                }
	    }while (tonesSelection != 0);
                break;

            case 6:
                int settingsSelection;

            do {
                System.out.println("""

                                       Settings:""");
    		System.out.println("1. Call Settings");
    		System.out.println("2. Phone Settings");
    		System.out.println("3. Security Settings");
    		System.out.println("4. Restore Factory Settings");
    		System.out.print("Enter a selection: ");
    		settingsSelection = input.nextInt();

    		switch (settingsSelection) {
                    case 0: System.out.println("Leaving Setting Section"); break;
        	    case 1:
            		System.out.println("Call Settings:");
            		System.out.println("1. Automatic Redial");
            		System.out.println("2. Speed Dialing");
            		System.out.println("3. Call Waiting Options");
            		System.out.println("4. Own Number Sending");
            		System.out.println("5. Phone Line in Use");
            		System.out.println("6. Automatic Answer");
            		System.out.print("Enter a selection: ");
            		int callSettingsSelection = input.nextInt();

            	        switch (callSettingsSelection) {
                            case 1: System.out.println("You selected: Automatic Redial"); break;
                            case 2: System.out.println("You selected: Speed Dialing"); break;
                            case 3: System.out.println("You selected: Call Waiting Options"); break;
                            case 4: System.out.println("You selected: Own Number Sending"); break;
                            case 5: System.out.println("You selected: Phone Line in Use"); break;
                            case 6: System.out.println("You selected: Automatic Answer"); break;
                            default: System.out.println("Invalid Call Settings Selection"); break;
                 }
                 break;

        	    case 2:
            		System.out.println("Phone Settings:");
            		System.out.println("1. Language");
            		System.out.println("2. Cell Info Display");
            		System.out.println("3. Welcome Note");
            		System.out.println("4. Network Selection");
            		System.out.println("5. Lights");
            		System.out.println("6. Confirm SIM Service Actions");
            		System.out.print("Enter a selection: ");
            		int phoneSettingsSelection = input.nextInt();

                        switch (phoneSettingsSelection) {
                    	    case 1: System.out.println("You selected: Language"); break;
                            case 2: System.out.println("You selected: Cell Info Display"); break;
                            case 3: System.out.println("You selected: Welcome Note"); break;
                            case 4: System.out.println("You selected: Network Selection"); break;
                            case 5: System.out.println("You selected: Lights"); break;
                            case 6: System.out.println("You selected: Confirm SIM Service Actions"); break;
                            default: System.out.println("Invalid Phone Settings Selection"); break;
                }
                break;

        	   case 3:
            		System.out.println("Security Settings:");
            		System.out.println("1. PIN Code Request");
            		System.out.println("2. Call Barring Service");
            		System.out.println("3. Fixed Dialing");
            		System.out.println("4. Closed User Group");
            		System.out.println("5. Phone Security");
            		System.out.println("6. Change Access Codes");
            		System.out.print("Enter a selection: ");
            		int securitySettingsSelection = input.nextInt();

                        switch (securitySettingsSelection) {
                            case 1: System.out.println("You selected: PIN Code Request"); break;
                    	    case 2: System.out.println("You selected: Call Barring Service"); break;
                    	    case 3: System.out.println("You selected: Fixed Dialing"); break;
                    	    case 4: System.out.println("You selected: Closed User Group"); break;
                    	    case 5: System.out.println("You selected: Phone Security"); break;
                   	    case 6: System.out.println("You selected: Change Access Codes"); break;
                   	    default: System.out.println("Invalid Security Settings Selection"); break;
                }
                break;

        	    case 4:
            		System.out.println("You selected: Restore Factory Settings"); break;

            default:
                System.out.println("Invalid Settings Selection");
               break;
	    }
	} while (settingsSelection != 0);
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
                int clockSelection;
            do {
    		System.out.println("Clock:");
    		System.out.println("1. Alarm Clock");
    		System.out.println("2. Clock Settings");
    		System.out.println("3. Date Setting");
    		System.out.println("4. Stopwatch");
    		System.out.println("5. Countdown Timer");
    		System.out.println("6. Auto Update of Date and Time");
    		System.out.print("Enter a selection: ");
    		clockSelection = input.nextInt();

    		switch (clockSelection) {
                    case 0: System.out.println("Leaving Clock Section"); break;
            	    case 1: System.out.println("You selected: Alarm Clock"); break;
            	    case 2: System.out.println("You selected: Clock Settings"); break;
                    case 3: System.out.println("You selected: Date Setting"); break;
                    case 4: System.out.println("You selected: Stopwatch"); break;
                    case 5: System.out.println("You selected: Countdown Timer"); break;
                    case 6: System.out.println("You selected: Auto Update of Date and Time"); break;
                    default: System.out.println("Invalid Clock Selection"); break;
            }
	} while (clockSelection != 0);
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
