def all_permutations(word_list, perm_list):
    if len(word_list) == 0:
        print(perm_list)
    else:
        for i in range(len(word_list)):
            rem_words = word_list[:i] + word_list[i + 1 :]
            target = word_list[i]
            all_permutations(rem_words, perm_list + [target])

word_list = input("Enter the list of words delimited by a space: ").split(' ')
all_permutations(word_list, [])
