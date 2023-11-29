package projekpbo;

import java.util.ArrayList;
import java.util.List;

class AnggotaPerpustakaan {
    private String nama;
    private long nomorAnggota;
    private String alamat;
    private List<Buku> historiPeminjaman;

    public AnggotaPerpustakaan(String nama, long nomorAnggota, String alamat) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
        this.historiPeminjaman = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getNomorAnggota() {
        return nomorAnggota;
    }

    public void setNomorAnggota(int nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public List<Buku> getHistoriPeminjaman() {
        return historiPeminjaman;
    }

    public void cariDanTampilkanBuku(List<Buku> daftarBuku, String judul) {
        Buku bukuDitemukan = null;

        for (Buku buku : daftarBuku) {
            if (buku.getJudulBuku().equals(judul)) {
                bukuDitemukan = buku;
                break;
            }
        }

        if (bukuDitemukan != null) {
            System.out.println("Buku dengan judul :" + judul + " ditemukan:");
            System.out.println("No ISBN : " + bukuDitemukan.getNoIsbn());
            System.out.println("Pengarang : " + bukuDitemukan.getPengarang());
        } else {
            System.out.println("Pencarian gagal. Buku dengan judul :" + judul + " tidak ditemukan.");
        }
        System.out.println();
    }
}
