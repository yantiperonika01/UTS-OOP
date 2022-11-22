/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indomaret;

/**
 *
 * @author ITB INDONESIA
 */
public class Indomaret {
String makanan;
String minuman;
String Snack;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Indomaret indomaretku= new Indomaret();
       indomaretku.makanan = "  : Maitos,Kfc";
       indomaretku.minuman = "  : Cimory,Pulpy";
       indomaretku.Snack =   "    :Tictac,kacang atom";
       
       System.out.println("makanan"+indomaretku.makanan);
       System.out.println("minuman"+indomaretku.minuman);
       System.out.println("snack"  +indomaretku.Snack);
    }
       
    }
    
}
