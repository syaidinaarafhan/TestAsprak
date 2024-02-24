public class Pegawai {
    int nip;
    String nama;
    String divisi;
    Pegawai next;

    public Pegawai(int nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
        this.next = null;
    }
}
