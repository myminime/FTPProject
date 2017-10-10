/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryFtp;

/**
 *
 * @author JustSonny
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteBat {
    
    public static void main(String[] args) throws IOException {
        
        File newFile = new File("G:/SmartMove/move.bat");
        FileWriter wFile = new FileWriter(newFile);
        
        try (BufferedWriter bw = new BufferedWriter(wFile)) {
            bw.write("set source_drive");
            bw.write("=g:\\asal"+"\n");
            bw.write("move %source_drive%\\*.txt ");
            bw.write("g:\\tujuan");
        }
        System.out.println("file written");
        
        if (newFile.exists()) {
            newFile.createNewFile();
        }
        try {
            newFile.createNewFile();
            }
        catch (Exception e){
            e.printStackTrace();
            }
    }
    
}
