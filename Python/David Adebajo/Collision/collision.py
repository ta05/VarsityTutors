def collision(massTruck1, massTruck2, speedTruck2, speedAfterCollision):
    return ((massTruck1 + massTruck2) * speedAfterCollision - massTruck2*speedTruck2)/massTruck1


def mps_to_kmph(speed):
    return 3.6 * speed


def calculate_fine(speed, limit):
    return 12.50 * (speed - limit)


if __name__ == "__main__":
    filename = input("Enter the file name: ")

    infile = open(f"./collision_data/{filename}", "r")
    raw_speed_file = open("./output/RawSpeed.txt", "w")
    tickets_file = open("./output/Vehicle1SpeedingTickets.txt", "w")

    lines = infile.readlines()[1:]

    infile.close()

    truck1_speeds = []

    for line in lines:
        line = line.strip()

        dat = line.split(",")

        id = dat[0]
        massTruck1 = int(dat[1])
        massTruck2 = int(dat[2])
        speedTruck2 = float(dat[3])
        speedAfterCollision = float(dat[4])

        speedTruck1 = collision(massTruck1, massTruck2, speedTruck2, speedAfterCollision)

        raw_speed_file.write(f"{speedTruck1}m/s\n")

        speedTruck1_kmph = int(round(mps_to_kmph(speedTruck1)))
        if speedTruck1_kmph > 50:
            truck1_speeds.append(speedTruck1_kmph)
            

    truck1_speeds.sort()
    for speed in truck1_speeds:
        fine = calculate_fine(speed, 50)
        tickets_file.write(f"In Collision ID#{id}: The Vehicle was going {speed}km/hr and will be charged ${fine:.2f}.\n")

    raw_speed_file.close()
    tickets_file.close()