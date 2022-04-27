from tkinter import Tk, Canvas

win = Tk()
win.geometry("600x600")

canvas=Canvas(win, width=600, height=600)
canvas.pack()

def draw_cross(x, y, length):
    canvas.create_line(x, y-length/2, x, y+length/2)
    canvas.create_line(x-length/2, y, x+length/2, y)


def draw_recurse_cross(x, y, length, direction=None):
    if length < 1:
        return
    draw_cross(x, y, length)
    if direction != "S":
        draw_recurse_cross(x, y-length/2, length/2, "N")
    if direction != "E":
        draw_recurse_cross(x-length/2, y, length/2, "W")
    if direction != "N":
        draw_recurse_cross(x, y+length/2, length/2, "S")
    if direction != "W":
        draw_recurse_cross(x+length/2, y, length/2, "E")




draw_recurse_cross(300, 300, 300)

win.mainloop()