class GiftCard:
    
    def __init__(self, id=0, balance=0):
        self.id = id
        self.balance = balance
    
    def set_id(self, id):
        self.id = id
    
    def set_balance(self, balance):
        self.balance = balance
    
    def get_id(self):
        return self.id
    
    def get_balance(self):
        return self.balance
    
    def debit(self, amount=0) -> bool:
        if self.balance >= amount:
            self.balance -= amount
            print("Transaction Accepted. Thanks for your purchase!")
            return True
        else:
            print("Transaction Rejected. Insufficient balance")
            return False
        
def main():
    # Create three GiftCard objects
    g0 = GiftCard()
    g1 = GiftCard(1122, 20)
    g2 = GiftCard(9876, 5)

    # Print out each of the GiftCard object's ids and balances
    print(f'Account {g0.id} has a balance of ${g0.balance:.2f}.')
    print(f'Account {g1.id} has a balance of ${g1.balance:.2f}.')
    print(f'Account {g2.id} has a balance of ${g2.balance:.2f}.')

    # Set g0's id to 2344 and its balance to 10
    g0.set_id(2344)
    g0.set_balance(10)

    # Try to debit 5.18 from each GiftCard object
    g0.debit(5.18)
    g1.debit(5.18)
    g2.debit(5.18)

    # Print out each of the GiftCard object's ids and balances
    print(f'Account {g0.id} has a balance of ${g0.balance:.2f}.')
    print(f'Account {g1.id} has a balance of ${g1.balance:.2f}.')
    print(f'Account {g2.id} has a balance of ${g2.balance:.2f}.')

    # Try to debit 7.96 from each GiftCard object
    g0.debit(7.96)
    g1.debit(7.96)
    g2.debit(7.96)

    # Print out each of the GiftCard object's ids and balances
    print(f'Account {g0.id} has a balance of ${g0.balance:.2f}.')
    print(f'Account {g1.id} has a balance of ${g1.balance:.2f}.')
    print(f'Account {g2.id} has a balance of ${g2.balance:.2f}.')


if __name__ == "__main__":
    main()