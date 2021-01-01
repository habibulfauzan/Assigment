import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int arr[] = new int[5];

    for (int i = 0; i < arr.length; i++){
      arr[i] = n.nextInt();
    }
    for (int i = 4; i >= 0; i--){
      System.out.println(arr[i]);
    }
  }
}