/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author ACER
 */
public class soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date waktu = new Date();
        SimpleDateFormat jam12 = new SimpleDateFormat ("hh:mm:ss a");
        SimpleDateFormat jam24 = new SimpleDateFormat ("HH:mm:ss");   
        
        System.out.println("jam : " +jam12.format(waktu)+ " menjadi " +"jam : " + jam24.format(waktu));
    }
    
}
