# File Output

Download the sample data at [https://www.py4e.com/code3/mbox.txt](https://www.py4e.com/code3/mbox.txt). Save this file to the same folder you have your .py code file. Note that this is a much larger .txt file than the one you used on your Read File assignment (that file was named mbox-short.txt).  

Use three counter variables named `counter_com`, `counter_edu` and `counter_org` to keep track of how many lines you find. Declare these just under the comment with your name/date at the top of the file.  

Write a program that opens mbox.txt, reads through the file, and finds lines that contain email addresses ending with .com, .edu and .org. Use `find()` to identify lines where one of these exists.  

Define an output file towards the top of your code names "emails_output.txt". Any time you **`find`** a line in mbox.txt that has the .com, .edu or .org email address in it, increment the proper counter and write the entire line to your emails_output.txt file.  

Once you have finished reading through the mbox.txt file, print your counter totals.