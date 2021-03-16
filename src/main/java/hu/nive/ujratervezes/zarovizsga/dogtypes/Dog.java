package hu.nive.ujratervezes.zarovizsga.dogtypes;

public abstract class  Dog {
    protected String name;
    protected int happiness;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public Dog(String name) {
        this.name = name;
        happiness =0;
    }

    abstract void feed();

    abstract void play (int hours);

}
