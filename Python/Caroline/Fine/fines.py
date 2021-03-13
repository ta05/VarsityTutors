def fine(speed_limit, my_speed, zone=None):
    over_limit = my_speed - speed_limit
    if over_limit >= 20:
        return 350
    elif over_limit < 0:
        return 30
    elif over_limit > 0:
        if zone == "school" or zone == "work":
            return 7 * over_limit
        elif zone == "residential":
            return 8 * over_limit + 200
        else:
            return 6 * over_limit
    return 0


def demerit(speed_limit, my_speed):
    over_limit = my_speed - speed_limit
    if over_limit >= 1 and over_limit < 10:
        return 3
    elif over_limit >= 10 and over_limit < 20:
        return 4
    elif over_limit >= 20:
        return 6
    return 0
