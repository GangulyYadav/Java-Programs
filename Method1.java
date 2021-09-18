class BCAStudent {
    String year;
    int no_of_student;
    int total_sub;
    int per_in_year;

    void print(String y, int n, int t, int p) {
        year = y;
        no_of_student = n;
        total_sub = t;
        per_in_year = p;
        System.out.println("I am studing in :" + y);
        System.out.println("Total no of student in 1st year :" + n);
        System.out.println("Total subject in 1st year:" + t);
        System.out.println("How many percentage in 1st year:" + p);

    }

    void print(String a, int b, int c) {
        year = a;
        no_of_student = b;
        total_sub = c;
        System.out.println("I am studing in :" + a);
        System.out.println("Total no of student in 2nd year :" + b);
        System.out.println("Total subject in 2nd year:" + c);

    }

    void print() {
        System.out.println("I cannot jump in 3rd year");
    }
}

class Method1 {
public static void main(String args[]) 
{
   BCAStudent b1 =new BCAStudent();
   b1.print("1st year",130,8,86);
   

   BCAStudent b2 =new BCAStudent();
   b2.print("2nd year",120,8);
   
   System.out.println("Result are see on online");

   BCAStudent b3 =new BCAStudent();
   b3.print();
}
}
