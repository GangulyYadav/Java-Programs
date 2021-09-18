class Student{
    int id;
    String name;
    int age;

    // Creating two arg constructor
    Student(int i,String n){
        id = i;
        name = n;
    }

    // Creating three arg constructor
    Student(int i,String n,int a){
        id = i;
        name = n;
        age = a;
    }

    void display(){
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String[] args) {
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan",25);
        System.out.println("Student information:");
        s1.display();
        s2.display();
    }
}