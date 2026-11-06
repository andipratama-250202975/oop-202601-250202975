# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: (isi)
- Alasan: (isi)
- Dampak ke kode: (isi)
- Tes yang membuktikan: (isi)

## Asumsi lain

## A-08: Rumus denda progresif

- Pertanyaan: Bagaimana cara menghitung denda progresif?
- Keputusan: Menggunakan rumus Denda Flat × (1 + 0,05 × jumlah hari keterlambatan).
- Alasan: Agar denda semakin besar ketika jumlah hari keterlambatan bertambah.
- Dampak ke kode: Kelas DendaProgresif, method hitung().
- Tes yang membuktikan: Minggu05AbstraksiTest.dendaProgresifMemenuhiSyaratMinimal().


