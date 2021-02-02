import flask
import pandas as pd

app = flask.Flask("NY Companies")

@app.route("/")
def nyCrunchbaseCompanies():
    def read():
        df_csv = pd.read_csv("cb_sample.csv")
        return df_csv

    def filterByRegion(df, region):
        return df.loc[df['region'] == region]

    companies = read()
    output = 'Crunchbase companies based in New York include: ' + filterByRegion(companies, "New York")

    return flask.render_template('index.html', result=output)