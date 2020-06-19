package exercises;

import java.util.Scanner;

public class MilesPerGallonCalculator {
    public static void main (String[] args) {
        Scanner milesInput=new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        int milesDriven=milesInput.nextInt();
        Scanner gasInput=new Scanner(System.in);
        System.out.println("Enter gas consumed (in gallons): ");
        int gasConsumed=gasInput.nextInt();
        milesInput.close();
        gasInput.close();
        int milesPerGallon = milesDriven/gasConsumed;
        System.out.println("Your miles-per-gallon ratio is: "+milesPerGallon);
    }
}
