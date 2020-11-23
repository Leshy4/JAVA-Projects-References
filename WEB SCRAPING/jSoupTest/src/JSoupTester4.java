import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JSoupTester4 {

    public static <T> void test7()  throws IOException {
        File input = new File("/tmp/input.html");
        Document doc = Jsoup.connect("http://en.wikipedia.org/wiki/Computer_Programming").get();

        Elements links = doc.select("a[href]"); // a with href
        Elements pngs = doc.select("img[src$=.png]");

        Elements resultLinks = doc.select("h3.r > a"); // direct a after h3

        System.out.println("doc.text() = " + doc.text() + "\n");
        int x =0;
//        for(Element element : links) {
//            ++x;
//            if (x % 3 == 0) {
//                System.out.print(element.text() + "\n");
//            } else {
//                System.out.print(element.text() + " ");
//            }
//        }
//         System.out.print("\n".repeat(2));
//         for(Element element : pngs) System.out.println(element);    System.out.println("\n");
//    }
        for(Element element : resultLinks) {
            System.out.print(element.text() + ", ");
            ++x;
            if(x % 5 == 0) System.out.println();
        }
    }
}