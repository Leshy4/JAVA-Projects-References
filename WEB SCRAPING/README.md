***Beautiful Soup == Library for developers to: Connect to URLs && Interpret the text through HTML. ***JSoup == BSoup for Java
WEBSITE REFERENCE == https://jsoup.org/cookbook/     <== (Slightly Dated) 
VIDEO REFERENCE == https://www.youtube.com/watch?v=wzh5TCVnWZQ
~~~~~~~~~~~~~~~~~~~~~~~~~~~~WEB SCRAPING STEPS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. RETRIEVE .jar file @   https://jsoup.org/download
2. PUT the jsoup-1.13.1.jar file into a Directory inside the Package 
3. import org.jsoup.*  &&   import org.jsoup.nodes.Document          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                                                          // This Code Prints the Links from the Wiki page for Software_development
String url = "https://en.wikipedia.org/wiki/Software_development";        // Static url, but can be dynamic
Document doc = Jsoup.connect(url).get();              // Connect to URL
Elements links = doc.select("a[href]");               // Searches for the <a href> Tags (Webpage URLs)      
for (Element link : links) 
          System.out.print(link.text() + ", ");       // .text() grabs text between HTML Tags
