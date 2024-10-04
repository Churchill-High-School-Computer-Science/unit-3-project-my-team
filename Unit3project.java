import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
   String correctWord = "Pineapple";
   Scanner input = new Scanner(System.in);  // Create a Scanner object
   System.out.println("Welcome to the 20 Questions game!\n You have 20 Questions to guess the word I am thinking of");
   System.out.println("You're first hints are that its tangible people interact with it all the time");
   System.out.println("For every 5 questions you get wrong, you will get receive more hints.");

   System.out.println("What is your first answer? ");
   String numAnswer = input.nextLine();
   if (numAnswer != correctWord){
       System.out.println("Wrong choice! Try again!");
   }
   String numAnswer2 = input.nextLine();
   if (numAnswer2 != correctWord){
    System.out.println("Wrong choice! Try again! ");
   }
   

}
}