from pymongo import MongoClient


client = MongoClient()

db = client.db

file = open("./data/wiki_edit.txt", "r", encoding="utf8")
lines = file.read().splitlines()
for line in lines:
    columns = line.strip().split()
    record = {
        'RevisionId': columns[0],
        'ArticleName': columns[1],
        'EditDate': columns[2],
        'UserName': columns[3],
    }
    db.wiki.insert_one(record)

revisions = db.wiki
for line in revisions.find({"ArticleName": "Anarchism"}):
    print(line["EditDate"], line["UserName"])