import random

movies = [['Forrest Gump', 'Drama', 71],['Titanic', 'History', 89]]
choice = input("How would you like to narrow your choice? (genre, score, random) ")

if choice == "genre":
    genre = input("Select a genre: ").lower()
    print([movie for movie in movies if movie[1].lower() == genre])
elif choice == "score":
    score = int(input("Select a minimum score: "))
    print([movie for movie in movies if movie[2] >= score])
elif choice == 'random':
    print(random.choice(movies))
