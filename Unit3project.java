import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
   String correctWord = "Pineapple";
   Scanner input = new Scanner(System.in);  // Create a Scanner object
   System.out.println("Welcome to the 20 Questions game!\n You have 20 Questions to guess the word I am thinking of");
   System.out.println("You're first hints are that its tangible people interact with it all the time");
   System.out.println("For every 4-5 questions you get wrong, you will get receive more hints.");

   System.out.println("What is your first answer? ");
   String numAnswer = input.nextLine();
   
   
    if (numAnswer != correctWord){
       System.out.println("Wrong choice! Try again!");
   }
   System.out.println("Second Answer: ");
   String numAnswer2 = input.nextLine();
    if (numAnswer2 != correctWord){
    System.out.println("Wrong choice! Try again! ");
   }
   System.out.println("Third Answer: ");
   String numAnswer3 = input.nextLine();
   if (numAnswer3 != correctWord) {
    System.out.println("Wrong choice! Try again! ");
   } 
   System.out.println("Fourth Answer: ");
  String numAnswer4 = input.nextLine();
  if (numAnswer4 != correctWord) {
    System.out.println("Wrong choice! Try again! ");
  }
  System.out.println("Fifth Answer: ");
  String numAnswer5 = input.nextLine();
  if (numAnswer5 != correctWord) {
    System.out.println("Wrong choice! Try again! ");

  }
  System.out.println("Time for your first hint! It is yellow.");
  
  System.out.println("Sixth Answer: ");
  String numAnswer6 = input.nextLine();
  if (numAnswer6 != correctWord){
    System.out.println("Wrong choice! Try again! ");

  }
  System.out.println("Seventh Answer: ");
  String numAnswer7 = input.nextLine();
  if (numAnswer7 != correctWord){
    System.out.println("Wrong choice! Try again! ");

  }
  System.out.println("Eight Answer: ");
  String numAnswer8 = input.nextLine();
  if (numAnswer8 != correctWord) {
    System.out.println("Wrong choice! Try again! ");

  }
  System.out.println("Ninth Answer: ");
  String numAnswer9 = input.nextLine();
  if (numAnswer9 != correctWord){
    System.out.println("Wrong choice! Try again! ");

  
}
System.out.println("Tenth Answer: ");
String numAnswer10 = input.nextLine();
if (numAnswer10 != correctWord){
  System.out.println("Wrong choice! Try again! ");

}
System.out.println("Here is your second hint. It is a flavor in certain dishes and beverages. ");
System.out.println("Eleventh Answer: ");
String numAnswer11 = input.nextLine();
if (numAnswer11 != correctWord){
  System.out.println("Wrong choice! Try again! ");
}
System.out.println("Twelfth Answer: ");
String numAnswer12 = input.nextLine();
if (numAnswer12 != correctWord){
  System.out.println("Wrong choice! Try again! ");

}
System.out.println("Thirteenth Answer: ");
String numAnswer13 = input.nextLine();
if (numAnswer13 != correctWord){
  System.out.println("Wrong choice! Try again! ");
}
System.out.println("Fourteenth Answer: ");
String numAnswer14 = input.nextLine();
if (numAnswer14 != correctWord){
  System.out.println("Wrong choice! Try again! ");
}
System.out.println("Fifteenth Answer: ");
String numAnswer15 = input.nextLine();
if (numAnswer15 != correctWord){
  System.out.println("Wrong choice! Try again! ");

}
System.out.println("Time for your third hinth. It is something people usually eat everyday. ");
}
}