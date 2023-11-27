/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum_7;
import java.util.Scanner;
/**
 *
 * @author dafae
 */
public class Toserba {
    private int jumBar;
    private String kodeInput;
    private int totalHarga = 0;
    int[] jumBel = new int[20];
    String[] kode = {"a001","a002","a003"};
    int[] harga = {3000,4000,5000};
    String[] barang = {"Buku","Pensil","Pulpen"};
    Scanner input = new Scanner(System.in);
    
    //Constructor untuk mengambil value jumlah barang
    public Toserba(int jumBar){
        this.jumBar = jumBar;
    }
    
    //Method untuk meng-input
    public void InputBarang(){
        
        
        //Perulangan untuk meng-input kode, dan jumlah pembelian
        for(int i=0; i < this.jumBar;i++ ){
            System.out.println("Data Ke "+ (i+1));
            System.out.print("Masukkan Kode : ");
            this.kodeInput = input.next();
             System.out.print("Masukkan Jumlah Beli : ");
            jumBel[i] = input.nextInt();
        }   
    }
    
    //Method untuk meng-output
    public void OutputBarang(){
        System.out.println("");
        System.out.println("");
        System.out.println("TOKO SERBA ADA");
        System.out.println("************************************");
        System.out.println("No\t      Kode Barang\t     Nama Barang\t     Harga\t       Jumlah Beli\t     Jumlah Bayar");
        System.out.println("===========================================================================================");
        
        
        //Perulangan untuk meng-output value yang sudah dimasukkan sebelumnya dan menghitung total harga
        for (int i = 0; i < kode.length; i++){
            int total = harga[i] * jumBel[i];
            System.out.println((i+1) + "\t        " + kode[i] + "\t\t        " + barang[i] + "\t\t        " + harga[i] + "\t\t        " + jumBel[i] + "\t\t       " + total);
            this.totalHarga += total;
        }
         
        System.out.println("===========================================================================================");
        System.out.println("Total Bayar:                                                " + this.totalHarga);
        System.out.println("===========================================================================================");
    }    
}
