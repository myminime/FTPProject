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
        
        Path FROM =  Paths.get("G:\\asal\\");
        
        Path TO = Paths.get("G:\\tujuan");
        
        Files.move(FROM, TO.resolve(FROM.getFileName()));
        
        JOptionPane.showMessageDialog(null,"Movung file at "+(dtf.format(now))+" run successfully");       
    }
    
}
