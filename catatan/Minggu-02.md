# Catatan Minggu 02: Struktur OOP – Class, Object, Encapsulation

## Yang saya kerjakan

Pada minggu kedua ini, saya mengerjakan class Aset.java dengan menerapkan konsep dasar OOP, yaitu encapsulation. Saya membuat beberapa atribut menggunakan akses private, kemudian melengkapi konstruktor, getter, dan setter. Saya juga menambahkan validasi agar kode dan nama aset tidak boleh kosong atau bernilai null. Selain itu, saya mengatur status awal aset menjadi TERSEDIA dan kondisi awal menjadi BAIK.

## Keputusan desain

Saya memilih menggunakan private pada semua atribut agar data di dalam class tidak bisa diakses atau diubah secara langsung dari luar class. Saya juga tidak membuat setter untuk kode karena kode aset harus tetap dan tidak boleh diubah setelah objek dibuat. Untuk kode dan nama, saya menggunakan trim() agar spasi yang tidak diperlukan di bagian awal dan akhir bisa dihilangkan. Sementara itu, status dan kondisi saya beri validasi agar tidak menerima nilai null.

## Kendala

Selama mengerjakan tugas ini, saya sempat mengalami kesulitan dalam memahami beberapa bagian kode dan menyesuaikannya dengan struktur project yang sudah tersedia. Saya sempat mengalami masalah saat menjalankan pengujian karena salah menuliskan nama folder pada perintah PowerShell. Setelah memeriksa kembali lokasi file, saya mengetahui bahwa folder yang benar adalah scripts, bukan script.

## Penggunaan AI

- **Alat yang dipakai:** ChatGPT.
- **Bagian yang dibantu AI:** Memahami instruksi tugas serta membantu membuat dan menjelaskan kode pada class Aset.java, terutama bagian atribut, konstruktor, getter, setter, dan validasi.
- **Prompt utama:**
  1. "maksud perintah tersebut"
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Saya menyesuaikan tipe data kondisi menjadi Kondisi karena nama tersebut yang digunakan dalam project. Saya juga tetap mempertahankan method untuk Minggu 3, 4, dan 5 karena belum termasuk bagian tugas Minggu 2.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya menjadi lebih memahami konsep encapsulation dalam Java, yaitu cara melindungi data menggunakan private serta mengatur akses dan perubahan data melalui getter dan setter yang dilengkapi validasi.

## hasil

[INFO] Scanning for projects...
[INFO] Loaded 24384 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] --------------------------------------------------------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Aset-Pinjam (OOP 202601)                                                                                             [pom]
[INFO] Aset-Pinjam Core (minggu 1-11)                                                                                       [jar]
[INFO] Aset-Pinjam API (minggu 12-15)                                                                                       [jar]
[INFO] 
[INFO] ---------------------------------------------< id.ac.upb:asetpinjam-parent >----------------------------------------------
[INFO] Building Aset-Pinjam (OOP 202601) 0.1.0                                                                              [1/3]
[INFO]   from pom.xml
[INFO] ---------------------------------------------------------[ pom ]----------------------------------------------------------
[INFO] 
[INFO] ----------------------------------------------< id.ac.upb:asetpinjam-core >-----------------------------------------------
[INFO] Building Aset-Pinjam Core (minggu 1-11) 0.1.0                                                                        [2/3]
[INFO]   from core\pom.xml
[INFO] ---------------------------------------------------------[ jar ]----------------------------------------------------------
[INFO] Loaded 64 auto-discovered prefixes for remote repository apache.snapshots (prefixes-apache.snapshots.txt)
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ asetpinjam-core ---
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.14.1:compile (default-compile) @ asetpinjam-core ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ asetpinjam-core ---
[INFO] skip non existing resourceDirectory C:\oop-202601-250202975\core\src\test\resources
[INFO] 
[INFO] --- compiler:3.14.1:testCompile (default-testCompile) @ asetpinjam-core ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.5.6:test (default-test) @ asetpinjam-core ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running id.ac.upb.asetpinjam.Minggu01Test
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.051 s -- in id.ac.upb.asetpinjam.Minggu01Test
[INFO] Running id.ac.upb.asetpinjam.Minggu02AsetTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.016 s -- in id.ac.upb.asetpinjam.Minggu02AsetTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 11, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] -----------------------------------------------< id.ac.upb:asetpinjam-api >-----------------------------------------------
[INFO] Building Aset-Pinjam API (minggu 12-15) 0.1.0                                                                        [3/3]
[INFO]   from api\pom.xml
[INFO] ---------------------------------------------------------[ jar ]----------------------------------------------------------
[WARNING] 1 problem was encountered while building the effective model for 'org.springdoc:springdoc-openapi-starter-webmvc-ui:jar:2.8.9' during dependency collection step for project (use -X to see details)
[WARNING] 1 problem was encountered while building the effective model for 'org.springdoc:springdoc-openapi-starter-webmvc-api:jar:2.8.9' during dependency collection step for project (use -X to see details)
[WARNING] 1 problem was encountered while building the effective model for 'org.springdoc:springdoc-openapi-starter-common:jar:2.8.9' during dependency collection step for project (use -X to see details)
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ asetpinjam-api ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.14.1:compile (default-compile) @ asetpinjam-api ---
[INFO] Recompiling the module because of added or removed source files.
[INFO] Compiling 12 source files with javac [debug parameters release 21] to target\classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ asetpinjam-api ---
[INFO] skip non existing resourceDirectory C:\oop-202601-250202975\api\src\test\resources
[INFO] 
[INFO] --- compiler:3.14.1:testCompile (default-testCompile) @ asetpinjam-api ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 2 source files with javac [debug parameters release 21] to target\test-classes
[INFO] 
[INFO] --- surefire:3.5.6:test (default-test) @ asetpinjam-api ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] --------------------------------------------------------------------------------------------------------------------------
[INFO] Reactor Summary for Aset-Pinjam (OOP 202601) 0.1.0:
[INFO] 
[INFO] Aset-Pinjam (OOP 202601) ............................................................................. SUCCESS [  0.009 s]
[INFO] Aset-Pinjam Core (minggu 1-11) ....................................................................... SUCCESS [  1.698 s]
[INFO] Aset-Pinjam API (minggu 12-15) ....................................................................... SUCCESS [  3.011 s]
[INFO] --------------------------------------------------------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] --------------------------------------------------------------------------------------------------------------------------
[INFO] Total time:  5.176 s
[INFO] Finished at: 2026-11-06T10:25:09+07:00
[INFO] --------------------------------------------------------------------------------------------------------------------------