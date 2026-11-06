# Catatan Minggu 03: Inheritance (Pewarisan)

## Yang saya kerjakan

Pada minggu ketiga ini, saya mengerjakan tiga class baru, yaitu Ruang.java, Laptop.java, dan AlatLab.java dengan menerapkan konsep inheritance atau pewarisan. Ketiga class tersebut mewarisi atribut dan validasi dari class Aset.java menggunakan extends dan super(). Saya juga menambahkan atribut khusus, konstruktor, getter, serta method getJenis() sesuai dengan jenis aset masing-masing. Selain itu, saya menambahkan validasi agar data yang dimasukkan tidak boleh kosong atau memiliki nilai yang tidak sesuai aturan.

## Keputusan desain

Saya menempatkan atribut kode dan nama pada class Aset karena kedua atribut tersebut digunakan oleh semua jenis aset. Sementara itu, atribut kapasitas ditempatkan pada class Ruang, spesifikasi dan nomor inventaris pada class Laptop, serta laboratorium dan tingkat risiko pada class AlatLab. Saya memilih pembagian tersebut agar setiap class hanya memiliki atribut yang sesuai dengan fungsinya dan tidak terjadi pengulangan kode.

## Kendala

Kendala yang saya temui adalah memahami cara menggunakan inheritance, terutama penggunaan extends dan super() untuk memanggil konstruktor dari class induk. Saya juga perlu memahami cara membuat validasi agar data tidak boleh kosong dan memastikan method getJenis() menghasilkan nilai yang sesuai. Saya mengatasinya dengan mempelajari kembali struktur class Aset dan mencoba melengkapi kode secara bertahap.

## Penggunaan AI

- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: Class Ruang.java, Laptop.java, dan AlatLab.java.
- Prompt utama:
  1. Bagaimana cara melengkapi class Ruang dengan konsep inheritance?
  2. Bagaimana membuat validasi spesifikasi dan nomor inventaris pada class Laptop?
  3. Bagaimana menerapkan inheritance pada class AlatLab menggunakan tipe data TingkatRisiko?
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan kode yang diberikan AI dengan kerangka program dan tipe data yang sudah tersedia di proyek, terutama penggunaan TingkatRisiko pada class AlatLab agar sesuai dengan struktur program.
- Satu hal yang saya pahami lebih baik sekarang: Saya lebih memahami bahwa inheritance digunakan untuk mewariskan atribut dan method dari class induk ke class turunan sehingga kode bisa digunakan kembali tanpa harus menulis ulang bagian yang sama.