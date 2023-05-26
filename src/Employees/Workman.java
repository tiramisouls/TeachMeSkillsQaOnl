package Employees;

public class Workman implements Employees {
    String positionName = "Workman";

    @Override
    public void getPositionName() {
        System.out.println("Name of position is " + positionName);
    }
}