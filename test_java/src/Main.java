import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("何人分の情報を入力しますか:");
    int menber = scanner.nextInt();
    
    for(int i = 0; i < menber; i++){
      System.out.println(i + 1 + "人目");
      
      System.out.println("名前:");
      String firstName = scanner.next();

      System.out.println("名字:");
      String lastName = scanner.next();
    
      System.out.println("年齢:");
      int age = scanner.nextInt();
    
      System.out.println("身長(m):");
      double height = scanner.nextDouble();
    
      System.out.println("体重(kg):");
      double weight = scanner.nextDouble();
    
      Person.printDate(Person.fullName(firstName, lastName), age, height, weight, Person.bmi(height, weight));
    }
  }
}
