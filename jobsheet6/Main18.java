package jobsheet6;
import java.util.Scanner;
public class Main18 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi18 list = new DaftarMahasiswaBerprestasi18();
        Mahasiswa18 m1 = new Mahasiswa18("Nusa", 2017, 25, 3);
        Mahasiswa18 m2 = new Mahasiswa18("Rara", 2012, 19, 4);
        Mahasiswa18 m3 = new Mahasiswa18("Dompu", 2018,19, 3.5);
        Mahasiswa18 m4 = new Mahasiswa18("Abdul", 2017, 23, 2);
        Mahasiswa18 m5 = new Mahasiswa18("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubblesort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("data mahasiswa setelah sorting asc berdasarkan IPK");
        list.insertionSort();
        list.tampil();
    }
}
