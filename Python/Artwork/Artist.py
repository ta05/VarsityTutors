class Artist:
    def __init__(self, name:str="None", birth:int=0, death:int=0):
        self.name = name
        self.birth = birth
        self.death = death

    def __str__(self):
        if self.death != -1:
            return f"Artist: {self.name} ({self.birth}-{self.death})"
        return f"Artist: {self.name}, born {self.birth}"