# TUGASOOP_PRATIKUM
## latihan1
link = "https://github.com/BAGAZDWI33/latihan1.git"

menjelaskan tentang class dari anton dan riko dengan atribut Nama,jenis kelamin dan umur

gambar tertera di screenshot1

dengan code

class Mahasiswa{
    String Nama;
    String JenisKelamin;
    int umur;

    public static void main(String[] args) {
        // Membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();

        /* memanggil atribut dan memberi nilai */
        mahasiswa1.Nama = "Anton";
        mahasiswa1.JenisKelamin = "Laki-Laki";
        mahasiswa1.umur = 23;

        System.out.println("nama: " + mahasiswa1.Nama);
        System.out.println("Jenis Kelamin: " + mahasiswa1.JenisKelamin);
        System.out.println("Umur: " + mahasiswa1.umur + "\n");

        mahasiswa2.Nama = "Riko";
        mahasiswa2.JenisKelamin = "Laki-Laki";
        mahasiswa2.umur = 24;

        System.out.println("nama: " + mahasiswa2.Nama);
        System.out.println("Jenis Kelamin: " + mahasiswa2.JenisKelamin);
        System.out.println("Umur: " + mahasiswa2.umur);

    }
}

lebih jelasnya bisa run di src = Mahasiswa.java

## latihan2

link = "https://github.com/BAGAZDWI33/latihan2.git"

menjelaskan tentang Mendeklarasikan class AkunBank dengan instance method 
simpanUang, ambilUang dan cekSaldo dengan syarat ditetapkan nilai saldo awal Rp. 100000

gambar tertera di screenshot2

menthod yang saya gunakan

    public void nabung(int sal){
        saldo = saldo +sal;
    }
    public void ambilUang(int jumlahTarikan){
        saldo = saldo - jumlahTarikan;
    }
    public int ambilSaldo(){
        return saldo;
    }
    public void serSaldo(int sal){
        saldo = sal;
    }

dengan pembacaan hasil 

Selamat Datang di Bank ABC

Saldo Saat Ini  : Rp.100000

Simpan Uang     : Rp.500000

Saldo Saat Ini  : Rp.600000

Ambil Uang      : Rp.150000

Saldo Saat Ini  : Rp.450000

lebih jelasnya bisa run link yang tertera di atas dengan src = tabungan.java

by.bagas dwi prasetyo(312110053)