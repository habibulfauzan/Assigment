import java.util.Scanner;

class Main {
    static double p, l;
    
    public static void main(String[] args){
      Scanner n = new Scanner(System.in);
      p = n.nextDouble();
      l = n.nextDouble();
      
      System.out.println("Ukuran Luas : "+luas(p, l)+" cm");
      System.out.println("Ukuran Keliling : "+keliling(p, l)+" cm");
    }
    
    //Luas
    public static double luas(double p, double l){
        return p*l;
    }
    
    //Keliling
    public static double keliling(double p, double l){
		return 2*(p+l);
    }
}