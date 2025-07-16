import java.util.Scanner;

public class TaxIncome{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter filing status, 0 if you are single, 1 for married
    filing jointly or qualified widower, 2 for filing seperately and 3 for
    head of household: ");
    int status = input.next();

    System.out.print("Enter taxable income: ");
    double taxableIncome = input.nextDouble();

    double tax = 0;

    if (status == 0){
        if (taxableIncome <= 8350){
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 82250)
                tax = 8350 * 10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 171550)
                tax = 8350 * 10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 8350 * 10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + 
                (taxableIncome - 171550) * 0.33;
            else 
                tax = 8350 * 10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + 
                (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
                }
         }

            else if (status == 1){
                if (taxableIncome <= 16700)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 67900)
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
            else if (taxableIncome <= 137050)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
            else if (taxableIncome <= 208850)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxableIncome - 137050)
                * 0.28;
            else if (taxableIncome <= 372950)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.28 + (208850 - 137050) * 0.33 + 
                (taxableIncome - 208850) * 0.33;
            else
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + 
                (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35

        }
            else if (status == 2){
                if (taxableIncome <= 8350){
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 68525)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 104425)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
            else if (taxableIncome <= 186475)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + 
                (taxableIncome - 104425) * 0.33;
            else 
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + 
                (186475 - 104426) * 0.33 + (taxableIncome - 186475) * 0.35;

        }
            else if (status == 3){
                if (taxableIncome <= 11950)
                    tax = taxableIncome * 0.10;
            else if (taxableIncome <= 45500)
                if (taxableIncome <= 117450)
                if (taxableIncome <= 190200)
                if (taxableIncome <= 372950)




    }else{
    System.out.print("invalid filing");
    }












    }
}