import java.util.ArrayList;

public class HTMLParser {

    public String htmlString;
    
	public HTMLParser (String filename) {
		this.htmlString = readHtmlCode(filename);
	}
	
	//This method reads html code from a file and returns the code as a String.
	public String readHtmlCode(String filename) {
		ReadFile read = new ReadFile(filename);
		try {
			ArrayList <String> list = read.getList();
			String h = "";
			for(int i = 0; i<list.size(); i++)
				h = h + list.get(i) + "\n"; 
			return h.trim();
		}
		catch(Exception error) {
			error.printStackTrace();
		}
		return "";
	}
	
	//This method checks to make sure that the html code is valid.  
	//It is valid if every properly opened tag is accompanied by a properly closed tag. 
	//Ignore void element tags.  These are tags that open but have no closing tag.   
	public boolean isValid() {
		String copyHtml = this.htmlString;
		ArrayList<String> tags = new ArrayList<String>();
		while (copyHtml.contains("<") && copyHtml.contains(">")) {
            int open = copyHtml.indexOf("<");
            int close = copyHtml.indexOf(">");
            String tag = copyHtml.substring(open, close + 1);
            if(tag.contains(" "))
                    tag = tag.substring(0, tag.indexOf(" ")) + tag.substring(tag.length()-1); 
            if(tag.substring(1,2).equals("/")) {
                if(tags.isEmpty())
                    return false;
                String recentTag = tags.get(tags.size()-1);
                if (tag.substring(2,tag.length()-1).equals(recentTag.substring(1,recentTag.length()-1)))
                    tags.remove(tags.size()-1);
                else
                    return false;
            }
            else {
                if(!(tag.equals("<meta>")|| tag.equals("<link>")|| tag.equals("<img>")))
                    tags.add(tag);
            }
            copyHtml = copyHtml.substring(0, open) + copyHtml.substring(close + 1);
		}
		return tags.isEmpty();
	}
	
	//This method finds all the data between the opened and closed tags.  
	//The opened and closed tags represents actual html tags.  
	//For example, the open tag can be <b> and the closed tag can be </b> to represent 
	//the beginning and end of bold text.  Nested tags exists.  
	//The tags may occur more than once.  
	//Therefore, this method should process the tags properly to extract the correct data. 
	public ArrayList<String> findData(String openTag, String closeTag) {
		ArrayList<String> data = new ArrayList<String>();
		int searchFrom = 0;
		String copyHtml = this.htmlString;
		ArrayList<Integer>startTagIndices = new ArrayList<Integer>();
		while (copyHtml.contains(openTag) || copyHtml.contains(closeTag)) {
			if(copyHtml.contains(openTag) && copyHtml.indexOf(openTag) < copyHtml.indexOf(closeTag)) {
				startTagIndices.add(copyHtml.indexOf(openTag)+ searchFrom);
				searchFrom+=copyHtml.indexOf(openTag)+ openTag.length();
				copyHtml = copyHtml.substring(copyHtml.indexOf(openTag)+ openTag.length());
			}
			else {
				int endPosition = copyHtml.indexOf(closeTag)+closeTag.length();
				data.add(this.htmlString.substring(startTagIndices.remove(startTagIndices.size()-1),searchFrom+endPosition));
				searchFrom+=copyHtml.indexOf(closeTag)+ closeTag.length();
				copyHtml = copyHtml.substring(copyHtml.indexOf(closeTag)+ closeTag.length());
			}
		}
        return data;
	}
	
	//This method returns the page title if it exists.  Otherwise it returns null.  
	//For example, if the html code above was used to create an instance of HTMLParser and this method was 
	//invoked it will return The Adventures of My Cat Lucky.
	public String getPageTitle() {
	
		ArrayList<String> title = findData("<title>", "</title>");
		if(title.isEmpty())
			return null;
		return title.get(0).substring(7,title.get(0).length()-8);
		
	}
	
	//This method returns all the paragraphs in the html code. 
	//A paragraph is embedded between the <p> and </p> tags.
	public ArrayList<String>findAllParagraphs() {
		ArrayList<String> paragraphs = findData("<p>", "</p>");
		if(paragraphs.isEmpty())
			return null;
		ArrayList<String> p = new ArrayList<String>();
		for(int i=0; i<paragraphs.size(); i++) {
			p.add(paragraphs.get(i).substring(3,paragraphs.get(i).length()-4));
		}
		return p;
	}
}
