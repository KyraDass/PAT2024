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
//scans the login file
        while (fileSc.hasNext()) {
            String line = fileSc.nextLine();
//if there is more,get the next line
            Scanner userSc = new Scanner(line);
            String name = userSc.next();
            String password = userSc.next();
            //gotten as they are stored next to each other in the text file

            if (name.equals(inUsername) && password.equals(inPassword)) {

                return true;
            } else {

            }

        }

        return false;
    }

    public static boolean addUser(String inUsername, String inPassword) throws FileNotFoundException, IOException {
        File userFile = new File(fileName);
        Scanner fileSc = new Scanner(userFile);

        //scans the login file
        String output = "";

        while (fileSc.hasNext()) {
            String line = fileSc.nextLine();

            Scanner lineSc = new Scanner(line);
            String name = lineSc.next();
            String password = lineSc.next();
            //get the name and password

            if (name.equals(inUsername)) {
                //if the name is equal to an already existing name from the text file,then tell them to get new username
                return false;
            }
            
            output += line + "\n";
        }

        output += inUsername + " " + inPassword;
        // else if okay then add it to the next line with a space
        FileWriter userFileWriter = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(userFileWriter);
        pw.write(output);
        pw.close();
        //print the input to the file

        return true;
    }
}
