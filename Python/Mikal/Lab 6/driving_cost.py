def driving_cost(miles_per_gallon: float, dollars_per_gallon: float, miles_driven: float) -> float:
    return (dollars_per_gallon/miles_per_gallon) * miles_driven

if __name__ == "__main__":
    cost = driving_cost(20.0, 3.1599, 10)
    print(f"{cost:.2f}")
    cost = driving_cost(20.0, 3.1599, 50)
    print(f"{cost:.2f}")
    cost = driving_cost(20.0, 3.1599, 400)
    print(f"{cost:.2f}")
