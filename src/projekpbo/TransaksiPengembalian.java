package projekpbo;

public class TransaksiPengembalian extends Notifikasi {
    private String waktuKembali;
    private String tanggalKembali;
    private String durasiKembali;

    public TransaksiPengembalian(String waktuKembali, String tanggalKembali, String durasiKembali) {
        this.waktuKembali = waktuKembali;
        this.tanggalKembali = tanggalKembali;
        this.durasiKembali = durasiKembali;
    }

    public String getWaktuKembali() {
        return waktuKembali;
    }

    public void setWaktuKembali(String waktuKembali) {
        this.waktuKembali = waktuKembali;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getDurasiKembali() {
        return durasiKembali;
    }

    public void setDurasiKembali(String durasiKembali) {
        this.durasiKembali = durasiKembali;
    }
    
    @Override
    public void notifikasiBatasWaktu() {
        System.out.println("Notifikasi: Batas waktu pengembalian telah mencapai.");
        System.out.println("Notifikasi: Buku telah direstorasi.");
    }

}