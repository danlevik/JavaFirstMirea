package ru.mirea.task29;
import java.io.Serializable;
import java.util.Arrays;

public class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String[] countriesInfo;
    private String[] namesInfo;
    private String[] convertToRubleInfo;

    public CurrencyInfo(String[] countriesInfo, String[] namesInfo, String[] convertToRubleInfo) {
        this.countriesInfo = countriesInfo;
        this.namesInfo = namesInfo;
        this.convertToRubleInfo = convertToRubleInfo;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String[] getCountriesInfo() {
        return countriesInfo;
    }

    public void setCountriesInfo(String[] countriesInfo) {
        this.countriesInfo = countriesInfo;
    }

    public String[] getNamesInfo() {
        return namesInfo;
    }

    public void setNamesInfo(String[] namesInfo) {
        this.namesInfo = namesInfo;
    }

    public String[] getConvertToRubleInfo() {
        return convertToRubleInfo;
    }

    public void setConvertToRubleInfo(String[] convertToRubleInfo) {
        this.convertToRubleInfo = convertToRubleInfo;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "countriesInfo=" + Arrays.toString(countriesInfo) +
                ", namesInfo=" + Arrays.toString(namesInfo) +
                ", convertToRubleInfo=" + Arrays.toString(convertToRubleInfo) +
                '}';
    }
}