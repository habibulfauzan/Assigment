import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    
    int ang = 0;
    int ganjil = 0;
    
    try {
      while(true){
        ang = n.nextInt();
        if (ang %2 != 0){
          ganjil++;
        }
      }
    }catch(NumberFormatException err){
      System.out.println(ganjil);
    }catch(Exception err){
      System.out.println(ganjil);
    }
  }
}