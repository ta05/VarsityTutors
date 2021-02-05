

def strings():
    sentence = input("Please print a sentence: ")
    search = input("Please enter a string to search: ")


    def getCharacterCount(sentence):
        # Gets the number of characters in sentence including spaces
        
        return len(sentence)
    
    def getWordCount(sentence):
        # Gets the number of words in sentence
        
        sentence = sentence.strip()
        return len(sentence.split(" "))

    def getNumOccurrences(search, sentence):
        # Gets the number of times search appears in sentence

        return sentence.count(search)

    
    characterCount = getCharacterCount(sentence)
    wordCount = getWordCount(sentence)
    occurences = getNumOccurrences(search, sentence)

    print("The sentence has {} characters".format(characterCount))
    print("The sentence has {} words".format(wordCount))
    print('The search term "{}" appears {} times in the sentence'.format(search, occurences))
    print('The occurrence of search term "{}" per character is {:.3f}'.format(search, occurences/characterCount))
    print("The average number of characters per word is {:.3f}".format(characterCount/wordCount))


strings()