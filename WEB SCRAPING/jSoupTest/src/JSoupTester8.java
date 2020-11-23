import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class JSoupTester8 {
    String html = "<p>An <a href='http://example.com/'><b>example</b></a> link.</p>";
    Document doc = Jsoup.connect(html).get();
    Element link = doc.select("a").first();

    String text = doc.body().text(); // "An example link"
    String linkHref = link.attr("href"); // "http://example.com/"
    String linkText = link.text(); // "example""

    String linkOuterH = link.outerHtml();
    // "<a href="http://example.com"><b>example</b></a>"
    String linkInnerH = link.html(); // "<b>example</b>"

    public JSoupTester8() throws IOException {
    }

    //for(Element getLink : link)
      public void test8(){
          System.out.println(doc);
          System.out.println(link);
          System.out.println(text);
          System.out.println(linkHref);
          System.out.println(linkText);
          System.out.println(linkInnerH);
      }

}
