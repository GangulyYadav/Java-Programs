// Java program to demonstrate the use of package 
// By Ganguly Yadav
// 23rd July 2021

import java.util.Scanner;
// We can import all the classes from the package by using packagename.*
// import myPackage.*;

// Also we can import single class using packagename.Classname
import myPackage.Mul;
import myPackage.Div;
import myPackage.Sum;
import myPackage.Sub;
public class MyPackageUse {
    public static void main(String[] args) {
        Sum add = new Sum();
        Mul m = new Mul();
        Div d = new Div();
        Sub minus = new Sub();
        System.out.println(add.sum(20,30));
        System.out.println(minus.sub(20,30));
        System.out.println(d.div(20.0f,3.0f));
        System.out.println(m.mul(2.5f,2.0f));
    }
}
