/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS;

/**
 *
 * @author Tantowi
 */
public class Dangdut {
        
        String penyanyi = "Ayu Ting Ting";
        String lagu = "Alamat Palsu";
        
        Dangdut(String penyanyi, String lagu){
            this.penyanyi = penyanyi;
            this.lagu = lagu;
        }
        
        void singer (String penyanyi){
            this.penyanyi = penyanyi;
        }
        
        public void song (String lagu){
            this.lagu = lagu;
        }
        
        void cetakLabel(){
            System.out.println(this.penyanyi + "<=>" + this.lagu);
        }
    
}
