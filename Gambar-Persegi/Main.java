import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int angka = n.nextInt();
    
    for (int i = 0; i < angka; i++ ) {
      for (int k = 0; k < angka; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}