import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static ArrayList<Admin> adminArrayList=new ArrayList<>();
    public static ArrayList<Student> studentArrayList=new ArrayList<>();
    public static ArrayList<Faculity> faculityArrayList=new ArrayList<>();
    public static ArrayList<Class> classArrayList=new ArrayList<>();



    public static void main(String[] args) {

        Date date=new Date();

        //admin accounts
       Admin admin=new Admin("admin",1,"admin@email.com","password");
        Admin admin2=new Admin("admin2",2,"admin2@email.com","admin2pass");
        Collections.addAll(adminArrayList,admin,admin2);

       //student accounts
        Student petros=new Student("petros",1,"petros@gmail.com","petrospass");
        Student yosuf=new Student("yosuf",2,"yosuf@gmail.com","yosufpass");
        Student tony=new Student("tony",3,"tony@gmail.com","tonypass");
        Student feng=new Student("feng",4,"feng@gmail.com","fengpass");
        Collections.addAll(studentArrayList,petros,yosuf,tony,feng);


        //faculty account
       Faculity victor=new Faculity("victor",1,"victor@gmail.com","victorpass");
        Faculity beth=new Faculity("beth",2,"beth@gmail.com","bethpass");
        Faculity david=new Faculity("david",3,"david@gmail.com","davidpass");
       Faculity tom=new Faculity("tom",4,"tom@gmail.com","tompass");
        Collections.addAll(faculityArrayList,victor,beth,david,tom);

        //class account
        Class java=new Class(100,"java","Introduction to core java");
        Class python=new Class(101,"python","Introduction to python");
        Class javascript=new Class(102,"javascript","Introduction to javascript");
        Class bootstrap=new Class(103,"bootstrap","Introduction to bootstrap ");
        Collections.addAll(classArrayList,java,python,javascript,bootstrap);

        //Enroll a student to a class and add faculty to a class

        java.setStudentId(petros.getId());
        java.setFacultyId(victor.getId());
        java.setEnrollDate(date.toString());

        python.setStudentId(tony.getId());
        python.setFacultyId(beth.getId());
        python.setEnrollDate("05/30/2019");

        Methods methods=new Methods();
        methods.Welcome(adminArrayList,faculityArrayList,studentArrayList,classArrayList);

    }


}
