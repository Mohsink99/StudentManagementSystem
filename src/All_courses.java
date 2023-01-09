/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohsi
 */
public class All_courses {

    private String Course, Fees;

    public All_courses(String Course, String Fees) {
        this.Course = Course;
        this.Fees = Fees;
    }

    public String getCourse() {
        return Course;
    }

    public String getFees() {
        return Fees;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public void setFees(String Fees) {
        this.Fees = Fees;
    }
    

}
