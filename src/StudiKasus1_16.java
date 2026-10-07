  import java.util.Scanner;

    public class StudiKasus1_16 {
        public static void main(String[] args) {

            Scanner aldo = new Scanner(System.in);

            int hargaPerCup = 19000;
            int syaratMinBelanja = 90000;
            int persenDiskon = 9;

            int jumlahCup;
            int uangBayar;
            int totalHarga;
            int diskon = 0;
            int totalBayar;
            int kembalian;
            int kurang;

            System.out.print("Masukkan jumlah cup: ");
            jumlahCup = aldo.nextInt();

            System.out.print("Masukkan uang bayar: ");
            uangBayar = aldo.nextInt();

            totalHarga = jumlahCup * hargaPerCup;

            if (totalHarga >= syaratMinBelanja) {
                diskon = totalHarga * persenDiskon/100 ;
            } else {
                diskon = 0;
            }

            totalBayar = totalHarga - diskon;

            System.out.println("Total harga: Rp " + totalHarga);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total bayar: Rp " + totalBayar);

            if (uangBayar >= totalBayar) {
                kembalian = uangBayar - totalBayar;
                System.out.println("Kembalian: Rp " + kembalian);
            } else {
                kurang = totalBayar - uangBayar;
                System.out.println("Kurang: Rp " + kurang);
            }
        }
    }