def bridge_crossing(team):
    left = sorted(list(team), key=lambda x : x[1])
    right = []

    crosses = 0
    time = 0

    while len(left) > 0:
        if crosses % 2 == 0:
            if crosses % 4 == 0:
                crosser_1 = left[0]
                crosser_2 = left[1]

                crossing_time = max(crosser_1[1], crosser_2[1])
                time += crossing_time
                
                print(f"{crosser_1[0]} & {crosser_2[0]} cross ({crossing_time} mins) Total = {time} mins")
                right = left[:2] + right
                left = left[2:]

            else:
                crosser_1 = left[-2]
                crosser_2 = left[-1]

                crossing_time = max(crosser_1[1], crosser_2[1])
                time += crossing_time
                
                print(f"{crosser_1[0]} & {crosser_2[0]} cross ({crossing_time} mins) Total = {time} mins")
                right += left[-2:]
                left = left[:-2]
            right.sort(key=lambda x : x[1])
            
        else:
            crosser = right[0]

            crossing_time = crosser[1]
            time += crossing_time

            print(f"{crosser[0]} crosses ({crossing_time} mins) Total = {time} mins")

            left = right[0:1] + left
            right = right[1:]

            left.sort(key=lambda x : x[1])
        crosses += 1


team_1 = (("Alice", 1), ("Brian", 2), ("Carla", 9), ("David", 10))
team_2 = team = (("Alice", 1), ("Brian", 2), ("Carla", 9), ("David", 10), ("Eve", 8))
bridge_crossing(team_1)