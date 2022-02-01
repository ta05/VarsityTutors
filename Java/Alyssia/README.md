# Project 1

The purpose of this first project is simply to refresh your knowledge of Java and object-oriented programming. Your task is to create a package BookPrinting, which implements a class hierarchy as follows:  

1. Create a base called Book. It should keep track of the following data items (you need to decide on the data type for each data item):  
- Title
- Author
- Publication Year
- Number of pages
- Medium (0 - printed hardcover, 1 - printed softcover, 2 - electronic, 3 - all)
- Number of copies printed
- Production cost (i.e. what does the book sell for, e.g. $7.95/copy)
- Number of copies sold
- Number of positive reviews
- Number of negative reviews

The class should have appropriate constructors, getters, setters, and a PrintInfo() method.  

2. Create a class Textbook, derived from Book. The class method inherits everything from the parent class and adds the following data (and appropriate methods):  
- Field (e.g. "Computer Science", "Biology", etc.)
- Topic (e.g. "Computer Architecture", "Molecular Modeling", etc.)  

3. Create a class Novel, derived from Book. The class method inherits everything from the parent class and adds the following data (and appropriate methods):
- Genre (e.g. "Sci-fi", "Thriller", etc.)  

4. Create an interface called PublicationInfo, which declares methods:  
- CostEffective(): This method, when implemented in a class should return true if the book is cost-effective, i.e. if the funds received from the sale of the book exceeds the production expenses. Otherwise, return false.
- GeneratesInters(): The method, when implemented in a class, should return true if the number of positive reviews exceeds the number of negative reviews and if the number of sales exceeds a certain threshold(for example, when implemented in the Textbook class, the threshold 80% of the copies printed; whereas for novels, the threshold should be set to 65% of the copies printed).
Both class Textbook and Novel should implement the methods of the PublicationInfo interface.  

5. Create a driver class Bookshelf. The class should contain a method, which: 
- Opens a file called "data.txt". Each line in that file will contain data about one book. For example:
    - "OpenGL", M. Turner, 2020, 498, 3, 14000, 14995, 5.65, 12412, 581, 233, Computer Science, Computer Graphics
The entries are comma-separated and listed in the order in section 1 above.
- Parse each line in the file, determine the type of book the line represents and then create a new instance of the Textbook or Noverl class and initialize it with data from the current line. Add the new instance to an ArrayList of type Book.
- After all the data from the file has been read, print the contents of the ArrayList one book at a time.