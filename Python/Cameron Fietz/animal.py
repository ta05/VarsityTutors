import drawingpanel as dp

panel = dp.DrawingPanel(width=500, height=500)

# Body
panel.draw_oval(150, 200, 200, 100, color="black")

# Head
panel.draw_oval(300, 150, 70, 70, color="black")

# Eyes
panel.draw_oval(355, 170, 10, 10, color="blue")

# Nose
panel.fill_oval(365, 180, 16, 12, color="chocolate4")

# Ear
panel.fill_arc(307, 155, 45, 60, start_angle=-90, extent=50, color='black')

# Tail
panel.fill_arc(130, 188, 40, 120, start_angle=-135, extent=30, color='black')

# Legs
panel.draw_line(170, 280, 155, 330, color="black")
panel.draw_line(182, 287, 167, 337, color="black")
panel.draw_line(330, 280, 350, 330, color="black")
panel.draw_line(318, 287, 338, 337, color="black")