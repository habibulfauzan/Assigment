import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int ang = n.nextInt();
    
    if ( ang > 75) {
      System.out.println("Sangat Bagus");
    }else if ( ang >= 55) {
      System.out.println("Bagus");
    }else {
      System.out.println("Kurang");
    }
  }
}