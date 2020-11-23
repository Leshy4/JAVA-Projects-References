

/**     JUST TEST CODE...   */

//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//public class JSoupTester1 {
//    {   //The connect(String url) method creates a new Connection, and get() fetches and parses a HTML file.
//        Document doc;   //Documents == HTML Document written to doc && doc can be parsed "Scraped"
//        // setting Doc as example.com
//    {
//        try {
//            doc = Jsoup.connect("http://example.com/").get();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//        static String setHTMLJobQuery(){
//        String html = "https://denver.craigslist.org/search/jjj?";    // set HTML to Local Craigslist for Job
//        System.out.println("What would you like to search for?\n\t\t\t");
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//        String[] input = scanner.delimiter().split(" ");
//        StringBuilder query = new StringBuilder("&query=");
//        for (int x = 0; x < input.length; ++x)
//            if (x == input.length - 1)
//                query.append(input[x]).append("&sort=rel");
//            else
//                query.append(input[x]).append("+");
//        html += query;
//        return html;
//    }
//            static void setDocument(){
//        try {
//            doc = Jsoup.connect("http://example.com")
//                    .data("query", "Java")
//                    .userAgent("Mozilla")
//                    .cookie("auth", "token")
//                    .timeout(3000)
//                    .post();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String title = doc.title();
//    }   // Set Doc == URL     (Sets Domain && Can Parse Later)
//    public static Document getDocument(){
//        //Document doc = Jsoup.parse(html);
//        return doc;
//    }
//
//    public static void parseHTML() {
//        // System.out.println(doc);    // Prints with all HTML Meta Elements == <head></head><body></body>
//        // Document doc = getDocument();
//
//        System.out.println("doc.getElementsByTag(\"title\") ====================");
//        System.out.println(doc.getElementsByTag("title")); // Grabs 'title' w/ HTML
//
//        System.out.println("\nSystem.out.println(doc.getElementsByTag(\"title\").get(0).text()); ====================");
//        System.out.println(doc.getElementsByTag("title").get(0).text()); // Grabs 'title' w/no HTML
//
//        System.out.println("\nSystem.out.println(doc.body()) ================== ");
//        System.out.println(doc.body()); //Parse Body ONLY
//    }
//    }
////     Bunch of code^^
//}
