/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkirPelabuhan;

/**
 *
 * @author newte
 */
import java.util.Calendar;   
import java.util.GregorianCalendar; 
import java.util.Scanner;   

public class Date {
    private int tanggal;
    private int bulan;
    private int tahun;

    public Date() {}

    public Date(int tanggal, int bulan, int tahun) {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public int getTanggal() { return tanggal; }
    public void setTanggal(int tanggal) { this.tanggal = tanggal; }
    public int getBulan() { return bulan; }
    public void setBulan(int bulan) { this.bulan = bulan; }
    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }

    // Diperlukan oleh Kendaraan.lamaHari()
    public int toHari() {
        Calendar cal = new GregorianCalendar(tahun, bulan - 1, tanggal);
        return (int)(cal.getTimeInMillis() / (24 * 60 * 60 * 1000));
    }

    // Diperlukan oleh InputForm dan KeluarForm
    public void setNow() {
        Calendar now = Calendar.getInstance();
        this.tanggal = now.get(Calendar.DAY_OF_MONTH);
        this.bulan = now.get(Calendar.MONTH) + 1; // Calendar.MONTH dimulai dari 0
        this.tahun = now.get(Calendar.YEAR);
    }

    // Diperlukan oleh Kendaraan.inputKendaraan()
    public void inputDate(Scanner input) {
        System.out.print("Masukkan Tanggal (TT): ");
        this.tanggal = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Bulan (BB): ");
        this.bulan = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Tahun (TTTT): ");
        this.tahun = Integer.parseInt(input.nextLine());
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", tanggal, bulan, tahun);
    }
}