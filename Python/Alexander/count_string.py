def count_string(text):
    lowercase = "abcdefghijklmnopqrstuvwxyz"
    uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    lower_count = 0
    upper_count = 0

    for letter in text:
        if letter in lowercase:
            lower_count += 1
        if letter in uppercase:
            upper_count += 1
    
    print("There are {} uppercase and {} lowercase characters in \"{}\"".format(upper_count, lower_count, text))

if __name__ == "__main__":
    text = input("Hello. Please enter a string: ")
    count_string(text)