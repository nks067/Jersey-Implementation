package iiitb.ss.jersey.data;

public class Student {

    private String Name;
    private long Roll;
    private String Course;
    private double Marks;

    public Student() {

    }

    public Student(String name, long roll, String course, double marks) {
        Name = name;
        Roll = roll;
        Course = course;
        Marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getRoll() {
        return Roll;
    }

    public void setRoll(long roll) {
        Roll = roll;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public double getMarks() {
        return Marks;
    }

    public void setMarks(double marks) {
        Marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Roll=" + Roll +
                ", Course='" + Course + '\'' +
                ", Marks=" + Marks +
                '}';
    }
}
