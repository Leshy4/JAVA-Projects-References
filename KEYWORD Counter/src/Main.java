
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {                    // FINISHED CODE READS TXT & KEYWORD COUNTER
        WordArray wordArray = new WordArray();
        FileWorker fileWorker = new FileWorker(wordArray);

/** Uncomment line to print the group of .txt files to read (plus all in working directory) ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
//        fileWorker.printFilePaths();

//TODO  Add Multiple files to this section ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        String[] multipleFiles = {              // Files are stored in the Keyword Counter folder
                // "PutFileNameHEREtoReadIt.txt"
        };                                                                  // End of Multiple file List

        //  long startTime = System.currentTimeMillis();     // Benchmark time

        FileWorker.readFromMultipleTextFiles(multipleFiles);

        //  System.out.println(System.currentTimeMillis() - startTime + "ms" + " <- Nice!\n");  // Benchmark result

        wordArray.printValues(
                wordArray.getPrintQuantities()
        );

    }

}
