import java.util.ArrayList;

public class HTMLParserTester {
    public static void main(String args[]) {
        HTMLParser html = new HTMLParser("./file/html.txt");
        System.out.println(html.htmlString);

        if (html.isValid()) {
            System.out.println("\nHere are all the h2 tags");
            for (String tag: html.findData("<h2>", "</h2>"))
                System.out.println(tag);
            
            System.out.println("\nThis is the page title: " + html.getPageTitle());
            
            System.out.println("\nHere is the text in all of the p tags");
            for (String p: html.findAllParagraphs())
                System.out.println(p);
        }
    }
}
