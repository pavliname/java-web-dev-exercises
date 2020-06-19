package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args) {
        Integer[] array= {1, 1, 2, 3, 5, 8};
        // print out each value
        for (int i:array){
            System.out.println(i);
        }
        // print out odd numbers only
        for (int i:array){
            if (i%2==1) {
                System.out.println(i);
            }
        }
        // store words of a string in an array
        String string="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordsArray=string.split(" ");
        System.out.println(Arrays.toString(wordsArray));

        // store sentences of a string in an array
        String sentence="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentencesArray=sentence.split("\\.");
        System.out.println(Arrays.toString(sentencesArray));
    }
}
