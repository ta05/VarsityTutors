import tkinter as tk
import math

# Create an instance of tkinter frame
root = tk.Tk()

# Title the window
root.title("Recursive Circle Drawing")

# Create a canvas object
canvas = tk.Canvas(root, width=800, height=800)
canvas.pack()


class Circle:

    colors = ['Green', 'Gray', 'Blue', 'Yellow']

    def __init__(self, x: int, y: int, radius: int, depth: int):
        self.x = x
        self.y = y
        self.radius = radius
        self.depth = depth

    def draw_oval(self):
        canvas.create_oval(self.x-self.radius, self.y-self.radius, self.x+self.radius, self.y+self.radius, fill=self.colors[self.depth])



def rec_draw(circle: Circle) -> None:
    if circle.depth > 3:
        return

    circle.draw_oval()
    new_radius = circle.radius/(1 + 2/math.sqrt(3))

    # Bottom Circle
    rec_draw(Circle(circle.x, circle.y + 2 * new_radius / math.sqrt(3), new_radius, circle.depth + 1))

    # Top Left Circle
    rec_draw(Circle(circle.x - new_radius, circle.y - new_radius / math.sqrt(3), new_radius, circle.depth + 1))

    #Top Right Circle
    rec_draw(Circle(circle.x + new_radius, circle.y - new_radius / math.sqrt(3), new_radius, circle.depth + 1))


def main():
    c = Circle(400, 400, 200, 0)
    rec_draw(c)
    root.mainloop()


if __name__ == "__main__":
    main()