# Catatan Minggu 02: Struktur OOP – Class, Object, Encapsulation

## Yang Saya Kerjakan

Pada minggu kedua ini, saya mengerjakan class `Aset.java` dengan menerapkan konsep dasar OOP, yaitu *encapsulation*. Saya membuat beberapa atribut menggunakan akses `private`, kemudian melengkapi konstruktor, getter, dan setter.

Saya juga menambahkan validasi agar kode dan nama aset tidak boleh kosong atau bernilai `null`. Selain itu, saya mengatur status awal aset menjadi `TERSEDIA` dan kondisi awal menjadi `BAIK`.

## Keputusan Desain

Saya memilih menggunakan `private` pada semua atribut agar data di dalam class tidak bisa diakses atau diubah secara langsung dari luar class. Saya juga tidak membuat setter untuk kode karena kode aset harus tetap dan tidak boleh diubah setelah objek dibuat.

Untuk kode dan nama, saya menggunakan `trim()` agar spasi yang tidak diperlukan di bagian awal dan akhir bisa dihilangkan. Sementara itu, status dan kondisi saya beri validasi agar tidak menerima nilai `null`.

## Kendala

Selama mengerjakan tugas ini, saya sempat mengalami kesulitan dalam memahami beberapa bagian kode dan menyesuaikannya dengan struktur project yang sudah tersedia.

Saya juga sempat mengalami masalah saat menjalankan pengujian karena salah menuliskan nama folder pada perintah PowerShell. Setelah memeriksa kembali lokasi file, saya mengetahui bahwa folder yang benar adalah `scripts`, bukan `script`.

## Penggunaan AI

- **Alat yang dipakai:** ChatGPT.
- **Bagian yang dibantu AI:** Memahami instruksi tugas serta membantu membuat dan menjelaskan kode pada class `Aset.java`, terutama bagian atribut, konstruktor, getter, setter, dan validasi.
- **Prompt utama:**
  1. "Maksud perintah tersebut?"
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Saya menyesuaikan tipe data kondisi menjadi `Kondisi` karena nama tersebut yang digunakan dalam project. Saya juga tetap mempertahankan method untuk Minggu 3, 4, dan 5 karena belum termasuk bagian tugas Minggu 2.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya menjadi lebih memahami konsep *encapsulation* dalam Java, yaitu cara melindungi data menggunakan `private` serta mengatur akses dan perubahan data melalui getter dan setter yang dilengkapi validasi.

## Hasil Pengujian

Pengujian dilakukan menggunakan Maven untuk memastikan seluruh modul dapat dibangun dan pengujian berjalan dengan baik.

### 1. Hasil Build dan Compile

```text
[INFO] Scanning for projects...
[INFO] Loaded 24384 auto-discovered prefixes for remote repository central

[INFO] Reactor Build Order:
[INFO] Aset-Pinjam (OOP 202601) [pom]
[INFO] Aset-Pinjam Core (minggu 1-11) [jar]
[INFO] Aset-Pinjam API (minggu 12-15) [jar]

[INFO] Building Aset-Pinjam (OOP 202601) 0.1.0 [1/3]
[INFO] Building Aset-Pinjam Core (minggu 1-11) 0.1.0 [2/3]
[INFO] Building Aset-Pinjam API (minggu 12-15) 0.1.0 [3/3]

[INFO] Nothing to compile - all classes are up to date.
[INFO] Recompiling the module because of added or removed source files.
[INFO] Compiling 12 source files with javac [debug parameters release 21] to target\classes
[INFO] Compiling 2 source files with javac [debug parameters release 21] to target\test-classes
```

### 2. Hasil Unit Testing

Pengujian dilakukan pada class `Minggu01Test` dan `Minggu02AsetTest`.

```text
[INFO] Running id.ac.upb.asetpinjam.Minggu01Test
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

[INFO] Running id.ac.upb.asetpinjam.Minggu02AsetTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0

[INFO] Results:
[INFO] Tests run: 11, Failures: 0, Errors: 0, Skipped: 0
```

### 3. Hasil Build API

Pada modul API terdapat beberapa peringatan (`WARNING`) terkait dependency Springdoc OpenAPI. Namun, proses build tetap berhasil dilanjutkan.

```text
[WARNING] 1 problem was encountered while building the effective model for
'org.springdoc:springdoc-openapi-starter-webmvc-ui:jar:2.8.9'

[WARNING] 1 problem was encountered while building the effective model for
'org.springdoc:springdoc-openapi-starter-webmvc-api:jar:2.8.9'

[WARNING] 1 problem was encountered while building the effective model for
'org.springdoc:springdoc-openapi-starter-common:jar:2.8.9'
```

### 4. Reactor Summary

```text
[INFO] Reactor Summary for Aset-Pinjam (OOP 202601) 0.1.0:

[INFO] Aset-Pinjam (OOP 202601) ........ SUCCESS
[INFO] Aset-Pinjam Core (minggu 1-11) ... SUCCESS
[INFO] Aset-Pinjam API (minggu 12-15) ... SUCCESS

[INFO] BUILD SUCCESS

[INFO] Total time: 5.176 s
[INFO] Finished at: 2026-11-06T10:25:09+07:00
```

## Kesimpulan

Berdasarkan hasil pengujian, seluruh modul berhasil melalui proses build tanpa kegagalan. Pengujian pada modul Core juga menunjukkan bahwa 11 test berhasil dijalankan tanpa adanya failure maupun error.

Dengan demikian, pengerjaan Minggu 02 mengenai struktur OOP, class, object, dan encapsulation telah berhasil dilakukan sesuai dengan tujuan pembelajaran.