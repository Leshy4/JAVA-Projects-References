import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

import static org.jsoup.Jsoup.parse;

public class JSoupTester3{

    public static void someTest() throws IOException {
        System.out.println("Extract data text from HTML Document~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~EXTRACTING URLS");

        Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Web_Scraping").get();
        Elements links = doc.getElementsByTag("a");
        LinkedList<Element> urlList = new LinkedList<>();
        for (Element link : links) {
            System.out.println(link.attr("href"));
            System.out.println(link.text());
            urlList.add(link);
        }
        for (Element link : urlList) {
            System.out.println(link);
        }
    }

    public JSoupTester3() throws IOException {}
}
