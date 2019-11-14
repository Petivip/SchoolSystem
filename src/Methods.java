import java.util.ArrayList;
import java.util.Scanner;

public class Methods {


    public void Welcome(ArrayList<Admin> list,ArrayList<Faculity> list1,ArrayList<Student> list2,ArrayList<Class> list3){
        Scanner key=new Scanner(System.in);
        System.out.println( );
        System.out.println("Welcome to Montgomery College Online port ");
        System.out.println();
        String ver=" ";
        do {
            System.out.println( );
            System.out.println("Do you want to login? (Yes/No)");
            ver=key.next();
            if (ver.equalsIgnoreCase("yes")) {
                logIn(list, list1, list2, list3);
            } else {
                System.out.println();
                System.out.println("Please enter Yes or No ");

            }
        }while(!ver.equalsIgnoreCase("no"));
        System.out.println( );
        System.out.println("Good Bye! See you  ");
    }

    public void logIn(ArrayList<Admin> list,ArrayList<Faculity> list1,ArrayList<Student> list2,ArrayList<Class> list3){
        Scanner key=new Scanner(System.in);
        String answer="yes";
        do {
            System.out.println("Would like to login as an (A)dmin, (F)aculty or (S)tudent? (case sensitive)");
            String ans=key.next();

          switch (ans) {
              case "A":
                  log(list,list2,list1,list3);
                  answer="q";
                  break;
              case "F":
                  log1(list1);
                  answer="q";
                  break;
              case "S":
                  log2(list2);
                  answer="q";
                  break;
              default:
                  System.out.println("Please enter valid choose from above ");
                  System.out.println( );
                  break;

          }
      }while(!answer.equalsIgnoreCase("q"));
    }

    public void log(ArrayList<Admin> list,ArrayList<Student> list1,ArrayList<Faculity> list2,ArrayList<Class> list3) {
        AdminMethod adminMethod=new AdminMethod();
        Scanner key = new Scanner(System.in);
        String answer="yes";
        do {
            System.out.println("Please enter in your email : ");
            String email = key.next();
            System.out.println("Please enter in your password : ");
            String pass = key.next();
            for (Admin l : list) {
                if (l.getEmail().equalsIgnoreCase(email) && l.getPassword().equalsIgnoreCase(pass)) {
                    System.out.println("You are logged in as " + l.getName());
                    adminMethod.AdminMethods(list1,list2,list3);
                    answer="no";
                }
            }
            if(answer.equalsIgnoreCase("yes")) {
                System.out.println("You have enter wrong email or password ");
                System.out.println("Do you want to enter your email again or q? ");
                if (key.next().equalsIgnoreCase("q")) {
                    answer = "no";
                }
            }
        }while(!answer.equalsIgnoreCase("no"));
    }

    public void log1(ArrayList<Faculity> list) {
        Scanner key = new Scanner(System.in);
        String answer="yes";
        do {
            System.out.println("Please enter in your email : ");
            String email = key.next();
            System.out.println("Please enter in your password : ");
            String pass = key.next();
            for (Faculity l : list) {
                if (l.getEmail().equalsIgnoreCase(email) && l.getPassword().equalsIgnoreCase(pass)) {
                    System.out.println("You are logged in as " + l.getName());
                    answer="no";
                }
            }
            if(answer.equalsIgnoreCase("yes")) {
                System.out.println("You have enter wrong email or password ");
                System.out.println("Do you want to enter your email again or q? ");
                if (key.next().equalsIgnoreCase("q")) {
                    answer = "no";
                }
            }
        }while(!answer.equalsIgnoreCase("no"));
    }
    public void log2(ArrayList<Student> list) {
        Scanner key = new Scanner(System.in);
        String answer="yes";
        do {
            System.out.println("Please enter in your email : ");
            String email = key.next();
            System.out.println("Please enter in your password : ");
            String pass = key.next();
            for (Student l : list) {
                if (l.getEmail().equalsIgnoreCase(email) && l.getPassword().equalsIgnoreCase(pass)) {
                    System.out.println("You are logged in as " + l.getName());
                    answer="no";
                }
            }
            if(answer.equalsIgnoreCase("yes")) {
                System.out.println("You have enter wrong email or password ");
                System.out.println("Do you want to enter your email again or q? ");
                if (key.next().equalsIgnoreCase("q")) {
                    answer = "no";
                }
            }

        }while(!answer.equalsIgnoreCase("no"));
    }
}
