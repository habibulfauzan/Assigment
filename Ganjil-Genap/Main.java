import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int angka = n.nextInt();
    
    if (angka % 2 == 0){
      System.out.println("Genap");
    }else{
      System.out.println("Ganjil");
    }
    
  }
}