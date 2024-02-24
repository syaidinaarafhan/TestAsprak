public class LinkedLists {
    Pegawai head;

    public LinkedLists() {
        this.head = null;
    }

    public void inputAwal(int nip, String nama, String divisi) {
        Pegawai pegawai = new Pegawai(nip, nama, divisi);
        pegawai.next = head;
        head = pegawai;
    }

    public void inputAkhir(int nip, String nama, String divisi) {
        Pegawai pegawai = new Pegawai(nip, nama, divisi);
        if (head == null) {
            head = pegawai;
            return;
        }
        Pegawai pegawaiAkhir = head;
        while (pegawaiAkhir.next != null) {
            pegawaiAkhir = pegawaiAkhir.next;
        }
        pegawaiAkhir.next = pegawai;
    }

    public void hapusDepan() {
        if (head == null) {
            System.out.println("Tidak ada pegawai");
            return;
        }
        head = head.next;
    }

    public void hapusAkhir() {
        if (head == null) {
            System.out.println("Tidak ada pegawai");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Pegawai prev = null;
        Pegawai current = head;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }

    public void CetakSeluruhData() {
        if (head == null) {
            System.out.println("Tidak ada pegawai");
            return;
        }
        Pegawai current = head;
        System.out.println("Data Pegawai :");
        while (current != null) {
            System.out.println("NIP : " + current.nip + ", Nama : " + current.nama + ", Divisi : " + current.divisi);
            current = current.next;
        }
    }
}
