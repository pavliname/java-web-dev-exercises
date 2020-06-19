package org.launchcode.java.studios.characterscounting;

import java.util.HashMap;
import java.util.Map;

public class CountingCharactersInString {
    public static void main (String[] args){

        // prompt the user for string
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your string: ");
//        String string=input.next();

        // All, Case Sensitive
        String string="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = string.toCharArray();

        HashMap<Character, Integer> counts = new HashMap<>();
        Character newCharacter;
        Integer newCount;
        for (char character:charactersInString){
            if (!counts.containsKey(character)){
                newCharacter=character;
                newCount=1;
                counts.put(newCharacter,newCount);
            } else {
                counts.put(character,counts.get(character)+1);
            }
        }
        System.out.println("Counting Characters in String: All, Case Sensitive");
        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }

        // All, Case Insensitive
        String caseInsensitiveString =string.toLowerCase();
        char[] charactersInCaseInsensitiveString = caseInsensitiveString.toCharArray();

        HashMap<Character, Integer> countsCI = new HashMap<>();
        Character newCharacterCI;
        Integer newCountCI;
        for (char character:charactersInCaseInsensitiveString){
            if (!countsCI.containsKey(character)){
                newCharacterCI=character;
                newCountCI=1;
                countsCI.put(newCharacterCI,newCountCI);
            } else {
                countsCI.put(character,countsCI.get(character)+1);
            }
        }
        System.out.println("Counting Characters in String: All, Case Insensitive");
        for (Map.Entry<Character, Integer> count : countsCI.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }

        // Non-alphabetic characters not counted, Case Insensitive
        String caseInsensitiveStringNA =string.toLowerCase();
        char[] charactersInCaseInsensitiveStringNA = caseInsensitiveStringNA.toCharArray();

        HashMap<Character, Integer> countsCINA = new HashMap<>();
        Character newCharacterCINA;
        Integer newCountCINA;
        for (char character:charactersInCaseInsensitiveStringNA){
            String regexString=Character.toString(character);
            if (regexString.matches("[a-z]")){
                if (!countsCINA.containsKey(character)) {
                    newCharacterCINA = character;
                    newCountCINA = 1;
                    countsCINA.put(newCharacterCINA, newCountCINA);
                } else {
                    countsCINA.put(character, countsCINA.get(character) + 1);
                }
            }
        }
        System.out.println("Counting Characters in String: Non-alphabetic characters not counted, Case Insensitive");
        for (Map.Entry<Character, Integer> count : countsCINA.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }

    }
}
