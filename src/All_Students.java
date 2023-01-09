/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohsin
 */
class All_Students {

    private String Name, Mobile, Email, StudentID, Password, State, City, Course, Fees, Paid, Remaining, Date;

    public All_Students(String Name, String Mobile, String Email, String StudentID, String Password, String State, String City, String Course, String Fees, String Paid, String Remaining, String Date) {
        this.Name = Name;
        this.Mobile = Mobile;
        this.Email = Email;
        this.StudentID = StudentID;
        this.Password = Password;
        this.State = State;
        this.City = City;
        this.Course = Course;
        this.Fees = Fees;
        this.Paid = Paid;
        this.Remaining = Remaining;
        this.Date = Date;

    }

    public String getName() {
        return Name;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getEmail() {
        return Email;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getPassword() {
        return Password;
    }

    public String getState() {
        return State;
    }

    public String getCity() {
        return City;
    }

    public String getCourse() {
        return Course;
    }

    public String getFees() {
        return Fees;
    }

    public String getPaid() {
        return Paid;
    }

    public String getRemaining() {
        return Remaining;
    }

    public String getDate() {
        return Date;
    }

}
