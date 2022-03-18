import random

def pick_winning_numbers(lowest: int, highest: int, size: int) -> list[int]:
    num_range = range(lowest, highest + 1)
    return random.sample(num_range, size)


def pick_superball(lowest: int, highest: int) -> int:
    return random.randint(lowest, highest)


def convert_list_to_integers(customer_picks: list[str]) -> list[int]:
    return [int(x) for x in customer_picks]


def count_matches(customer: list[int], winning: list[int]) -> int:
    matches = 0
    for num in customer:
        if num in winning:
            matches += 1
    
    return matches


if __name__ == "__main__":
    f_handle = open('./Betty/data/customer_numbers.txt', 'r')
    tickets = [ticket.rstrip().split() for ticket in f_handle]
    
    winning_ticket = pick_winning_numbers(1,9,4)
    superball = pick_superball(1,9)
    entries = len(tickets)

    superball_bonus = 1 if superball in winning_ticket else 0
    num_three_matches = 0
    num_four_matches = 0
    num_used_superball = 0

    for ticket in tickets:
        has_superball = False
        if ticket[-1] == 'sb':
            has_superball = True
            num_used_superball += 1
            ticket.pop()
        ticket = convert_list_to_integers(ticket)
        matches = count_matches(ticket, winning_ticket)
        if has_superball and superball_bonus == 1:
            matches = min(matches + 1, 4)
        
        if matches == 3:
            num_three_matches += 1
        elif matches == 4:
            num_four_matches += 1

    print("Python Pick 4 Lottery Results\n")
    print(f"Today's winning numbers: {winning_ticket}")
    print(f"Today's superball: {superball}\n")

    print(f"Number of entries: {entries}")
    print(f"Number of entries that used superball: {num_used_superball}")
    print(f"Number of entries that matched 3 numbers: {num_three_matches}")
    print(f"Number of entries that matched 4 numbers: {num_four_matches}")



