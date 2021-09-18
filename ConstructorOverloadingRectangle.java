// Java program to overload a constructor and initialize its parameters
// CWH practice set 9 question 4
// By Ganguly Yadav
// 28th July 2021
class Constructor{
    int length;
    int breadth;
    Constructor(){
        System.out.println("This is defualt Constructor!");
    }

    Constructor(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
        System.out.println("This is overloaded constructor.\nThe length = "+length+" \nThe breadth is = "+breadth);
    }
}

public class ConstructorOverloadingRectangle{
    public static void main(String[] args) {
        Constructor c = new Constructor();
        Constructor c1 = new Constructor(4,5);        
    }
}