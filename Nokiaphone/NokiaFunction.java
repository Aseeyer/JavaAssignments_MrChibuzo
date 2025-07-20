import java.util.Scanner;

public class NokiaFunction {

    public static void phoneBookSection(Scanner input) {
        int phoneBookSelection;
        do {
            System.out.println("\nPhone Book Section:");
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
                case 0 -> System.out.println("Leaving PhoneBook Section...");
                case 1 -> System.out.println("You selected: Search");
                case 2 -> System.out.println("You selected: Service Nos.");
                case 3 -> System.out.println("You selected: Add Name");
                case 4 -> System.out.println("You selected: Erase");
                case 5 -> System.out.println("You selected: Edit");
                case 6 -> System.out.println("You selected: Assign Tone");
                case 7 -> System.out.println("You selected: Send B'Card");
                case 8 -> {
                    System.out.println("Options:");
                    System.out.println("1. Type of View");
                    System.out.println("2. Memory Status");
                    System.out.print("Enter a selection: ");
                    int optionsSelection = input.nextInt();
                    switch (optionsSelection) {
                        case 1 -> System.out.println("You selected: Type of View");
                        case 2 -> System.out.println("You selected: Memory Status");
                        default -> System.out.println("Invalid Options selection");
                    }
                }
                case 9 -> System.out.println("You selected: Speed Dials");
                case 10 -> System.out.println("You selected: Voice Tags");
                default -> System.out.println("Invalid Phone Book selection");
            }

        } while (phoneBookSelection != 0);
    }


    public static void messagesSection(Scanner input) {
    int messageSelection;
    do {
        System.out.println("\nMessages Section:");
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
            case 0 -> System.out.println("Bye From Messages...");
            case 1 -> System.out.println("You selected: Write Messages");
            case 2 -> System.out.println("You selected: Inbox");
            case 3 -> System.out.println("You selected: Outbox");
            case 4 -> System.out.println("You selected: Picture Messages");
            case 5 -> System.out.println("You selected: Templates");
            case 6 -> System.out.println("You selected: Smileys");
            case 7 -> {
                System.out.println("Message Settings:");
                System.out.println("1. Set 1");
                System.out.println("2. Common");
                System.out.print("Enter a selection: ");
                int settingSelection = input.nextInt();
                switch (settingSelection) {
                    case 1 -> {
                        System.out.println("Set 1:");
                        System.out.println("1. Message Centre Number");
                        System.out.println("2. Messages Sent As");
                        System.out.println("3. Message Validity");
                        System.out.print("Enter a selection: ");
                        int set1Selection = input.nextInt();
                        switch (set1Selection) {
                            case 1 -> System.out.println("You selected: Message Centre Number");
                            case 2 -> System.out.println("You selected: Messages Sent As");
                            case 3 -> System.out.println("You selected: Message Validity");
                            default -> System.out.println("Invalid Set 1 selection");
                        }
                    }
                    case 2 -> {
                        System.out.println("Common:");
                        System.out.println("1. Delivery Reports");
                        System.out.println("2. Reply via Same Centre");
                        System.out.println("3. Character Support");
                        System.out.print("Enter a selection: ");
                        int commonSelection = input.nextInt();
                        switch (commonSelection) {
                            case 1 -> System.out.println("You selected: Delivery Reports");
                            case 2 -> System.out.println("You selected: Reply via Same Centre");
                            case 3 -> System.out.println("You selected: Character Support");
                            default -> System.out.println("Invalid Common selection");
                        }
                    }
                    default -> System.out.println("Invalid Message Settings selection");
                }
            }
            case 8 -> System.out.println("You selected: Info Service");
            case 9 -> System.out.println("You selected: Voice Mailbox Number");
            case 10 -> System.out.println("You selected: Service Command Editor");
            default -> System.out.println("Invalid Messages selection");
        }

    } while (messageSelection != 0);
}


public static void callRegisterSection(Scanner input) {
    int callRegSelection;

    do {
        System.out.println("\nCall Register:");
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
            case 0 -> System.out.println("Leaving Call Register Section");
            case 1 -> System.out.println("You selected: Missed Calls");
            case 2 -> System.out.println("You selected: Received Calls");
            case 3 -> System.out.println("You selected: Dialed Numbers");
            case 4 -> System.out.println("You selected: Erase Recent Call Lists");
            case 5 -> {
                System.out.println("Show Call Duration:");
                System.out.println("1. Last Call Duration");
                System.out.println("2. All Calls' Duration");
                System.out.println("3. Received Calls' Duration");
                System.out.println("4. Dialed Calls' Duration");
                System.out.println("5. Clear Timers");
                System.out.print("Enter a selection: ");
                int durationSelection = input.nextInt();
                switch (durationSelection) {
                    case 1 -> System.out.println("You selected: Last Call Duration");
                    case 2 -> System.out.println("You selected: All Calls' Duration");
                    case 3 -> System.out.println("You selected: Received Calls' Duration");
                    case 4 -> System.out.println("You selected: Dialed Calls' Duration");
                    case 5 -> System.out.println("You selected: Clear Timers");
                    default -> System.out.println("Invalid Duration selection");
                }
            }
            case 6 -> {
                System.out.println("Show Call Costs:");
                System.out.println("1. Last Call Cost");
                System.out.println("2. All Calls' Cost");
                System.out.println("3. Clear Counters");
                System.out.print("Enter a selection: ");
                int costSelection = input.nextInt();
                switch (costSelection) {
                    case 1 -> System.out.println("You selected: Last Call Cost");
                    case 2 -> System.out.println("You selected: All Calls' Cost");
                    case 3 -> System.out.println("You selected: Clear Counters");
                    default -> System.out.println("Invalid Cost selection");
                }
            }
            case 7 -> {
                System.out.println("Call Cost Settings:");
                System.out.println("1. Call Cost Limit");
                System.out.println("2. Show Costs In");
                System.out.print("Enter a selection: ");
                int costSettingsSelection = input.nextInt();
                switch (costSettingsSelection) {
                    case 1 -> System.out.println("You selected: Call Cost Limit");
                    case 2 -> System.out.println("You selected: Show Costs In");
                    default -> System.out.println("Invalid Call Cost Settings selection");
                }
            }
            case 8 -> System.out.println("You selected: Prepaid Credit");
            default -> System.out.println("Invalid Call Register selection");
        }

    } while (callRegSelection != 0);
}


