import cone
# from cone import volume
# from cone import volume as f
# import cone as m
from cone import *

def main():
    height = float(input("Enter cone height: "))
    radius = float(input("Enter cone radius: "))

    print(cone.volume(height, radius))
    # print(volume(height, radius))
    # print(f(height, radius))
    # print(m.volume(height, radius))
    # print(volume(height, radius))


if __name__ == "__main__":
    main()