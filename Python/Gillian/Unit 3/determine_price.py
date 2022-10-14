def determine_price(original_price: int, days_since_release: int, greatest_hits: bool) -> int:
    loss = days_since_release // 7 if greatest_hits else days_since_release // 7 * 2
    return max(original_price - loss, 20)


def main():
    price = determine_price(25, 14, True)
    print(f"${price}")


if __name__ == "__main__":
    main()