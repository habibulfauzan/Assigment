import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int total = n.nextInt();
    int angka[] = new int[total];
    
    for (int i = 0; i < total; i++){
      angka[i] = n.nextInt();
    }
    for (int i = total-1; i >= 0; i--){
      System.out.print(angka[i]);
    }
    
  }
}