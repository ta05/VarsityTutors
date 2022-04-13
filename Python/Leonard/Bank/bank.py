import matplotlib.pyplot as plt
import numpy as np
import pandas as pd


bank_df = pd.read_csv("./data/bank_additional.csv", header=0, index_col=0)


# Create a new column for age range
condition = [
    bank_df['age'] < 30,
    (bank_df['age'] >= 30) & (bank_df['age'] < 35),
    (bank_df['age'] >= 35) & (bank_df['age'] < 40),
    (bank_df['age'] >= 40) & (bank_df['age'] < 45),
    (bank_df['age'] >= 45) & (bank_df['age'] < 50),
    (bank_df['age'] >= 50) & (bank_df['age'] < 55),
    bank_df['age'] >= 55
]

values = ['<30', '30-34', '35-39', '40-44', '45-49', '50-54', '>55']

bank_df['age range'] = np.select(condition, values)


# Create a binary variable for term deposit
bank_df['term deposit binary'] =  bank_df['y'].map({'yes': 1, 'no': 0, 'unknown': None})


# Plot age vs term deposit binary variable
xaxis = 'age'
yaxis = 'term deposit binary'

age_term_df = bank_df.groupby([xaxis])[[xaxis, yaxis]].mean()

X = age_term_df[xaxis]
y = age_term_df[yaxis]

A, B, C = np.polyfit(X, y, 2)

plt.scatter(X, y, s=8)
plt.xlabel(xaxis)
plt.ylabel(f"{yaxis} mean")
plt.plot(X, A*X**2 + B*X + C, color="r", label=f"{A:.4f}x^2 + {B:.4f}x + {C:.2f}")
plt.legend()
plt.title("Age vs Term Deposit")
plt.show()

