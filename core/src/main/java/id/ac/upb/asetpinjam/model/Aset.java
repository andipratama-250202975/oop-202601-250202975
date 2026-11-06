package id.ac.upb.asetpinjam.model;

import id.ac.upb.asetpinjam.config.Varian;
import id.ac.upb.asetpinjam.kontrak.DapatDipinjam;

public class Aset implements DapatDipinjam {

    private String kode;
    private String nama;
    private StatusAset status;
    private Kondisi kondisi;

    public Aset(String kode, String nama) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode tidak boleh kosong");
        }

        this.kode = kode.trim();
        setNama(nama);

        this.status = StatusAset.TERSEDIA;
        this.kondisi = Kondisi.BAIK;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public StatusAset getStatus() {
        return status;
    }

    public Kondisi getKondisi() {
        return kondisi;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }

        this.nama = nama.trim();
    }

    public void setStatus(StatusAset status) {
        if (status == null) {
            throw new IllegalArgumentException("Status tidak boleh null");
        }

        this.status = status;
    }

    public void setKondisi(Kondisi kondisi) {
        if (kondisi == null) {
            throw new IllegalArgumentException("Kondisi tidak boleh null");
        }

        this.kondisi = kondisi;
    }

    // TODO minggu 5
    @Override
    public boolean bisaDipinjam() {
        throw new UnsupportedOperationException("TODO minggu 5");
    }

    // TODO minggu 3
    public JenisAset getJenis() {
        throw new UnsupportedOperationException("TODO minggu 3");
    }

    // TODO minggu 4
public long hitungDenda(int hariTerlambat) {
    return hitungDendaDenganPengali(hariTerlambat, 1);
}

protected long hitungDendaDenganPengali(int hariTerlambat, int pengali) {
    if (hariTerlambat < 0) {
        throw new IllegalArgumentException("Hari terlambat tidak boleh negatif");
    }

    if (hariTerlambat == 0) {
        return 0;
    }

    return (long) hariTerlambat * pengali * Varian.aktif().dendaPerHari;
}
}