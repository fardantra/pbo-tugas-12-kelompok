/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkirPelabuhan;

/**
 *
 * @author newte
 */
public class Truk extends Kendaraan {
    public Truk(){
        super();
    }

    public Truk(String noKendaraan){
        super(noKendaraan);
    }

    @Override
    public int hitungBiaya(){
        if (getStatus() == 1){
            return 40000 * (lamaHari() + 1);
        }
        else {
            Time t = lamaJam();
            double jam = t.getJam() + t.getMenit()/60.0;
            return (int)Math.ceil(jam) * 5000;
        }
    }
}
