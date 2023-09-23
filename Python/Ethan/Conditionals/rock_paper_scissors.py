def get_winner(p1_pick: str, p2_pick: str) -> int:
    if p1_pick in ("r", "rock"):
        if p2_pick in ("r", "rock"):
            return 0
        elif p2_pick in ("s", "scissors"):
            return 1
        elif p2_pick in ("p", "paper"):
            return 2
    elif p1_pick in ("p", "paper"):
        if p2_pick in ("r", "rock"):
            return 1
        elif p2_pick in ("s", "scissors"):
            return 2
        elif p2_pick in ("p", "paper"):
            return 0
    elif p1_pick in ("s", "scissors"):
        if p2_pick in ("r", "rock"):
            return 2
        elif p2_pick in ("s", "scissors"):
            return 0
        elif p2_pick in ("p", "paper"):
            return 1
        
def format_round_results(winner: int) -> str:
    return ("Tie!", "Player 1 Wins!", "Player 2 Wins!")[winner]

def main():
    scores = [0, 0, 0]

    ROUNDS = 3
    for round in range(1, ROUNDS + 1):
        print(f"Round {round}:")
        p1_pick = input("Player 1 Pick: ").lower()
        p2_pick = input("Player 2 Pick: ").lower()
        winner = get_winner(p1_pick, p2_pick)
        scores[winner] += 1
        print(format_round_results(winner) + "\n")

    if scores[1] > scores[2]:
        print("Player 1 wins the game!")
    elif scores[2] > scores[1]:
        print("Player 2 wins the game!")
    else:
        print("The game is a tie!")

if __name__ == "__main__":
    main()
