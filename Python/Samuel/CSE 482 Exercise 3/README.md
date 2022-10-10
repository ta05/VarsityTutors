# CSE 482 Exercise 3 - MySQL & Mongo

## Purpose

The purpose of this exercise is to help you get started using MySQL and MongoDB databases. Follow the instructions below to complete the exercise. You will use the wiki_edit.txt file from Exercise 1. Make sure the data file is in the directory where you will be writing your python code.

## Task

### MySQL

Write a python script using the mysql-connector library to performs the following steps:

1. Open a connection to the CSE database server (mysql-user-cse.egr.msu.edu). Your username and database name is the same as your MSU NetID. If you’re using the database for the first time, the password is your student PID. Note: if you can’t access the database server from outside the campus, you may need to use the EGR VPN or do the exercise on campus. Please refer to our announcement on d2l (on Sep 19) for further information.
2. Create a table named Wiki_Edit, which contains the following schema:

~~~sql
RevisionID int Primary Key,
ArticleName varchar(100),
EditDate date,
UserName varchar(50),
~~~

3. Read the file wiki_edit.txt and parse each line to identify the individual fields. For this exercise, do not use the read_table and DataFrame approach shown in lecture 4. Instead, you should read the file directly, parse each line, and store the fields from each line into the database. You should refer to the example given in slide #16 in lecture 2 on how to read from the data file directly and split each line into the individual fields.
4. Query the database to find the Article name with largest number of edits.
5. NOTE: you can only connect to the CSE database server if you’re on the EGR network. Try to do the exercise on campus. Otherwise, you need to install mysql on your own laptop.

### MongoDB

1. Install MongoDB to your machine.
2. Launch the MongoDB server.
3. Using pymongo, write a Jupyter notebook script that will store the entries in the wiki_edit.txt file to a collection named wiki in MongoDB. To store the data, you need to convert each line into a dictionary object. The keys to the dictionary correspond to `RevisionID`, `ArticleName`, `EditDate`, and `UserName` and the values correspond to the individual entries in each line of the file:

~~~py
columns = line.strip().split(‘ ‘)
record = { ‘RevisionID’: columns[0], ...., ‘UserName’: columns[3]}
db.wiki.insert_one(record)
~~~

4. Write a query to find the date and username of editors who edited the “Anarchism” article:

~~~py
revisions = db.wiki
for line in revisions.find({"ArticleName": "Anarchism"}):
    print(line["EditDate"], line["UserName"])
~~~