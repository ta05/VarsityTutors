
# Map Method
def unzip(list_of_tuples):
    return (list(map(lambda x: x[0], list_of_tuples)), list(map(lambda x: x[1], list_of_tuples)), list(map(lambda x: x[2], list_of_tuples)))


# List Comprehension Method: Used for demo and explain how list comprehension works
def unzip2(list_of_tuples):
    return ([ i for i, j, k in list_of_tuples ], [j for i, j, k in list_of_tuples], [k for i, j, k in list_of_tuples])



list_of_tuples = [(1,"a",{1:"a"}),(2,"b",{2:"b"}),(3,"c",{3:"c"}),(4,"d",{4:"d"})]
print(unzip(list_of_tuples))
print(unzip2(list_of_tuples))