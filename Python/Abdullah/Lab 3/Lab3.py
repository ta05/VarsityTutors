class Salesperson():
    def __init__(self):
        self.sales: list[int] = []
    
    def add_weekly_sales(self, amount: int) -> None:
        self.sales.append(amount)

    def monthly_sales(self) -> int:
        return sum(self.sales)


class Manager():

    def __init__(self, goal: int):
        self.goal = goal
        self.salespeople: list[Salesperson] = []

    def add_salesperson(self, salesperson: Salesperson) -> None:
        self.salespeople.append(salesperson)

    def get_total_sales(self) -> int:
        return sum([salesperson.monthly_sales() for salesperson in self.salespeople])

    def bonus(self) -> float:
        total_sales = self.get_total_sales()
        return 0.02 * total_sales if total_sales <= self.goal else 0.05 * total_sales

    def __str__(self):
        return f"""
Department Monthly Sales and Commission\n\n
Number of Employees:   {len(self.salespeople)}\n
Department Sales Goal: ${self.goal}\n\n
Total Sales {f"${self.get_total_sales():.2f}":>25}
Mgr. Bonus  {f"${self.bonus():.2f}":>25}"""


def main():
    goal = int(input("Sales goal: "))
    m = Manager(goal)
    num_salespeople = 0
    has_more_salespeople = True
    while has_more_salespeople:
        s = Salesperson()
        num_salespeople += 1
        for week in range(1, 5):
            s.add_weekly_sales(int(input(f"Salesperson {num_salespeople} week {week}: ")))
        m.add_salesperson(s)
        has_more_salespeople = input("Another salesperson? (y/n): ").lower() == "y"
    print(m)

if __name__ == "__main__":
    main()