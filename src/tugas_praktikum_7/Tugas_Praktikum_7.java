/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_praktikum_7;
import java.util.Scanner;
/**
 *
 * @author dafae
 */
public class Tugas_Praktikum_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        //Input untuk memasukkan jumlah item
        System.out.print("Masukkan Item Barang : ");
        int jumBar = input.nextInt();
        
        Toserba ts = new Toserba(jumBar);
        ts.InputBarang();
        ts.OutputBarang();
                
    }
    
}
