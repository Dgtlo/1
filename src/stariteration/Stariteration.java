/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stariteration;

/**
 *
 * @author Lenovo
 */
public class Stariteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variabel m dan n
        for(int m = 1; m <= 3; m++){
         for(int n = 1; n <= 3; n++){
             
             //posisi bintang
             if (m != 3) {
             if (n==1||n==3){
                 //mencetak bintang
                 System.out.print(" ");}
             else{
                 System.out.print("*");}}
             else{
                 System.out.print("*");}
             }
         System.out.println();
        }
    }
         }