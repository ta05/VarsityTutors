from Artist import Artist
from Artwork import Artwork

def main():
    f_handle = open("./data/art.txt", "r")
    for line in f_handle.read().splitlines():
        attributes = line.split()
        name = " ".join(attributes[0:2])
        birth = int(attributes[2])
        death = int(attributes[3])
        title = " ".join(attributes[4:-1])
        created_at = int(attributes[-1])

        artist = Artist(name, birth, death)
        artwork = Artwork(title, created_at)

        print(artist, artwork)
    f_handle.close()

if __name__ == "__main__":
    main()

