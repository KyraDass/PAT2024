/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import static backend.AccountsManager.fileName;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author kyrad
 */
public class UserManager {

    public static String fileName = "Data\\Login.txt";

    public static boolean isValid(String inUsername, String inPassword) throws FileNotFoundException {

        File usernameFile = new File(fileName);
        Scanner fileSc = new Scanner(usernameFile);

        while (fileSc.hasNext()) {
            String line = fileSc.nextLine();

            Scanner userSc = new Scanner(line);
            String name = userSc.next();
            String password = userSc.next();

            if (name.equals(inUsername) && password.equals(inPassword)) {
                JOptionPane.showMessageDialog(null, "succesfully loged in");
                return true;
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Username or password is invalid");
               
            }
            
        }

        return false;
    }

    
    public static boolean addUser(String inUsername, String inPassword) throws FileNotFoundException, IOException {
        File userFile = new File(fileName);
        Scanner fileSc = new Scanner(userFile);

        String output = "";
        
       
        while(fileSc.hasNext()){
            String line = fileSc.nextLine();
            
            Scanner lineSc = new Scanner(line);
            String name = lineSc.next();
            String password = lineSc.next();
            
            if (name.equals(inUsername)) {
                return false;
            }
            
            output += line + "\n";
        }
        
        output += inUsername + " " + inPassword;
       
        FileWriter userFileWriter = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(userFileWriter);
        pw.write(output);
        pw.close();
        
        return true;
    }
}
