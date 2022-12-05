/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS;

/**
 *
 * @author Tantowi
 */
public class Penyanyi extends Pop {
    
    
    public static void main(String[] args) {
        
        Pop pop = new Pop("Black Pink", "How You Like That");
        pop.singer ("Eclat Story");
        pop.song ("Bentuk Cinta");
        pop.cetakLabel();
        
        Dangdut dangdut = new Dangdut("Via Valen","Kopi Dangdut");
        dangdut.cetakLabel();   
        
//        String penyanyi = "Joko chandra";
//        penyanyi = dangdut.penyanyi;
//        dangdut.song ("Via Valen","Kopi Dangdut");
        
    }
}
