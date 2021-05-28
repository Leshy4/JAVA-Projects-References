import java.io.*;
import java.util.Scanner;

public class FileWorker {
    private static String CSV_EXTENSION = ".csv";
    private static String TXT_EXTENSION = ".txt";           // 1 = text, 2 = .csv
    private static WordArray wordArray;

    public FileWorker(WordArray wa){
        this.wordArray = wa;
    }

    public static void readFromTextFile(String fileName){
        try {
            Scanner in = new Scanner(new FileInputStream(fileName));         // <- Put filename
            String line;
            while (in.hasNextLine()) {
                line = in.nextLine();
                String[] wordsInSentence = line.split(" ");
                for(String word : wordsInSentence)
                    wordArray.addString(word);
            }
            in.close();
        }
        catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }

    public static void readFromCSVFile(String fileName){
        try {
            Scanner in = new Scanner(new FileInputStream(fileName));
            String line;
            while (in.hasNextLine()) {                  // Reads to the End
                line = in.nextLine();                   // Gets data from file
                String[] data = line.split(",");  // Split values by Commas    // HOLDS: [0] Word [1] Frequency
                String word = data[0];     // Assign [0] int to id      // Turns String id into int id
                int frequency = Integer.parseInt(data[1]);                  // Assign [1] String to name
                System.out.println(word + " - " + frequency);  // Print "id - name \n"
            }
            in.close();                                 // ALWAYS CLOSE FILE WHEN FINISHED  (Bugs & Security)
        }
        catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }

    public static void writeToTextFile(String fileName){
        try {
            PrintStream out = new PrintStream(new FileOutputStream(fileName));    // touch "data.txt"
            out.println("Wrothgar, Strength Level = 100");                        // Write Text
            out.println("Intelligence = 35");
            out.close();                                                                  // Close file
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }   // Not finished || used yet
                                    // // Log words & frequency into txt file to make a master after reading the words.

    public static void readFromMultipleTextFiles(String[] fileNames){
        for (String file : fileNames){
            readFromTextFile(file);
        }
    }

    public static void printFilePaths() throws IOException {
        File currentDirectory = new File(".");
        getAllFilesInDirectory(currentDirectory);
    }

    private static void getAllFilesInDirectory(File currentDirectory) throws IOException {
        File[] filesList = currentDirectory.listFiles();
        if(filesList != null)
            for (File file : filesList) {
                if (file.isDirectory())
                    System.out.println(file.getCanonicalPath());
                    getAllFilesInDirectory(file);
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
    }

}