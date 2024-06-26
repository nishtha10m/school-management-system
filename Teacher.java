package schoolManagement;

/**
 * Created by Nishtha.
 * This class is responsible for keeping the track of teacher's name, id, salary.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    //return the id of the teacher.
    public int getId(){
        return id;
    }

    //return name of the teacher.
    public String getName(){
        return name;
    }


    //return the salary of the teacher.
    public int getSalary(){
        return  salary;
    }

    //set the salary.
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * Adds  to salaryEarned.
     * Removes from the total money earned by the school.
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}
