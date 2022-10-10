import os
from dotenv import load_dotenv
import pymysql

load_dotenv()

connection = pymysql.connect(
    host='localhost',
    user=os.getenv('USER'),
    password=os.getenv('PASSWORD'),
    database=os.getenv('DATABASE'),
    cursorclass=pymysql.cursors.DictCursor
)

cursor = connection.cursor()

sql = "DROP TABLE IF EXISTS wiki_edit"

cursor.execute(sql)

sql = "CREATE TABLE wiki_edit (RevisionID INT PRIMARY KEY, ArticleName VARCHAR(255), EditDate DATE, UserName VARCHAR(50)) ENGINE=InnoDB DEFAULT CHARSET=utf8;"

cursor.execute(sql)

file = open("./data/wiki_edit.txt", "r", encoding="utf8")
lines = file.read().splitlines()
for line in lines:
    row = line.split()

    sql = "INSERT INTO `wiki_edit` (RevisionID, ArticleName, EditDate, UserName) values (%s, %s, %s, %s)"
    cursor.execute(sql,(row[0], row[1], row[2], row[3]))
connection.commit()

sql = "SELECT ArticleName, COUNT(*) as NumEdits from db.wiki_edit GROUP BY ArticleName ORDER BY NumEdits DESC LIMIT 1"

cursor.execute(sql)
result = cursor.fetchone()
print(result)