
import java.util.Scanner;

public class WordArray {

    private final int ALPHABET_LENGTH = 26;
    private WordNode twoLetterListNodeHead = null;
    private WordNode twoLetterListNodeTail = twoLetterListNodeHead;
    private int uniqueWords2;
    private int uniqueWords3;

    private WordNode[][][] wordArray = new WordNode[ALPHABET_LENGTH][ALPHABET_LENGTH][ALPHABET_LENGTH];

    public void addString(String word){
        int wordLength = word.length();

        if(wordLength == 2 && word.equals(word.toUpperCase())) {
            if(twoLetterListNodeHead == null){
                twoLetterListNodeHead = new WordNode(word);
                twoLetterListNodeTail = twoLetterListNodeHead;
            }
            else{
                WordNode traversalNode = twoLetterListNodeHead;

                while(traversalNode != null){
                    if(traversalNode.getWord().equals(word)){
                        traversalNode.incrementWordCount();
                        return;
                    }
                    traversalNode = traversalNode.getNext();
                }

                WordNode newWord = new WordNode(word);
                twoLetterListNodeTail.setNext(newWord);
                twoLetterListNodeTail = newWord;
            }
            ++uniqueWords2;
            return;
        } // Adds Uppercase words to twoLetterList

        StringBuilder lettersOnly = new StringBuilder();
        int letterChecker;
        int numberOfLetters = 0;
        String lowerCaseWord = word.toLowerCase();

        for (int i = 0; i < wordLength; ++i){
            letterChecker = lowerCaseWord.charAt(i) - 'a';
            if(letterChecker >= 0 && letterChecker < ALPHABET_LENGTH){
                lettersOnly.append(word.charAt(i));
                ++numberOfLetters;
            }
        }   //Makes word letters only

        wordLength = numberOfLetters;
        word = lettersOnly.toString();

        if(wordLength >= 3) {
            lowerCaseWord = word.toLowerCase();
        }
        else
            return;
        // TODO: Check if Common Word & exclude if so
        /* if( commonWords.contains(word) return ) */

        WordNode newWordNode = new WordNode(word);
        int firstChar = lowerCaseWord.charAt(0)  - 'a';       // 0-25 Values
        int secondChar = lowerCaseWord.charAt(1) - 'a';
        int thirdChar =  lowerCaseWord.charAt(2) - 'a';

        if(wordArray[firstChar][secondChar][thirdChar] == null) {
            wordArray[firstChar][secondChar][thirdChar] = newWordNode;
            ++uniqueWords3;
            return;
        }   // if empty, add there
        else {
            WordNode temp = wordArray[firstChar][secondChar][thirdChar];
            if(temp.getWord().toLowerCase().equals(lowerCaseWord) ||
                    temp.getWord().equals(word)) {
                temp.incrementWordCount();
                return;
            }
            else{
                while(temp != null) {
                    if(temp.getWord().equals(word) ||
                            temp.getWord().toLowerCase().equals(lowerCaseWord)) {
                        temp.incrementWordCount();
                        return;
                    }
                    else if(temp.getNext() == null){
                        temp.setNext(newWordNode);
                        ++uniqueWords3;
                        return;
                    }
                    else
                        temp = temp.getNext();
                }
            }
        }                                                      // else search linear chain of values
    }   

    public void printValues(int howManyTimes){      // PRINTED Lexicographically, if within Word Frequency Bounds
        if(howManyTimes < 1)
            return;
        int WORDS_UNTIL_NEW_LINE = 6;

        Scanner getParams = new Scanner(System.in);
        System.out.println("Minimum Word Frequency? ");
        int minimumFrequency = getParams.nextInt();
        getParams.nextLine();   // Clear Buffer
        System.out.println("Maximum Word Frequency? ");
        int maximumFrequency = getParams.nextInt();
        getParams.nextLine();   // Clear Buffer

            // Print twoLetterList      // Doesn't need to be Lexicographical Order & prints odd combos
        if(twoLetterListNodeHead != null){
            int wordsPrinted = 0;
            System.out.printf("\n~~~~~~~~~~~~~~~2 Letter List [%d]: ~~~~~~~~~~~~~~~~~~~~\n", uniqueWords2);   // Prints wordArray[][][] Lexicographically
            int formattingIterator = 1;

            WordNode traversalNode = twoLetterListNodeHead;

            while(traversalNode != null){
                if(minimumFrequency <= traversalNode.getWordCount()
                && maximumFrequency >= traversalNode.getWordCount()) {
                    if (formattingIterator % WORDS_UNTIL_NEW_LINE == 0)
                        System.out.println(traversalNode.getWord() + " - " + traversalNode.getWordCount());
                    else
                        System.out.print(traversalNode.getWord() + " - " + traversalNode.getWordCount() + "\t\t");

                    ++wordsPrinted;
                    ++formattingIterator;
                }
                traversalNode = traversalNode.getNext();
            }
            System.out.printf("~~~~~~~~~~~~~~~2 Letter WORDS PRINTED %d\n", wordsPrinted);
        }

        // Print WordArray
        if(wordArray != null) {
            int wordsPrinted = 0;
            System.out.printf("\n~~~~~~~~~~~~~~~~~~~~WORD ARRAY [%d]: ~~~~~~~~~~~~~~~~~~~~\n", uniqueWords3);   // Prints wordArray[][][] Lexicographically
            int formatIter = 1;
            WordNode travNode = null;
            for (int first = 0; first < ALPHABET_LENGTH; ++first) {
                for (int second = 0; second < ALPHABET_LENGTH; ++second) {
                    for (int third = 0; third < ALPHABET_LENGTH; ++third) {

                        if (wordArray[first][second][third] != null) {
                            travNode = wordArray[first][second][third];

                            while (travNode != null) {
                                if(minimumFrequency <= travNode.getWordCount()
                                        && maximumFrequency >= travNode.getWordCount()) {
                                    if (formatIter % WORDS_UNTIL_NEW_LINE == 0) {
                                        System.out.println(travNode.getWord() + " - " + travNode.getWordCount());
                                    } else {
                                        System.out.print(travNode.getWord() + " - " + travNode.getWordCount() + "\t\t");
                                    }
                                    ++wordsPrinted;
                                    ++formatIter;
                                }
                                travNode = travNode.getNext();
                            }

                        }

                    }
                }
            }
            System.out.printf("\n\n~~~~~~~~~~~~~~~WORDS PRINTED %d\n", wordsPrinted);
        }

        --howManyTimes;

        if(howManyTimes > 0) {
            printValues(howManyTimes);
        }
        else{
            int inputInt = getPrintQuantities();
            if(inputInt > 0) {
                printValues(inputInt);
                return;
            }
            else{
                System.out.println("Thanks!!");
                return;
            }
        }
    }

    public int getPrintQuantities() {
        System.out.println("How many Sets of Values do you want to print?");
        Scanner getQuantities = new Scanner(System.in);
        int setQuantities = getQuantities.nextInt();

        if (setQuantities < 1)
            return 0;
        else if (setQuantities > 10){
            System.out.println("\nThat's too many, lets do 10 instead =)\n");
            return 10;
        }
        else
            return setQuantities;
    }

}
