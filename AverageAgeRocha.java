import java.util.Scanner;

class AverageAge {
  public static void main(String[] args) {
    int person1 = 0;
    int person2 = 0;
    int person3 = 0;
    int person4 = 0;
    int countOfFamilyMember = 4;
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("This program will calculate the average age of four people.");
    System.out.print("Enter an age for the person 1: ");
    person1 = in.nextInt();
    System.out.print("Enter an age for the person 2: ");
    person2 = in.nextInt();
    System.out.print("Enter an age for the person 3: ");
    person3 = in.nextInt();
    System.out.print("Enter an age for the person 4: ");
    person4 = in.nextInt();
    
    double averageAge = (person1 + person2 + person3 + person4) / (double)countOfFamilyMember;

    System.out.println("The average age is: " + averageAge);
    
    in.close();
  }
}