class AverageAge {
  public static void main(String[] args) {
    int mumAge = 62;
    int sonAge = 11;
    int wifeAge = 39;
    int dadAge = 70;
    int countOfFamilyMember = 4;
    double averageAge = (mumAge + sonAge + wifeAge + dadAge) / (double)countOfFamilyMember;

    System.out.println("Mum's age is: " + mumAge);
    System.out.println("Son's age is: " + sonAge);
    System.out.println("Wife's age is: " + wifeAge);
    System.out.println("Dad's age is: " + dadAge);
    System.out.println("The age's average is: " + averageAge);
  }
}