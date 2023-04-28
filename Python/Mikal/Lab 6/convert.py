def int_to_reverse_binary(integer_value: int) -> str:
    rev_binary = ""
    while integer_value > 0:
        rev_binary += str(integer_value % 2)
        integer_value //= 2
    return rev_binary

def string_reverse(input_string):
    return input_string[::-1]

if __name__ == "__main__":
    reverse_binary = int_to_reverse_binary(6)
    binary_value = string_reverse(reverse_binary)
    print(binary_value)