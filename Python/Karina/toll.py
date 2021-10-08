def calc_toll(hour, is_morning, is_weekend):
    hour = hour % 12
    if not is_morning:
        hour += 12
    
    if not is_weekend:
        if hour < 7:
            return 1.15
        elif hour < 10:
            return 2.95
        elif hour < 15:
            return 1.9
        elif hour < 20:
            return 3.95
        else:
            return 1.4
    else:
        if hour < 7:
            return 1.05
        elif hour < 20:
            return 2.15
        else:
            return 1.1

if __name__ == "__main__":
    print(calc_toll(8, True, False))
    print(calc_toll(1, False, False))
    print(calc_toll(3, False, True))
    print(calc_toll(5, True, True))