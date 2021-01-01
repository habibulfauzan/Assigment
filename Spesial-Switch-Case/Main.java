import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int angka = n.nextInt();
    
    switch ( angka ) {
      case 1:
        System.out.println("Satu");
      case 2:
        System.out.println("Dua");
      case 3:
        System.out.println("Tiga");
    }
  }
}