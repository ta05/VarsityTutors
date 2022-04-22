def read_file(filename):
    file = open(filename, 'r')
    grade_list = file.read().splitlines()
    grades = {}

    for grade in grade_list:
        if grade in grades:
            grades[grade] += 1
        else:
            grades[grade] = 1

    return grades


def main():
    print(read_file("./data/grade.txt"))


if __name__ == "__main__":
    main()

