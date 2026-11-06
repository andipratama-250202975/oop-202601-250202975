package id.ac.upb.asetpinjam.model;


/** Minggu 3: alat laboratorium. Laboratorium tidak boleh kosong; risiko tidak boleh null. */
public class AlatLab extends Aset {

    // Field khusus alat laboratorium.
    private String laboratorium;
    private TingkatRisiko tingkatRisiko;

    public AlatLab(String kode, String nama, String laboratorium, TingkatRisiko tingkatRisiko) {
        super(kode, nama);

        if (laboratorium == null || laboratorium.isBlank()) {
            throw new IllegalArgumentException(
                "Nama laboratorium tidak boleh kosong"
            );
        }

        if (tingkatRisiko == null) {
            throw new IllegalArgumentException(
                "Tingkat risiko tidak boleh null"
            );
        }

        this.laboratorium = laboratorium;
        this.tingkatRisiko = tingkatRisiko;
    }

    public String getLaboratorium() {
        return laboratorium;
    }

    public TingkatRisiko getTingkatRisiko() {
        return tingkatRisiko;
    }

    @Override
    public String getJenis() {
        return "ALAT_LAB";
    }

}
