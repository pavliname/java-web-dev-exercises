package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IDHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> records = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newName;

        System.out.println("Enter your record (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Name: ");
            newName = input.nextLine();

            if (!newName.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                records.put(newID, newName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newName.equals(""));

        // Print roster
        System.out.println("\nRecord roster:");

        for (Map.Entry<Integer, String> record : records.entrySet()) {
            System.out.println(record.getKey() + " (" + record.getValue() + ")");
        }
    }
}
