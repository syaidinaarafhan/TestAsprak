import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedLists linkedList = new LinkedLists();

        while (true) {
            System.out.println("Pilih Menu:");
            System.out.println("1. Input di awal \n2. Input di akhir \n3. Hapus di awal \n4. Hapus di akhir \n5. Cetal Seluruh Data ");
            System.out.println("6. Keluar ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("NIP : ");
                    int nipAwal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama : ");
                    String namaAwal = scanner.nextLine();
                    System.out.print("Divisi : ");
                    String divisiAwal = scanner.nextLine();
                    linkedList.inputAwal(nipAwal, namaAwal, divisiAwal);
                    break;
                case 2:
                    System.out.print("NIP : ");
                    int nipAkhir = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama : ");
                    String namaAkhir = scanner.nextLine();
                    System.out.print("Divisi : ");
                    String divisiAkhir = scanner.nextLine();
                    linkedList.inputAkhir(nipAkhir, namaAkhir, divisiAkhir);
                    break;
                case 3:
                    linkedList.hapusDepan();
                    System.out.println("Pegawai terhapus");
                    break;
                case 4:
                    linkedList.hapusAkhir();
                    System.out.println("Pegawai terhapus");
                    break;
                case 5:
                    linkedList.CetakSeluruhData();
                    break;
                case 6:
                    System.out.println("anda sudah keluar");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("pilihan tidak ada");
            }
            System.out.println();
        }
    }
}