// package org.jsoup.examples;      //????????????????????????????????/

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import static org.jsoup.helper.Validate.*;

/** Example program to list links from a URL.   Also Records Duplicates*/
public class JsoupTester10 {
    public static <T> void test10() throws IOException {

        //isTrue(true, "usage: supply url to fetch");
        String url = "https://en.wikipedia.org/wiki/Software_development";
        print("Fetching %s...", url);

        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select("a[href]");
        Elements media = doc.select("[src]");
        Elements imports = doc.select("link[href]");

//        print("\nMedia: (%d)", media.size());
//        for (Element src : media) {
//            if (src.normalName().equals("img"))
//                print(" * %s: <%s> %sx%s (%s)",
//                        src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),
//                        trim(src.attr("alt"), 20));
//            else
//                print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
//        }

//        print("\nImports: (%d)", imports.size());
//        for (Element link : imports) {
//            print(" * %s <%s> (%s)", link.tagName(),link.attr("abs:href"), link.attr("rel"));
//        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        LinkedList<String> lList = new LinkedList<>();
        print("\nLinks: (%d)", links.size());
        for (Element link : links) {
            //print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
            if(link.text().length() > 1 && !link.text().contains("edit")
                    && link.text() != " " && link.text() != "^" && !link.text().contains("ISBN")
                    && link.text().charAt(0) != '[') {
                if (!linkedHashSet.contains(link.text()))
                    linkedHashSet.add(link.text());
                else lList.add(link.text());
            }
        }
        System.out.println(linkedHashSet.size() + " Uniques  vs  Duplicates " + lList.size());
        //for(String word : linkedHashSet) System.out.println(word);
        int x = 0;
        for(String word : lList) {
            System.out.print(word + ", ");
            ++x;
            if(x % 5 == 0)
                System.out.println();
        }
    }

    private static void print(String msg, Object... args) { //todo) INTERESTING way for Parameters
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width-1) + ".";
        else return s;
    }
}