import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);

  String nama;
  int harian, uts, uas;
  double akumulasi;

  System.out.print("Masukan nama Mahasiswa: ");
  nama = scanner.nextLine();

  System.out.print("Masukan nilai Harian: ");
  harian = scanner.nextInt(); 
 
  System.out.print("Masukan nilai UTS: ");
  uts = scanner.nextInt(); 

  System.out.print("Masukan nilai UAS: ");
  uas = scanner.nextInt();
 
  akumulasi = harian * 30 / 100 + uts * 30 / 100 + uas * 40 / 100;
 
  System.out.println("===================================");
  System.out.println("Hai " + nama);
  System.out.println("Nilai Harian : " + harian);
  System.out.println("Nilai UTS : " + uts);
  System.out.println("Nilai UAS : " + uas);
  System.out.println("Akumulasi Nilai : " + akumulasi);
  System.out.println("===================================");
 }
}