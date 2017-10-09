/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftp;

import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author JustSonny
 */
public class TryMove {
    
    public static void main(String[] args) throws Exception {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        
        LocalDateTime now = LocalDateTime.now();
        
        //PC rumah
        //Path FROM =  Paths.get("G:\\asal\\");
        //Laptop kantor
        Path FROM =  Paths.get("D:/asal/coba");
        
        //PC rumah
        //Path TO = Paths.get("G:\\tujuan");
        //Laptop kantor
        Path TO = Paths.get("D:/tujuan");
        
        Files.move(FROM, TO.resolve(FROM.getFileName()));
        
        JOptionPane.showMessageDialog(null,"Moving file at "+(dtf.format(now))+" run successfully");
        
        //nanti ditambahkan try catch error untuk file yang tidak ada didalam folder
    }
    
}
