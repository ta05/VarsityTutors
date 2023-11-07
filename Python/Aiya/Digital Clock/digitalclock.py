# function:     horizontal_line
# input:        a width value (integer) and a single character (string)
# processing:   generates a single horizontal line of the desired size
# output:       returns the generated pattern (string)
def horizontal_line(width, char):
    return width * char + "\n"


# function:     vertical_line
# input:        a shift value and a height value (both integers) and a single character (string)
# processing:   generates a single vertical line of the desired height. The line
#               offset from the left side of the screen usign the shift value
# output:       returns the generated pattern (string)
def vertical_line(shift, height, char):
    pattern = ""
    for _ in range(height):
        pattern += shift * " " + char + "\n"
    return pattern


# function:     two_vertical_lines
# input:        a shift value and a height value (both integers) and a single character (string)
# processing:   generates two vertical lines. The first line is along the left side of
#               the screen. The second line is offset using the "width" value supplied.
# output:       returns the generated pattern (string)
def two_vertical_lines(width, height, char):
    pattern = ""
    for _ in range(height):
        pattern += char + " " * (width - 2) + char + "\n"
    return pattern