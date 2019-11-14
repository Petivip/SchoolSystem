import java.util.ArrayList;
import java.util.Scanner;

public class AdminMethod {
   public Scanner key=new Scanner(System.in);
    public void AdminMethods(ArrayList<Student> list,ArrayList<Faculity> list1,ArrayList<Class> list2){
      String ver="yes";
      do{
          System.out.println( );
        System.out.println("Options :");
        System.out.println("1 = Add Student");
        System.out.println("2 = Add Faculty");
        System.out.println("3 = Edit Student");
        System.out.println("4 = Edit Faculty");
        System.out.println("5 = Add Class");
        System.out.println("6 = Edit Class");
        System.out.println("7 = Enroll Student");
        System.out.println("8 = Hire a Faculty");
        System.out.println("9 = View All information");
        System.out.println("Enter \"q\" to quit");
        String ans=key.next();

        switch (ans){
            case "1":
               addStudent(list);
                break;
            case "2":
                addFaculty(list1);
                break;
                case "3":
                   editStudent(list);
                break;
            case "4":
                editFaculty(list1);
                break;
            case "5":
               addClass(list2);
                break;
            case "6":
                editClass(list2);
                break;
            case "7":
               EnrollStudent(list2,list);
                break;
            case "8":
               HireFaculty(list2,list1);
                break;
                case "9":
               displayAll(list,list1,list2);
                break;
                case "q":
              ver="no";
                break;



        }
      }while(ver.equalsIgnoreCase("yes"));
    }

    public void addStudent(ArrayList<Student> list){
        System.out.println("Enter name of the student :");
        String name=key.next();
        System.out.println("Enter student email address : ");
        String email=key.next();
        System.out.println("Enter students password");
        String pass=key.next();
        Student student=new Student(name,list.size()+1,email,pass);
        list.add(student);

    }


    public void addFaculty(ArrayList<Faculity> list){
        System.out.println("Enter name of the teacher :");
        String name=key.next();
        System.out.println("Enter student email address : ");
        String email=key.next();
        System.out.println("Enter students password");
        String pass=key.next();
        Faculity teacher=new Faculity(name,list.size()+1,email,pass);
        list.add(teacher);

    }



    public void editStudent(ArrayList<Student> list){
        System.out.println("Enter name of the student :");
        String name=key.next();
        for(Student l:list){
            if(name.equalsIgnoreCase(l.getName())){
                System.out.println("Enter the new name :");
                l.setName(key.next());
                System.out.println("Enter student new email address : ");
                l.setEmail(key.next());
                System.out.println("Enter students new password");
               l.setPassword(key.next());
            }
        }


    }


    public void editFaculty(ArrayList<Faculity> list){
        System.out.println("Enter name of the faculty member :");
        String name=key.next();
        for(Faculity l:list){
            if(name.equalsIgnoreCase(l.getName())){
                System.out.println("Enter the new name :");
                l.setName(key.next());
                System.out.println("Enter student new email address : ");
                l.setEmail(key.next());
                System.out.println("Enter students new password");
                l.setPassword(key.next());
            }
        }


    }

    public void addClass(ArrayList<Class> list){
        System.out.println("Enter name of the class:");
        String name=key.next();
        System.out.println("Enter description : ");
        String description=key.next();

        Class newClass=new Class((101+list.size()),name,description);
        list.add(newClass);

    }

    public void editClass(ArrayList<Class> list){
        System.out.println("Enter name of the class:");
        String name=key.next();
        for(Class l:list){
            if(name.equalsIgnoreCase(l.getName())){
                System.out.println("Enter the new class name :");
                l.setName(key.next());
                System.out.println("Enter the new description : ");
                l.setDescription(key.next());

            }
        }

    }

    public void EnrollStudent(ArrayList<Class> list,ArrayList<Student> list1){
        System.out.println("Enter name of the class:");
        String nameClass=key.next();
        System.out.println("Enter name of the student:");
        String nameStudent=key.next();
        for(Class l:list){
            if(l.getName().equalsIgnoreCase(nameClass)){
                for(Student j:list1){
                    if (j.getName().equalsIgnoreCase(nameStudent)) {
                        l.setStudentId(j.getId());
                    }
                }
            }
        }
    }


    public void HireFaculty(ArrayList<Class> list,ArrayList<Faculity> list1){
        System.out.println("Enter name of the class:");
        String nameClass=key.next();
        System.out.println("Enter name of the teacher:");
        String nameFaculty=key.next();
        for(Class l:list){
            if(l.getName().equalsIgnoreCase(nameClass)){
                for(Faculity j:list1){
                    if (j.getName().equalsIgnoreCase(nameFaculty)) {
                        l.setFacultyId(j.getId());
                    }
                }
            }
        }
    }

    public void displayAll(ArrayList<Student> list,ArrayList<Faculity> list1,ArrayList<Class> list2){
        System.out.println("All Students : ");
        for(Student l:list){
            System.out.println();
            System.out.println("Student Id: " +l.getId());
            System.out.println("Student Name : " +l.getName());
            System.out.println();
        }
        System.out.println("All Faculty : ");
        for(Faculity j:list1){
            System.out.println();
            System.out.println("Faculty Id: " +j.getId());
            System.out.println("Faculty Name : " +j.getName());
            System.out.println();
        }

        System.out.println("All classes : ");
        for(Class i:list2){
            System.out.println();
            System.out.println("Student Id: " +i.getId());
            System.out.println("Class Name : " +i.getName());
            System.out.println("Class Description : " +i.getDescription());
            System.out.println();
        }
    }

}
