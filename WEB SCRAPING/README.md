# WEB SCRAPING = Get Data from Websites w/  JSoup && uBlock          NEVER FORGET POLITENESS!! Thread.sleep(2000) to not Overload Server
**Beautiful Soup == Library that Connects to URLs && Interprets text from HTML. ***JSoup == BSoup for Java.

**uBlock == Used to Find the Name of an HTML on a Webpage. Chrome Extension. "Enter Sample Picker Mode" (Color Sample ICON).

WEBSITE REFERENCE == https://jsoup.org/cookbook/     <== (Slightly Dated) 

VIDEO REFERENCE == https://www.youtube.com/watch?v=wzh5TCVnWZQ
~~~~~~~~~~~~~~~~~~~~~~~~~~~~WEB SCRAPING STEPS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. RETRIEVE .jar file @   https://jsoup.org/download
2. PUT the jsoup-1.13.1.jar file into a Directory inside the Package 
3. ADD as Library <- Right Click on Jsoup.jar file && Select
4. IMPORT org.jsoup.*  &&   import org.jsoup.nodes.Document    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                                                    // This Code Prints the Links from the Wiki page for Software_development
String url = "https://en.wikipedia.org/wiki/Software_development";  // Static url, but can be dynamic
Document doc = Jsoup.connect(url).get();              // Connect to URL
Elements links = doc.select("a[href]");               // Searches for the <a href> Tags (Webpage URLs)      
for (Element link : links) 
          System.out.print(link.text() + ", ");       // .text() grabs text between HTML Tags
