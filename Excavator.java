package jcoreoopbasic;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator starts its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stops its work");
    }
}
