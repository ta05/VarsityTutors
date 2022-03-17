f_handle1 = open("./Cristian/files/file1.txt", "r")
f_handle2 = open("./Cristian/files/file2.txt", "r")

text_list1 = f_handle1.read().split()
text_list2 = f_handle2.read().split()

set_1 = set(text_list1)
set_2 = set(text_list2)

common = set_1.intersection(set_2)

print(f"The {len(common)} common word(s) are: {common}")