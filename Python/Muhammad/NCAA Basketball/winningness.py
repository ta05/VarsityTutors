import pandas as pd

def get_coaches_name(coach):
    return " ".join(coach.split()[0:2]).replace("(unknown) ", "")


def main():
    ncaa_df = pd.read_csv("./data/ncaa-team-data.csv")
    ncaa_df["coaches_name"] = ncaa_df["coaches"].apply(get_coaches_name)
    
    coaches_wins_df = ncaa_df[["coaches_name", "w", "l"]].groupby(["coaches_name"]).sum()
    coaches_wins_df["winrate"] = coaches_wins_df["w"]/(coaches_wins_df["w"] + coaches_wins_df["l"])
    coaches_wins_df = coaches_wins_df.sort_values(["winrate", "l", "w"], ascending=[False, True, False]).dropna()
    
    top_df = coaches_wins_df.head(5)
    bottom_df = coaches_wins_df.tail(5)

    print(top_df)
    print(bottom_df)


if __name__ == "__main__":
    main()