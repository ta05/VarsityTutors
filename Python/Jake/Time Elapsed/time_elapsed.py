class Time_Elapsed:
    # Stores elapsed time in hours, minutes and seonds
    def __init__(self, hours: int = 0, minutes: int = 0, seconds: int  = 0):
        self.hours = hours
        self.minutes = minutes
        self.seconds  = seconds

    def __str__(self):
        str_hours, str_mins, str_secs = "0" + str(self.hours), "0" + str(self.minutes), "0" + str(self.seconds)
        return f"{str_hours[-2:]}:{str_mins[-2:]}:{str_secs[-2:]}"


def mult_time(r_time: Time_Elapsed, mult: float) -> Time_Elapsed:
    total_seconds = r_time.hours * 3600 + r_time.minutes * 60 + r_time.seconds
    total_seconds *= mult
    hours = int(total_seconds // 3600)
    total_seconds %= 3600
    minutes = int(total_seconds // 60)
    seconds = total_seconds % 60
    return Time_Elapsed(hours, minutes, seconds)


def pace(r_time: Time_Elapsed, dist: int) -> Time_Elapsed:
    return mult_time(r_time, 1/dist)


def main():
    print(pace(Time_Elapsed(3, 45, 37), 26.2))

if __name__ == "__main__":
    main()