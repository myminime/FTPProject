/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartFtp;

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
        
        /*File newFile = new File("D:/Proyekan/omahanyar/sumber/exec.bat");
        //File newFile = new File("C:/SmartMove/move.bat");
        FileWriter wFile = new FileWriter(newFile);
        Runtime runtime = Runtime.getRuntime();
        
        try (BufferedWriter bw = new BufferedWriter(wFile)) {
            bw.write("set source_drive=");
            bw.write("D:\\Proyekan\\omahanyar\\sumber"); //source path parameter diganti input text field
            bw.write("\n");
            bw.write("move %source_drive%\\*.txt ");
            bw.write("D:\\Proyekan\\omahanyar\\tujuan"); //destination path parameter diganti input text field
        }
        System.out.println("file added");
        
        if (newFile.exists()) {
            newFile.createNewFile();    
        }
        try {
            newFile.createNewFile();
            }
        catch (IOException e){
            }
        try {
            runtime.exec("cmd /c start D:\\Proyekan\\omahanyar\\sumber\\exec.bat");
            //runtime.exec("timeout /t %3");
            runtime.exec("taskkill /im cmd.exe /f");
        }
        catch (IOException e) {}*/
        
        ftpUI ui = new ftpUI();
        ui.setVisible(true);
        
    }
}
