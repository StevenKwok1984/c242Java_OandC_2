package Inheritance;

public class Manager extends Employee{

    Manager(){
        super.createYearlyObjectives();
    }

    public void hire() {

    }

    public void fire() {

    }

    public void givePerformanceReview(){

    }
    /*
    @Override
    public void createYearlyObjectives() {
        // we're overriding the version of this method in Employee
        // put new code here...

     */

    public void createYearlyObjectives() {
        // we're overriding the version of this method in Employee
        // put new code here...
        super.createYearlyObjectives();
        // put more new code here...
    }
}
