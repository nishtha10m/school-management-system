package schoolManagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nishtha.
 */
public class Main {
    public static void main(String[] args) {
        Teacher keith = new Teacher(1,"Keith",500);
        Teacher chelsi = new Teacher(2,"Chelsi",700);
        Teacher john = new Teacher(3,"John",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(keith);
        teacherList.add(chelsi);
        teacherList.add(john);


        Student evaan = new Student(1,"Evaan",4);
        Student nishtha = new Student(2,"Nishtha",12);
        Student chris = new Student(3,"Chris",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(evaan);
        studentList.add(nishtha);
        studentList.add(chris);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        evaan.payFees(5000);
        nishtha.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        keith.receiveSalary(keith.getSalary());
        System.out.println("GHS has spent for salary to " + keith.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());

        john.receiveSalary(john.getSalary());
        System.out.println("GHS has spent for salary to " + john.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(nishtha);

        chelsi.receiveSalary(chelsi.getSalary());
        System.out.println(chelsi);


    }
}