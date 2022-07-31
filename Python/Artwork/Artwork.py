class Artwork:
    def __init__(self, title:str="None", created_year:int=0):
        self.title = title
        self.created_year = created_year

    def __str__(self):
        return f"Title: {self.title}, {self.created_year}"