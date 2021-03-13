import numpy as np
from sklearn.model_selection import StratifiedKFold

X = np.array([[1, 2, 1], [3, 4, 3], [5, 6, 5], [7, 8, 7], [9, 10, 9], [11, 12, 11]])
y = np.array([0, 0, 1, 1, 0, 1])

skf = StratifiedKFold(n_splits = 4)

for train_index, test_index in skf.split(X, y):
    print("TRAIN:", train_index, "TEST:", test_index)
    X_train, X_test = X[train_index], X[test_index]
    y_train, y_test = y[train_index], y[test_index]
