def print_restaurant_menu(restaurant_menu: list[dict], spicy_scale_map: dict, name_only: bool=False, show_idx: bool=False, start_idx: int=0, vegetarian_only: str="no") -> None:
    """
    param: restaurant_menu (list) - a list object that holds the dictionaries for each dish.
    param: spicy_scale_map (dict) - a dictionary object that is expected
            to have the integer keys that correspond to the "level of spiciness".
    param: name_only (Boolean)
            If True, then only the name of the dish is printed.
            Otherwise, displays the formatted dish information.
    param: show_idx (Boolean)
            If False, then the index of the menu is not displayed.
            Otherwise, displays the "(idx + star_idx)." before the
            dish name, where idx is the 0-based index in the list.
    param: start_idx (int)
            an expected starting value for idx that
            gets displayed for the first dish, if shoe_idx is True.
    param: vegetarian_only (str)
            By default, prints all dishes regardless of their
            is_vegetarian status ("yes/no" field status).
            Otherwise, display only the dishes with
            "is_vegetarian" status set to "yes">
    returns: None; only prints the restaurant menu.
    """

    if vegetarian_only=="yes":
        restaurant_menu = [dish for dish in restaurant_menu if dish["is vegetarian"] == "yes"]
        print("Vegetarian Menu")
    else:
        print("Restaurant Menu")

    for i, dish in enumerate(restaurant_menu):
        print(f"{i + start_idx}. {dish['name'].upper()}" if show_idx else dish['name'].upper())
        if not name_only:
            print(f"* Calories: {dish['calories']}")
            print(f"* Price: ${dish['price']:.2f}")
            print(f"* Spiciness: {spicy_scale_map[dish['spiciness']]}")
            if vegetarian_only == "no":
                print(f"* Is vegetarian? {dish['is vegetarian']}")
        print("")


def main():
    spicy_scale_map = {
        1: "Not spicy",
        2: "Low-key spicy",
        3: "Hot",
        4: "Diabolical"
    }

    restaurant_menu = [
        {
            "name": "burrito",
            "calories": 500,
            "price": 12.90,
            "is vegetarian": "yes",
            "spiciness": 1
        },
        {
            "name": "cheeseburger",
            "calories": 900,
            "price": 8.75,
            "is vegetarian": "no",
            "spiciness": 2
        },
        {
            "name": "noodles",
            "calories": 1200,
            "price": 14.20,
            "is vegetarian": "no",
            "spiciness": 4
        }
    ]

    print_restaurant_menu(restaurant_menu, spicy_scale_map)
    print_restaurant_menu(restaurant_menu, spicy_scale_map, False, True, 1, "no")
    print_restaurant_menu(restaurant_menu, spicy_scale_map, True, True, 1)
    print_restaurant_menu(restaurant_menu, spicy_scale_map, False, False, 0, "yes")




if __name__ == "__main__":
    main()
