/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author kyrad
 */
public class AccountsManager {

    public static String fileName = "Data\\AccountList.txt";

    public static String[] getAccountNames() throws FileNotFoundException {

        File accountsFile = new File(fileName);
        Scanner accountSc = new Scanner(accountsFile);

        //scans the accounts list
        int count = 0;
        while (accountSc.hasNext()) {
            count++;
            accountSc.next();
            System.out.println("");

        }

        accountSc = new Scanner(accountsFile);
        String[] account = new String[count];
        for (int i = 0; i < count; i++) {
            account[i] = accountSc.next();

        }
        return account;

        //this method retuns the account names
    }

    public static void deleteAccount(String account) throws FileNotFoundException, IOException {
        File accountsFile = new File(fileName);
        Scanner accountSc = new Scanner(accountsFile);

        String line = "";
        while (accountSc.hasNext()) {
            String currentAccount = accountSc.next();
            if (!currentAccount.equals(account)) {
                line = line + currentAccount + " ";

            }

            //gets the current acount and if not the same as the selected account then just leave it
            FileWriter accountFileWriter = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(accountFileWriter);
            pw.write(line);
            pw.close();

        }

    }
// this method scans to see if any of the accounts match the selected account to delete it from the list and to update the file

    public static void addAccount(String account) throws FileNotFoundException, IOException {
        File accountsFile = new File(fileName);
        Scanner accountSc = new Scanner(accountsFile);
        String line = accountSc.nextLine() + " " + account;

        FileWriter accountFileWriter = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(accountFileWriter);
        pw.write(line);
        pw.close();
    }

    //adds an account when text is added into a text field,goes to next line and then adds account name
}
