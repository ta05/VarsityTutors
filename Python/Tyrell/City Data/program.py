def read_citydata(filename: str) -> dict[str, dict]:
    infile = open("./data/" + filename, "r")

    city_data = {}

    for line in infile.read().splitlines():
        neighborhood = line.rstrip().rstrip(",").split(",")
        name, ward, schools = neighborhood[0:3]
        languages = neighborhood[3:]
        neighborhood_dict = {
            "Name": name,
            "Ward": ward,
            "Schools": schools,
            "Languages": languages
        }
        city_data[name] = neighborhood_dict
    
    return city_data


def find_wards(city_data: dict[str, dict]) -> list[str]:
    wards = set()
    for name in city_data:
        wards.add(city_data[name]["Ward"])
    
    return list(wards)


def ward_neighborhoods(city_data: dict[str, dict], ward: str) -> list[str]:
    return [name for name in city_data if city_data[name]["Ward"] == ward]


def count_languages(city_data: dict[str, dict], wards: list[str]) -> dict[str, int]:
    languages = {}
    for name in city_data:
        if city_data[name]["Ward"] in wards:
            for language in city_data[name]["Languages"]:
                languages[language] = languages.get(language, 0) + 1
    
    return languages


def main():
    city_data = read_citydata("CityData.txt")
    wards = find_wards(city_data)

    for ward in wards:
        neighborhood_count = len(ward_neighborhoods(city_data, ward))
        language_count = count_languages(city_data, ward)

        print(f"{ward} contains {neighborhood_count} neighborhood(s). Below are the languages spoken in the Ward and the number of neighborhoods where that language is spoken.\n\n{language_count}\n")


if __name__ == "__main__":
    main()