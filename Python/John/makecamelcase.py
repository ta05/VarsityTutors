def camelcase(phrase):
    words = phrase.split()
    words = [words[0].lower()] + [word.capitalize() for word in words[1:]]
    return "".join(words)

print(camelcase("The start of something new"))