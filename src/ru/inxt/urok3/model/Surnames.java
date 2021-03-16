package ru.inxt.urok3.model;

public class Surnames {
    private int ID;
    private String Name;
    private String Sex;
    private int PeoplesCount;
    private String WhenPeoplesCount;

    public Surnames(int ID, String Name, String Sex, int PeoplesCount, String WhenPeoplesCount) {
        this.ID = ID;
        this.Name = Name;
        this.Sex = Sex;
        this.PeoplesCount = PeoplesCount;
        this.WhenPeoplesCount = WhenPeoplesCount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getSex() {
        return Sex;
    }

    public int getPeoplesCount() {
        return PeoplesCount;
    }

    public String getWhenPeoplesCount() {

        return WhenPeoplesCount;
    }

    @Override
    public String toString() {
        return "Surnames{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", PeoplesCount=" + PeoplesCount +
                ", WhenPeoplesCount='" + WhenPeoplesCount + '\'' +
                '}';
    }
}
