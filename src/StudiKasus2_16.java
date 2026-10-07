import java.util.Scanner;

public class StudiKasus2_16 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = aldo.nextLine();

        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = aldo.nextLine();

        System.out.print("Masukkan jumlah dokumen: ");
        int jumlahDokumen = aldo.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Masukkan peringkat/juara: ");
            int peringkat = aldo.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println(namaMahasiswa + " Berhak memperoleh dana penghargaan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Dokumen milik " + namaMahasiswa + " tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println(namaMahasiswa + " Bukan peraih Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Cabang lain belum ada.");
    
        }
    }
}
