height = float(input("Please enter an initial height: "))
rest = float(input("Please enter a coefficient of restitution: "))
bounces = 0
distance = 0

while height >= 0.1:
    distance += height
    bounces += 1
    height *= rest
    distance += height

print("Number of bounces: " + str(bounces))
print("The ball travelled a distance of {:.2f}m".format(distance))