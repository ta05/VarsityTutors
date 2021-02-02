import json

def getJson():
    jsonList = []
    for line in open('webhose_apple.json', 'r'):
        jsonList.append(json.loads(line))

    return jsonList



def queryTitle(l, term):
    # Filters json list where json object's title contains the query string

    return [item for item in l if term.lower() in item["thread"]["title"].lower() ]


jsonList = getJson()
queriedList = queryTitle(jsonList, "IPHONE")

print("Json list is ", len(jsonList))
print("Queried list is ", len(queriedList))

# print(queriedList)

print(queriedList[0:2])
print(len(queriedList[0:2]))