public static void tonesSection(Scanner input) {
    int tonesSelection;
    do {
        System.out.println("\nTones:");
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
            case 0 -> System.out.println("Leaving Tones Section...");
            case 1 -> System.out.println("You selected: Ringing Tone");
            case 2 -> System.out.println("You selected: Ringing Volume");
            case 3 -> System.out.println("You selected: Incoming Call Alert");
            case 4 -> System.out.println("You selected: Composer");
            case 5 -> System.out.println("You selected: Message Alert Tone");
            case 6 -> System.out.println("You selected: Keypad Tones");
            case 7 -> System.out.println("You selected: Warning and Game Tones");
            case 8 -> System.out.println("You selected: Vibrating Alert");
            case 9 -> System.out.println("You selected: Screen Saver");
            default -> System.out.println("Invalid Tones selection");
        }

    } while (tonesSelection != 0);
}


public static void settingsSection(Scanner input) {
    int settingsSelection;
    do {
        System.out.println("\nSettings:");
        System.out.println("1. Call Settings");
        System.out.println("2. Phone Settings");
        System.out.println("3. Security Settings");
        System.out.println("4. Restore Factory Settings");
        System.out.print("Enter a selection: ");
        settingsSelection = input.nextInt();

        switch (settingsSelection) {
            case 0 -> System.out.println("Leaving Settings Section...");
            case 1 -> {
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
                    case 1 -> System.out.println("You selected: Automatic Redial");
                    case 2 -> System.out.println("You selected: Speed Dialing");
                    case 3 -> System.out.println("You selected: Call Waiting Options");
                    case 4 -> System.out.println("You selected: Own Number Sending");
                    case 5 -> System.out.println("You selected: Phone Line in Use");
                    case 6 -> System.out.println("You selected: Automatic Answer");
                    default -> System.out.println("Invalid Call Settings selection");
                }
            }
            case 2 -> {
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
                    case 1 -> System.out.println("You selected: Language");
                    case 2 -> System.out.println("You selected: Cell Info Display");
                    case 3 -> System.out.println("You selected: Welcome Note");
                    case 4 -> System.out.println("You selected: Network Selection");
                    case 5 -> System.out.println("You selected: Lights");
                    case 6 -> System.out.println("You selected: Confirm SIM Service Actions");
                    default -> System.out.println("Invalid Phone Settings selection");
                }
            }
            case 3 -> {
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
                    case 1 -> System.out.println("You selected: PIN Code Request");
                    case 2 -> System.out.println("You selected: Call Barring Service");
                    case 3 -> System.out.println("You selected: Fixed Dialing");
                    case 4 -> System.out.println("You selected: Closed User Group");
                    case 5 -> System.out.println("You selected: Phone Security");
                    case 6 -> System.out.println("You selected: Change Access Codes");
                    default -> System.out.println("Invalid Security Settings selection");
                }
            }
            case 4 -> System.out.println("You selected: Restore Factory Settings");
            default -> System.out.println("Invalid Settings selection");
        }

    } while (settingsSelection != 0);
}


public static void clockSection(Scanner input) {
    int clockSelection;
    do {
        System.out.println("\nClock:");
        System.out.println("1. Alarm Clock");
        System.out.println("2. Clock Settings");
        System.out.println("3. Date Setting");
        System.out.println("4. Stopwatch");
        System.out.println("5. Countdown Timer");
        System.out.println("6. Auto Update of Date and Time");
        System.out.print("Enter a selection: ");
        clockSelection = input.nextInt();

        switch (clockSelection) {
            case 0 -> System.out.println("Leaving Clock Section...");
            case 1 -> System.out.println("You selected: Alarm Clock");
            case 2 -> System.out.println("You selected: Clock Settings");
            case 3 -> System.out.println("You selected: Date Setting");
            case 4 -> System.out.println("You selected: Stopwatch");
            case 5 -> System.out.println("You selected: Countdown Timer");
            case 6 -> System.out.println("You selected: Auto Update of Date and Time");
            default -> System.out.println("Invalid Clock selection");
        }
    } while (clockSelection != 0);
}















}
