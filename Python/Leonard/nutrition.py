import pandas as pd

nutrition_df = pd.read_csv("./data/nutrition_subset.csv", header=0)

print(nutrition_df.head(5))

nutrition_df = nutrition_df.sort_values(by="saturated_fat", ascending=False)

print(nutrition_df.head(5))

nutrition_df["saturated_fat_per_gram"] = nutrition_df["saturated_fat"]/nutrition_df["weight_in_grams"]
nutrition_df = nutrition_df.sort_values(by="saturated_fat_per_gram", ascending=False)

print(nutrition_df.head(5))

nutrition_df["cholesterol_per_gram"] = nutrition_df["cholesterol"]/nutrition_df["weight_in_grams"]
nutrition_df = nutrition_df.sort_values(by="cholesterol_per_gram", ascending=False)

print(nutrition_df.head(5))