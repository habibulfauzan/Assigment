import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int angka = n.nextInt();
    
    if ( angka >= 55) {
      System.out.println("Selamat! Anda lulus dengan nilai " + angka + "\nProgram selesai");
    }else {
      System.out.println("Program selesai");
    }
  }
}