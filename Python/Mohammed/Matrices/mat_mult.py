def mat_mult(M, N):
    if len(M[0]) != len(N):
        print("The matrices cannot be multiplied")
        return
    product = []
    for i in range(len(M)):
        product.append([0] * len(N[i]))
    
    for i in range(len(M)):
        for j in range(len(N[0])):
            for k in range(len(N)):
                product[i][j] += M[i][k] * N[k][j]

    print(product)

mat1 = [[1, 2], [3, 4]]
mat2 = [[5, 6], [7, 8]]
mat3 = [[5, 6, 7], [8, 9, 10]]
mat_mult(mat1, mat2)
mat_mult(mat1, mat3)
mat_mult(mat3, mat2)

# product = [[5 + 16, ]]