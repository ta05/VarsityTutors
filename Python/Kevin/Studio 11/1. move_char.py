def move_character(text: str, character: str) -> str:
    char_count = text.count(character)
    text = text.replace(character, "")
    return text + (character * char_count)

print(move_character("Hello, how are you?", "o"))