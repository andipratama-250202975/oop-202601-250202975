
package id.ac.upb.asetpinjam.denda;
import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

/**
 * Minggu 5: denda yang makin berat bila makin lama terlambat.
 *
 * Rumus: denda flat * (1 + 0.05 * hariTerlambat)
 */
public class DendaProgresif implements AturanDenda {

    @Override
    public long hitung(Aset aset, int hariTerlambat) {

        if (hariTerlambat < 0) {
            throw new IllegalArgumentException(
                    "Hari terlambat tidak boleh negatif"
            );
        }

        if (hariTerlambat == 0) {
            return 0;
        }

        long dendaFlat = aset.hitungDenda(hariTerlambat);

        return Math.round(dendaFlat * (1 + 0.05 * hariTerlambat));
    }
}
