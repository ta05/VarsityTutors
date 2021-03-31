def mat_to_str(mat):
    mat_str = ""
    for row in mat:
        for elem in row:
            mat_str += str(elem) + " "
        mat_str += "\n"

    return mat_str

print(mat_to_str([[1,2],[3,4],[5,6]]))
