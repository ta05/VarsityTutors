import math

class Order():
    def __init__(self, pizza_orders: int, salad_orders: int, pizza_price: float=15.99, salad_price: float=7.99):
        self.pizza_orders = pizza_orders
        self.pizzas = math.ceil(pizza_orders/4)
        self.salads = salad_orders
        self.pizza_price = pizza_price
        self.salad_price = salad_price

    def get_discount(self) -> float:
        pizza_discount = 0.15 if self.pizzas > 10 else 0
        salad_discount = 0.15 if self.salads > 10 else 0
        return pizza_discount * self.get_cost_of_pizzas() + salad_discount * self.get_cost_of_salads()

    def get_cost_of_pizzas(self) -> float:
        return self.pizzas * self.pizza_price

    def get_cost_of_salads(self) -> float:
        return self.salads * self.salad_price

    def get_subtotal(self) -> float:
        return self.get_cost_of_pizzas() + self.get_cost_of_salads()

    def get_delivery_fee(self) -> float:
        return max(20, 0.07 * self.get_subtotal())

    def get_total(self) -> float:
        return self.get_subtotal() + self.get_delivery_fee() - self.get_discount()

    def __str__(self):
        return f"""
KSU CCSE Hackathon Food Order
Number of pizza orders {self.pizza_orders:>8}
Number of salad orders {self.salads:>8}\n
Pizzas ordered {self.pizzas}\n
Pizza cost {f"${self.get_cost_of_pizzas():.2f}":>20}
Salad cost {f"${self.get_cost_of_salads():.2f}":>20}
Total {f"${self.get_subtotal():.2f}":>25}
Discount {f"-${self.get_discount():.2f}":>22}
Deliver {f"${self.get_delivery_fee():.2f}":>23}
Total Amount Due {f"${self.get_total():.2f}":>14}
"""


def main():
    pizza_orders = int(input("Number of pizza orders: "))
    salad_orders = int(input("Number of salad orders: "))
    order = Order(pizza_orders, salad_orders)
    print(order)


if __name__ == "__main__":
    main()