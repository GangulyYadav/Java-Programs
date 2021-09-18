public class unittesting{
    public static void main(String[] args) {
        switch(90) {
            case 90 :
               System.out.println("Excellent!");
            case 80 :
            case 70 :
               System.out.println("Well done");
            case 60 :
               System.out.println("You passed");
               break;
            case 40 :
               System.out.println("Better try again");
            default :
            System.out.println("Invalid grade");
         }
         System.out.println("Your grade is ");
      
    }
}