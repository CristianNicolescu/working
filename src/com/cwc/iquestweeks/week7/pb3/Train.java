package com.cwc.iquestweeks.week7.pb3;

public class Train {
    private int number;
    private String type;
    private int noOfWagons;

    /**
     * Checks if important fields are the same and if the object is a train
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        Train t;
        if(!(obj instanceof Train))
            return false;
        t=(Train) obj;
        if(this==obj)
            return true;
        if(this.number==t.number && this.type.equals(t.type) && this.noOfWagons==t.noOfWagons)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return 17*number+type.hashCode()+noOfWagons*31;
    }

    /**
     * Prints train data
     */
    public void print()
    {
        System.out.println(number+ " "+ type +" "+noOfWagons);
    }
    public Train(int number, String type, int noOfWagons) {
        this.number = number;
        this.type = type;
        this.noOfWagons = noOfWagons;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoOfWagons() {
        return noOfWagons;
    }

    public void setNoOfWagons(int noOfWagons) {
        this.noOfWagons = noOfWagons;
    }

}
