import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    String[] bulan = {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
    };
    
    int tanngal = n.nextInt();
    int nobulan = n.nextInt();
    int tahun = n.nextInt();
    
    System.out.print(tanngal + bulan[nobulan - 1] + tahun);
    
  }
}