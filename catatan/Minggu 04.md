# Catatan Minggu 04: Polimorfisme

## Yang saya kerjakan

Pada minggu keempat ini, saya mengerjakan konsep polymorphism pada project Aset-Pinjam. Saya menambahkan method `hitungDenda()` pada class `Ruang`, `Laptop`, dan `AlatLab` dengan pengali denda yang berbeda sesuai jenis aset. Selain itu, saya juga mengerjakan dua method `cari()` pada class `KatalogAset` untuk mencari aset berdasarkan nama dan jenisnya. Pencarian nama dibuat agar tidak membedakan huruf besar dan kecil.

## Keputusan desain

Saya menggunakan method `hitungDendaDenganPengali()` pada class `Aset` agar perhitungan denda tidak perlu ditulis berulang kali. Setiap subclass cukup memanggil method tersebut dengan pengali masing-masing, yaitu Ruang 1, Laptop 2, dan AlatLab 4. Untuk pencarian aset, saya menggunakan dua method `cari()` dengan parameter berbeda sebagai penerapan method overloading.

## Kendala

Kendala yang saya temui adalah memahami perbedaan penerapan overriding dan overloading. Saya juga perlu memperhatikan tipe data pada method `getJenis()` agar sesuai dengan tipe `JenisAset` yang digunakan pada class induk. Untuk pengujian, awalnya saya mengalami kendala karena PowerShell memblokir eksekusi file `.ps1`, kemudian saya mencoba menjalankannya menggunakan opsi `ExecutionPolicy Bypass`.

## Penggunaan AI

- **Alat yang dipakai:** ChatGPT.
- **Bagian yang dibantu AI:** Method `hitungDenda()` pada class `Aset`, `Ruang`, `Laptop`, dan `AlatLab`, serta dua method `cari()` pada class `KatalogAset`.
- **Prompt utama:**
  1. "Bantu saya memahami perintha dari ke 4 ini?"
 
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Saya menyesuaikan kode dengan struktur project dan tipe data yang sudah digunakan. Saya juga menambahkan penggunaan `Locale.ROOT` pada pencarian nama agar hasil pencarian lebih konsisten.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya lebih memahami bahwa overriding digunakan ketika subclass memiliki implementasi method sendiri dari class induk, sedangkan overloading menggunakan nama method yang sama tetapi dengan parameter yang berbeda.

## HASIL
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
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.015 s -- in id.ac.upb.asetpinjam.Minggu02AsetTest
[INFO] Running id.ac.upb.asetpinjam.Minggu03HierarkiTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.012 s -- in id.ac.upb.asetpinjam.Minggu03HierarkiTest
[INFO] Running id.ac.upb.asetpinjam.Minggu04PolimorfismeTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 s -- in id.ac.upb.asetpinjam.Minggu04PolimorfismeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 27, Failures: 0, Errors: 0, Skipped: 0
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
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ asetpinjam-api ---
[INFO] skip non existing resourceDirectory C:\oop-202601-250202975\api\src\test\resources
[INFO] 
[INFO] --- compiler:3.14.1:testCompile (default-testCompile) @ asetpinjam-api ---
[INFO] Nothing to compile - all classes are up to date.
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
[INFO] Aset-Pinjam (OOP 202601) ............................................................................. SUCCESS [  0.010 s]
[INFO] Aset-Pinjam Core (minggu 1-11) ....................................................................... SUCCESS [  1.785 s]
[INFO] Aset-Pinjam API (minggu 12-15) ....................................................................... SUCCESS [  0.572 s]
[INFO] --------------------------------------------------------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] --------------------------------------------------------------------------------------------------------------------------
[INFO] Total time:  2.832 s
[INFO] Finished at: 2026-11-06T12:51:14+07:00
[INFO] --------------------------------------------------------------------------------------------------------------------------