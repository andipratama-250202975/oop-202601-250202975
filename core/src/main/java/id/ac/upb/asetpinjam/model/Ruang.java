package id.ac.upb.asetpinjam.model;

/** Minggu 3: aset berupa ruang. Kapasitas harus lebih dari 0 (IllegalArgumentException). */
public class Ruang extends Aset {

    private int kapasitas;

    public Ruang(String kode, String nama, int kapasitas) {
        super(kode, nama);

        if (kapasitas <= 0) {
            throw new IllegalArgumentException(
                "Kapasitas ruang harus lebih dari 0"
            );
        }

        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.RUANG;
    }

    // Minggu 4: menghitung denda ruang dengan pengali 1
    @Override
    public long hitungDenda(int hariTerlambat) {
        return hitungDendaDenganPengali(hariTerlambat, 1);
    }
}