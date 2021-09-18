// Java program to create an employee class
// CWH practice set 8 question 1
// By Ganguly Yadav
// 26th July 2021

class Emp{
    int salary;
    String name;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Employee{
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.setSalary(50000);      
        e1.setName("Rahul");      
        System.out.println(e1.getSalary());
        System.out.println( e1.getName());
    }
}