/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkirPelabuhan;

/**
 *
 * @author newte
 */
import java.util.Scanner;

public class Person {
    private String nama;
    private String alamat;

    public Person(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public Person() {
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void inputPerson(){
        Scanner input = new Scanner (System.in);
        System.out.println("=== Data Pemilik ===");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        setNama(nama);
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        setAlamat(alamat);
    }
}