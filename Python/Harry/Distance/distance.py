import math
import sys

def distance(points):
    min_dist_between_points = sys.maxsize
    two_points = []
    closest_dist_to_origin = sys.maxsize
    closest_point = ""


    for i in range(len(points)):
        if math.sqrt(points[i][1]**2 + points[i][2]**2) < closest_dist_to_origin:
            closest_point = points[i][0]
            closest_dist_to_origin = math.sqrt(points[i][1]**2 + points[i][2]**2)
        for j in range(len(points)):
            if i != j:
                if math.sqrt((points[i][1] - points[j][1])**2 + (points[i][2] - points[j][2])**2) < min_dist_between_points:
                    two_points = [points[i][0], points[j][0]]
                    min_dist_between_points = math.sqrt((points[i][1] - points[j][1])**2 + (points[i][2] - points[j][2])**2)
    
    return closest_point, two_points

points = [
    ('p1', 20.9, 15.3),
    ('p2', 0.6, 24.7),
    ('p3', -12.1, 15.8),
    ('p4', 15, -5.8),
]

print(distance(points))

