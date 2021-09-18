class Cpp
{
  void cpp_method()
   {
   System.out.println("Cpp is develper by Bjarne Stroustrup in 1979");

   System.out.println("Cpp is based on only C");
   System.out.println("Cpp is a platform Dependent");
   System.out.println("Cpp support 63 keyword");
   System.out.println("Cpp also support datatype(union,structure)");

   System.out.println("Cpp is support all type inheritance");
   System.out.println("Cpp is used the delete keyword");
   System.out.println("Cpp support Constructor as well as Destructor");
   System.out.println("Cpp support the Array and pointers");

   System.out.println("Cpp code is exicuted directly");
   System.out.println("Cpp is supported(#header file,#define)");
   System.out.println("Cpp use only one translator i.e compiler");
   System.out.println("it is object oriented programming language");
  }
 
}

class Java
{
   void java_method(){
   System.out.println("Java is develper by James Gosling  in 1991");

   System.out.println("Java is based on  C and Cpp");
   System.out.println("Java is a platform Independent");
   System.out.println("Java support 50 define keyword");
   System.out.println("Java is not support datatype(union,structure)");

   System.out.println("Java is support except Multiple inheritance");
   System.out.println("Java is not used the delete keyword");
   System.out.println("Java is support only Constructor ");
   System.out.println("Java is support only the Array ");

   System.out.println("Java code is exicuted by JVM (java virtual machine)");
   System.out.println("Java is used packages(import)");
   System.out.println("Java is interpreted languages so use both translator i.e compiler and interpreter");
   System.out.println("it is pure object oriented programming language");
  }
}
 

public class TwoClass
{
  public static void main(String args[])
  {
  Cpp c = new Cpp();
  Java j = new Java();
  c.cpp_method();
  j.java_method();
  }
}