import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class JsoupTester9 {
    Document doc = Jsoup.connect("http://jsoup.org").get();

    Element link = doc.select("a").first();
    String relHref = link.attr("href"); // == "/"
    String absHref = link.attr("abs:href"); // "http://jsoup.org/"//for(Element getLink : link)

    public JsoupTester9() throws IOException {}

    public void test9(){
        System.out.println(doc);
        System.out.println(link);
        System.out.println(relHref);
        System.out.println(absHref);
    }

}