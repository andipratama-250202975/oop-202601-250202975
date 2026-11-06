

# Catatan Minggu 05: Abstraction

Yang saya kerjakan

Pada minggu kelima, saya mempelajari dan menerapkan konsep abstraction dalam pemrograman Java. Saya mengubah kelas Aset menjadi abstract class dan mengimplementasikan method bisaDipinjam() sesuai aturan status dan kondisi aset. Saya juga mengimplementasikan interface AturanDenda pada kelas DendaFlat dan DendaProgresif. Setelah selesai, saya menjalankan pengujian Minggu 1 sampai Minggu 5 dan seluruh 32 tes berhasil tanpa error.

## Keputusan desain

Saya memutuskan untuk menjadikan kelas Aset sebagai abstract class karena Aset merupakan kelas induk dari beberapa jenis aset, seperti Ruang, Laptop, dan AlatLab.
Method hitungDenda() juga saya jadikan abstract agar setiap kelas turunan dapat memberikan implementasi perhitungan denda masing-masing.
Untuk method bisaDipinjam(), saya menetapkan bahwa aset hanya dapat dipinjam jika statusnya TERSEDIA dan kondisinya bukan RUSAK_BERAT.
Pada perhitungan denda, saya menggunakan dua aturan:
Denda flat dihitung dengan memanggil aset.hitungDenda(hariTerlambat).
Denda progresif menggunakan rumus Denda Flat × (1 + 0,05 × jumlah hari keterlambatan).
Rumus progresif dipilih karena sederhana dan membuat denda semakin besar ketika keterlambatan bertambah.
Keputusan desain ini dicatat dalam docs/asumsi.md.

## Kendala

Kendala yang saya temui adalah memahami perbedaan abstract class dan interface serta menentukan implementasi method yang sesuai dengan aturan tugas.
Saya juga perlu menyesuaikan kelas Aset setelah dijadikan abstract agar kelas turunannya tetap dapat digunakan.
Saya mengatasinya dengan mempelajari kembali struktur kode, memperbaiki method yang masih memiliki TODO, dan menjalankan tes otomatis untuk memastikan implementasi sudah benar.

## Penggunaan AI

- Alat yang dipakai: ChatGPT.

- Bagian yang dibantu AI: Kelas Aset, method bisaDipinjam(), method hitungDenda(), kelas DendaFlat, dan kelas DendaProgresif.

- Prompt utama:
"Jelaskan perintah t ugas Minggu 5: Abstraction."
"Bantu perbaiki kode Aset.java agar menjadi abstract class dan implementasikan method bisaDipinjam()."
"Bantu implementasikan DendaFlat dan DendaProgresif sesuai aturan tes Minggu 5."

- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan kode yang diberikan AI dengan struktur package, nama atribut, enum, dan method yang sudah ada di proyek. Saya juga memeriksa hasil implementasi menggunakan tes otomatis sebelum menerimanya.

- Satu hal yang saya pahami lebih baik sekarang: Saya lebih memahami bahwa abstract class digunakan sebagai kelas dasar yang tidak dapat dibuat objek secara langsung, sedangkan interface digunakan sebagai kontrak kemampuan yang harus diimplementasikan oleh suatu kelas. Saya juga memahami cara menggunakan abstract method dan menerapkan beberapa aturan denda melalui interface.