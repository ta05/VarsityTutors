import math

PI = math.pi

class Ball:
    
    def __init__(self, radius: int, color: str):
        self.radius = radius
        self.color = color
    
    def circumference(self):
        return 2 * PI * self.radius

    def surface(self):
        return 4 * PI * self.radius ** 2

    def volume(self):
        return PI * self.radius ** 3

    def paint(self, color: str):
        self.color = color


def main():
    # Instance variables and Constructor (init)
    ball_1 = Ball(4, "red")
    print("Ball 1:", ball_1.radius, ball_1.color)

    ball_2 = Ball(6, "blue")
    print("Ball 2:", ball_2.radius, ball_2.color)

    # Normal methods
    circum_1 = ball_1.circumference()
    print("Ball 1's circumference is", circum_1)
    print("Ball 1's surface area is", ball_1.surface())
    print("Ball 2's volume is", ball_2.volume())

    # setter method
    print("Ball 1 is", ball_1.color)
    ball_1.paint("purple")
    print("Ball 1 is", ball_1.color)


if __name__ == "__main__":
    main()