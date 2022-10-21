
/*
 * Nama Program : latihan2
 * Keterangan   : Implementasi Class Diagram
 * Programmer   : Bagas Dwi Prasetyo
 * NIM          : 312110053
 */

/**
 *
 * @author Nda Edogawa
 */

public class tabungan{
    private static String nama;
    private static int jumlah;
    private int saldo;

    public tabungan(String namaNasabah, int jumlah) {
        nama = namaNasabah;
        nama = "ABC";
        saldo = 100000;
    }


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
    public static void main(String[] args) {
        int jumlahSimpanan = 500000;
        int jumlahTarikan = 150000;

        tabungan bls = new tabungan("ABC",1234);
        System.out.println("Selamat Datang di Bank " + nama);
        System.out.println("Saldo Saat Ini  : " +"Rp."+ bls.ambilSaldo() +"\n");
        System.out.println("Simpan Uang     : " +"Rp." + jumlahSimpanan);
        bls.nabung(jumlahSimpanan);
        System.out.println("Saldo Saat Ini  : " +"Rp."+ bls.ambilSaldo() + "\n");
        System.out.println("Ambil Uang      : " +"Rp." + jumlahTarikan);
        bls.ambilUang(jumlahTarikan);
        System.out.println("Saldo Saat Ini  : " +"Rp." + bls.ambilSaldo());
    }
}