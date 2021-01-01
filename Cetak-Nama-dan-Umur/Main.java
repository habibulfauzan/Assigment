import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //nama
      String nama = input.nextLine();
      
      //tahun lahir
      int tahun = input.nextInt();
      
      //output
      System.out.printf("%s", nama + " ("+(2020-tahun) + " tahun)");
       
    }
}