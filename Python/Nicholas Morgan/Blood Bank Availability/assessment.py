BLOOD_TYPE_INDEX = {"O-": 0, "O+": 1, "A-": 2, "A+": 3, "B-": 4, "B+": 5, "AB-": 6, "AB+": 7}
AVAILABILITY_KEY = {"P": "plenty", "S": "scarce", "I": "insufficient"}

def get_type_availability(primary: str, secondary: str, blood_type: str) -> None:
    primary_availibility = primary[BLOOD_TYPE_INDEX[blood_type]]
    secondary_availability = secondary[BLOOD_TYPE_INDEX[blood_type]]

    print(f"{blood_type} in the primary blood bank stocks is {AVAILABILITY_KEY[primary_availibility]}.")
    print(f"{blood_type} in the secondary blood bank stocks is {AVAILABILITY_KEY[secondary_availability]}.")


def main():
    primary = input("PRIMARY > ")
    secondary = input("SECONDARY > ")
    blood_type = input("TYPE > ")

    get_type_availability(primary, secondary, blood_type)


if __name__ == "__main__":
    main()