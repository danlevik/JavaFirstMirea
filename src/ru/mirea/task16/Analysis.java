package ru.mirea.task16;

import java.util.Calendar;
import java.util.Date;

public class Analysis {
    Date date;
    String analysisType;
    String results;

    public Analysis(Date date, String analysisType, String results) {
        this.date = date;
        this.analysisType = analysisType;
        this.results = results;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAnalysisType() {
        return analysisType;
    }

    public void setAnalysisType(String analysisType) {
        this.analysisType = analysisType;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }
}
