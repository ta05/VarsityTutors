import numpy as np
import pandas as pd

def years_w_no_appointments(filename):
    justices = pd.read_table(filename, delimiter=",")

    justices = justices.rename(columns={'birthstr':'Birth Year', 'startstr': 'Year Appointed', 'stopstr': 'Year Retired'})
    justices['Birth Year'] = justices['Birth Year'].str[-4:]
    justices['Year Appointed'] = justices['Year Appointed'].str[-4:]
    justices['Year Retired'] = justices['Year Retired'].str[-4:]

    years_app = justices['Year Appointed'].squeeze()
    first_year = int(years_app.min())
    last_year = int(years_app.max())

    all_years = pd.Series(np.linspace(first_year, last_year, last_year - first_year + 1), dtype=int)

    years_no_app = all_years.loc[~all_years.isin(years_app)]

    print(years_no_app)

years_w_no_appointments("./Mitchell/Justices/data/justices.csv")