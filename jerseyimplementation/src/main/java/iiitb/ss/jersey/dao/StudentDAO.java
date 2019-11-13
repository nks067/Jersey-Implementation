package iiitb.ss.jersey.dao;

import iiitb.ss.jersey.data.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public static List<Student> dataList=new ArrayList<>();

    static{
        dataList.add(new Student("Jhon",10001,"Software System",78));
        dataList.add(new Student("Smith",10002,"Software System",75));
    }
}
