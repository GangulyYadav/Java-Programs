// Java program to create a class monkey with jump() and bite() and also create a class human which inherits
// the monkey class and implements the animal interface which have sleep and eat methods
// CWH practice set 11 question 3
// By Ganguly Yadav
// 3rd August 2021

interface BasicAnimal{
    void sleep();
    void eat();
}

class Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}


public class Human extends Monkey implements BasicAnimal{
    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
    
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    
    public static void main(String[] args) {
        Human Men = new Human();
        Men.bite();
        Men.eat();
        Men.jump();
        Men.sleep();
    }
}
