def card_to_value(card):
    if card.isdigit():
        return int(card)
    elif card in ["T", "J", "Q", "K"]:
        return 10
    else:
        return 1

def hard_score(hand):
    score = 0
    for card in score:
        score += card_to_value(card)
    return score

def soft_score(hand):
    score = 0
    has_an_ace = False
    for card in score:
        if card == "A" and not has_an_ace:
            score += 1
            has_an_ace = True
        else:
            score += card_to_value(card)
    return score