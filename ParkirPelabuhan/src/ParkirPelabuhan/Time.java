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
import java.util.Scanner;  

public class Time {
    private int jam;
    private int menit;
    private int detik;

    public Time() {}

    public Time(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public int getJam() { return jam; }
    public void setJam(int jam) { this.jam = jam; }
    public int getMenit() { return menit; }
    public void setMenit(int menit) { this.menit = menit; }
    public int getDetik() { return detik; }
    public void setDetik(int detik) { this.detik = detik; }

    // Diperlukan oleh Kendaraan.lamaJam()
    public int toDetik() {
        return jam * 3600 + menit * 60 + detik;
    }

    // Diperlukan oleh InputForm dan KeluarForm
    public void setNow() {
        Calendar now = Calendar.getInstance();
        this.jam = now.get(Calendar.HOUR_OF_DAY);
        this.menit = now.get(Calendar.MINUTE);
        this.detik = now.get(Calendar.SECOND);
    }

    // Diperlukan oleh Kendaraan.inputKendaraan()
    public void inputTime(Scanner input) {
        System.out.print("Masukkan Jam (JJ): ");
        this.jam = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Menit (MM): ");
        this.menit = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Detik (DD): ");
        this.detik = Integer.parseInt(input.nextLine());
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", jam, menit, detik);
    }
}