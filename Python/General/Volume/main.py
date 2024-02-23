import cone
# from cone import volume
# from cone import volume as f
# import cone as m
# from cone import *

def main():
    height = float(input("Enter cone height: "))
    radius = float(input("Enter cone radius: "))

    print(f"The volume of the cone is {cone.volume(height, radius)}")
    # print(f"The volume of the cone is {volume(height, radius)}")
    # print(f"The volume of the cone is {f(height, radius)}")
    # print(f"The volume of the cone is {m.volume(height, radius)}")
    # print(f"The volume of the cone is {volume(height, radius)}")


if __name__ == "__main__":
    main()