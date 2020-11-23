import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class JSoupTester2 {

    static void wikipediaSearchTest1() throws IOException {
/** String urlToScrape = "http://example.com/";
Document doc = Jsoup.connect(urlToScrape).get();    */
        System.out.println("\nType in your Wikipedia Query & hit Enter\t\t");
        String query = new String();
        Scanner userQuery = new Scanner(System.in);
        String url = "https://en.wikipedia.org/wiki/";
        query += userQuery.next();
        url += query;
        Document doc;
        doc = Jsoup.connect(url).get();
        String title = doc.title();
        System.out.println(title + " == title");
        System.out.println("Jsoup.parse(doc.body().html()).getElementsByTag(\"a\")");
        System.out.println(Jsoup.parse(doc.body().html()).getElementsByTag("a"));
        System.out.println("This doc.text() ==" + doc.text());
        //System.out.print("doc.body().getElementsByTag(\"a\")\t\t" + doc.body().getElementsByTag("a"));
    }

//    public JSoupTester2() throws IOException {
//        System.out.println("IO Exception");
//    }
}
