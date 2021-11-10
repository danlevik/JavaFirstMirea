package ru.mirea.task16;

import java.util.Calendar;

public class Analysis {
    Calendar date;
    String analysisType;
    String results;

    public Analysis(Calendar date, String analysisType, String results) {
        this.date = date;
        this.analysisType = analysisType;
        this.results = results;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
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
