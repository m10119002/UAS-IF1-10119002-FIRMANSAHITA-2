/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.uas;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : UAS - No 2
 */
public class Program {
    
    public static void main(String[] args) {
        int saldo_awal = 100000;
        int saldo = saldo_awal;
        int bunga = 500;
        int bulan = 5;
        for (int i=1; i<=bulan; i++) {
            saldo = bunga + saldo;
            System.out.println("Saldo di bulan awal ke-".concat(
                    Integer.toString(i)).concat(" ").
                    concat(Integer.toString(saldo)));
        }
    }
    
}
