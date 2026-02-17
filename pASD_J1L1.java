import java.util.Scanner;
public class pASD_J1L1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nilaiHuruf="", status="";
    System.out.println("Program Hitung Nilai Akhir\n===========================");
    System.out.print("Masukkan Nilai Tugas = ");
    int tugas = sc.nextInt();
    System.out.print("Masukkan Nilai Kuis = ");
    int kuis = sc.nextInt();
    System.out.print("Masukkan Nilai UTS = ");
    int uts = sc.nextInt();
    System.out.print("Masukkan Nilai UAS = ");
    int uas = sc.nextInt();
    if (tugas>100||tugas<0||kuis>100||kuis<0||uts>100||uts<0||uas>100||uas<0){
      System.out.println("Nilai tidak valid. Masukkan angka 0-100.");
    } else {
      double nilaiAkhir = ((tugas*0.2)+(kuis*0.2)+(uts*0.3)+(uas*0.3));
      if (nilaiAkhir>80) {nilaiHuruf="A";}
        else if (nilaiAkhir<=80 && nilaiAkhir>73) {nilaiHuruf="B+";}
        else if (nilaiAkhir<=73 && nilaiAkhir>65) {nilaiHuruf="B";}
        else if (nilaiAkhir<=65 && nilaiAkhir>60) {nilaiHuruf="C+";}
        else if (nilaiAkhir<=60 && nilaiAkhir>50) {nilaiHuruf="C";}
        else if (nilaiAkhir<=50 && nilaiAkhir>39) {nilaiHuruf="D";}
        else if (nilaiAkhir<=39) {nilaiHuruf="E";}
      if (nilaiHuruf.equalsIgnoreCase("D")||nilaiHuruf.equalsIgnoreCase("E")){
        status="TIDAK LULUS.";
      } else {status="LULUS.";}
      System.out.println("===================");
      System.out.printf("Nilai Akhir = %.2f \n", nilaiAkhir);
      System.out.println("Nilai Huruf = "+nilaiHuruf);
      System.out.println("===================");
      System.out.println("STATUS ANDA : "+status);
      System.out.println("===================");
    }
    sc.close();
  }
}