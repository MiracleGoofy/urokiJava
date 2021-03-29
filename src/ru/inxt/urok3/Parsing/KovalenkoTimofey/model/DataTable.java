package ru.inxt.urok3.Parsing.KovalenkoTimofey.model;

import java.util.List;

public class DataTable {

    private String Title;
    private List<Surnames> Surnames;

    public String getTitle() {
        return Title;
    }

    public List<Surnames> getSurnames() {
     //   System.out.println("--- " +Surnames );
        return Surnames;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setSurnames(List<Surnames> surnames) {
        Surnames = surnames;
    }

    @Override
    public String toString() {
        return "DataTable{" +
                "Title ='" + Title + '\'' +
                ", Surnames: =" + Surnames + '\'' +
                '}';
    }
}
