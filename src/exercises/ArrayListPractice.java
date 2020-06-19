package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main (String[] args) {

        // prompt user for the desired word length
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length: ");
        int wordLength=input.nextInt();

        // sum even numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        System.out.println(ArrayListPractice.findEvenNumsSum(numbers));

        // print out 5-word letters
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Spring");
        words.add("Python");
        words.add("MSSQL");
        words.add("Mongo");
        words.add("HTML");
        ArrayList<String> fiveLetterWordsResult=ArrayListPractice.printEach5LetterWord(words);
        for (String word:fiveLetterWordsResult){
            System.out.println(word);
        }

        // print out words of desired length
        ArrayList<String> desiredLengthWordsResult=ArrayListPractice.printEachDesiredLengthWord(words, wordLength);
        for (String word:desiredLengthWordsResult){
            System.out.println(word);
        }

        // use String of words
        String string="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] removedCommasArray=string.split(",");
        String removedCommasString= Arrays.toString(removedCommasArray);
        String[] array= removedCommasString.split(" ");
        List<String> list= Arrays.asList(array);
        ArrayList<String> arrayList=new ArrayList<String>(list);
        // 5-letter words;
        ArrayList<String> fiveLetterWordsResultGivenArrayList=ArrayListPractice.printEach5LetterWord(arrayList);
        for (String stringWord:fiveLetterWordsResultGivenArrayList){
            System.out.println(stringWord);
        }
        // desired length
        ArrayList<String> desiredLengthWordsResultGivenArrayList=ArrayListPractice.printEachDesiredLengthWord(arrayList, wordLength);
        for (String stringWord:desiredLengthWordsResultGivenArrayList){
            System.out.println(stringWord);
        }
    }
        private static int findEvenNumsSum(ArrayList<Integer> numbers){
            int sum=0;
            for (int num:numbers){
                if (num%2==0){
                    sum+=num;
                }
            }
            return sum;
        }

        private static ArrayList<String> printEach5LetterWord(ArrayList<String> words){
        ArrayList<String> fiveLetterWords=new ArrayList<>();
        for (String word:words){
            if (word.length()==5){
                fiveLetterWords.add(word);
            }
        }
        return fiveLetterWords;
        }

    private static ArrayList<String> printEachDesiredLengthWord(ArrayList<String> words, int wordLength){
        ArrayList<String> desiredLengthWords=new ArrayList<>();
        for (String word:words){
            if (word.length()==wordLength){
                desiredLengthWords.add(word);
            }
        }
        return desiredLengthWords;
    }
}
