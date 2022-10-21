
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
