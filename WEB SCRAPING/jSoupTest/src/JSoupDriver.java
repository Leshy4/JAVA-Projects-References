import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class JSoupDriver {
    public static void main(String[] args) throws IOException {
        {
        {
            System.out.println("0. GOOD Jsoup VIDEO ==>\t  https://www.youtube.com/watch?v=wzh5TCVnWZQ");
            System.out.println("0. REFERENCE (A Lil Dated) ==>\t  https://jsoup.org/cookbook/\n");
            System.out.println("1. RETRIEVE .jar file @\t    https://jsoup.org/download");
            System.out.println("2. PUT jsoup-1.13.1.jar file into a Directory inside the Package");
            System.out.println("3. import org.jsoup.*  &&   import org.jsoup.nodes.Document   to use HTML Parser\n");
        }   // Printed Steps of using JSoup
        //        JSoupTester tester = new JSoupTester();
//        tester.setDocument();
//        System.out.println("\n\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~HTML PARSING IN PROGRESS Document doc ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
//        tester.parseHTML();    }
        }
        System.out.println("This is a test on how to Scrape Wikipedia for Hyperlinks" +
                "\nCan be used to figure out the Main Keywords for a subject/query"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // JSoupTester1.doSomething(); //Mostly notes
        // JSoupTester2.wikipediaSearchTest1();  //Dynamic Query for Wikipedia
        // JSoupTester3.someTest();     //Gets all Hyperlinks->"a href"s from specified page
        // JSoupTester4.test7();        //Use selector-syntax to find elements

        // JsoupTester8.test8();        //Extract attributes, text, and HTML from elements
        // JsoupTester9.test9();        //Working with URLs

        JsoupTester10.test10();      //Example program: list links   // Used Loop for Duplicate & Unique Values

    }
}