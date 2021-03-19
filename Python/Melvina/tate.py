import pandas as pd
import matplotlib.pyplot as plt
artwork = pd.read_csv('https://raw.githubusercontent.com/rfordatascience/tidytuesday/master/data/2021/2021-01-12/artwork.csv')
artists = pd.read_csv("https://github.com/tategallery/collection/raw/master/artist_data.csv")

artwork["id"] = artwork["artistId"]
artwork = artwork[["id", "year", "acquisitionYear", "title", "medium"]]
artists = artists[["id", "gender"]]
df = pd.merge(artwork, artists)

def dimension(med_string):
    if type(med_string) != str:
        med_string = str(med_string)
    med_string = med_string.lower()
    if any([w in med_string for w in ["paper", "canvas", "oil", "paint"]]):
        return "2D"
    elif any([w in med_string for w in ["bronze", "stone", "ceramic"]]):
        return "3D"
    else:
        return "Other/Unknown"



df["dimension"] = [dimension(m) for m in df["medium"]]
df = df[["title","acquisitionYear", "gender", "dimension"]]


df['count2D'] = 0
df['count3D'] = 0
df['countUnknown'] = 0
df['countFemale2D'] = 0
df['countFemale3D'] = 0
df['countFemaleUnknown'] = 0

df.loc[(df['dimension'] == '2D'), ['count2D']] = 1
df.loc[(df['dimension'] == '2D') & (df['gender'] == 'Female'), ['countFemale2D']] = 1
df.loc[(df['dimension'] == '3D'), ['count3D']] = 1
df.loc[(df['dimension'] == '3D') & (df['gender'] == 'Female'), ['countFemale3D']] = 1
df.loc[(df['dimension'] == 'Other/Unknown'), ['countUnknown']] = 1
df.loc[(df['dimension'] == 'Other/Unknown') & (df['gender'] == 'Female'), ['countFemaleUnknown']] = 1


twoD_df = df[['acquisitionYear', 'count2D', 'countFemale2D']].groupby(['acquisitionYear'], as_index=False).sum()
twoD_df['ratio'] = twoD_df['countFemale2D'] / twoD_df['count2D']

threeD_df = df[['acquisitionYear', 'count3D', 'countFemale3D']].groupby(['acquisitionYear'], as_index=False).sum()
threeD_df['ratio'] = threeD_df['countFemale3D'] / threeD_df['count3D']

unknown_df = df[['acquisitionYear', 'countUnknown', 'countFemaleUnknown']].groupby(['acquisitionYear'], as_index=False).sum()
unknown_df['ratio'] = unknown_df['countFemaleUnknown'] / unknown_df['countUnknown']


# df.plot(kind='scatter', x='gender', y='acquisitionYear', color='red')
# twoD_df.plot(kind='scatter', x='acquisitionYear', y='ratio', color='red')


x1 = twoD_df['acquisitionYear']
x2 = threeD_df['acquisitionYear']
x3 = unknown_df['acquisitionYear']

y1 = twoD_df['ratio']
y2 = threeD_df['ratio']
y3 = unknown_df['ratio']

plt.scatter(x1, y1, marker=".", label="2D")
plt.scatter(x2, y2, marker=".", label="3D")
plt.scatter(x3, y3, marker=".", label="Unknown")

plt.ylim(bottom=0)

plt.xlabel("Year")
plt.ylabel("Female Artwork to All Artwork")

plt.title('Ratio of Female Artwork to All Artwork by Dimension', fontdict={'fontsize': 14})
plt.legend()
plt.show()


