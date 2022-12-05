/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS;

/**
 *
 * @author Tantowi
 */
public class Pop {
    
    String singer = "Raisa";
    String song = "Kali Kedua";
    
        Pop(String singer, String song){
        this.singer = singer;
        this.song = song;
        System.out.println(this.singer + "<=>" + this.song);
        }
        
        public void singer (String singer){
            this.singer = singer;
        }
        
        protected void song (String song){
            this.song = song;
        }
        
        void cetakLabel(){
            System.out.println(this.singer + "<=>" + this.song);
    }
}
