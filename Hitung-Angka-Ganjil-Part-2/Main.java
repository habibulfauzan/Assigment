import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int a = n.nextInt();
    int b = n.nextInt();
    int matrix[][] = new int[a][b];
    
    for (int baris = 0; baris < a; baris++){
      for (int kolom = 0; kolom < b; kolom++){
        matrix[baris][kolom] = n.nextInt();
      }
    }
    int ganjil = 0;
    for (int baris = 0; baris < a; baris++){
      for (int kolom = 0; kolom < b; kolom++){
        if (matrix[baris][kolom] % 2 != 0){
          ganjil++;
        }
      }
      System.out.println(ganjil);
      ganjil = 0;
    }
  }
}