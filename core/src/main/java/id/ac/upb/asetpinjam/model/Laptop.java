
/** Minggu 3: aset berupa laptop. Spesifikasi dan nomor inventaris tidak boleh kosong. */
public class Laptop extends Aset {

    // Field khusus laptop.
    private String spesifikasi;
    private String nomorInventaris;

    public Laptop(String kode, String nama, String spesifikasi, String nomorInventaris) {
        super(kode, nama);

        if (spesifikasi == null || spesifikasi.isBlank()) {
            throw new IllegalArgumentException(
                "Spesifikasi laptop tidak boleh kosong"
            );
        }

        if (nomorInventaris == null || nomorInventaris.isBlank()) {
            throw new IllegalArgumentException(
                "Nomor inventaris tidak boleh kosong"
            );
        }

        this.spesifikasi = spesifikasi;
        this.nomorInventaris = nomorInventaris;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public String getNomorInventaris() {
        return nomorInventaris;
    }

    @Override
    public String getJenis() {
        return "LAPTOP";
    }

    
}
