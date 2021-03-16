package hu.nive.ujratervezes.zarovizsga.dogtypes;

public class Beagle extends Dog{
    public Beagle(String name) {
        super(name);
    }

    @Override
    void feed() {
    happiness += 2;
    }

    @Override
    void play(int hours) {
        happiness += hours * 2;
    }
}
