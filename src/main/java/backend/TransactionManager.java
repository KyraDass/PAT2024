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

/**
 *
 * @author kyrad
 */
public class TransactionManager {

    private static String fileName = "Data\\Transactions.txt";

    public static String[] getColumnNames() {
        String[] cols = {"Date", "Account", "Amount", "Type", "Category"};
        return cols;
    }

    public static String[][] getTranscationTableData() throws FileNotFoundException {
        File transactionsFile = new File(fileName);
        Scanner fileSc = new Scanner(transactionsFile);

        int count = 0;
        while (fileSc.hasNextLine()) {
            count++;
            fileSc.nextLine();
        }

        fileSc = new Scanner(transactionsFile);
        String[] transactions = new String[count];
        for (int i = 0; i < count; i++) {
            transactions[i] = fileSc.next();

        }

        fileSc = new Scanner(transactionsFile);
        String[][] data = new String[count][5];
        for (int row = 0; row < count; row++) {
            String transaction = fileSc.nextLine();
            Scanner transactionSc = new Scanner(transaction);

            String dateNumber = transactionSc.next();
            String account = transactionSc.next();
            String amountNumber = transactionSc.next();
            String type = transactionSc.next();
            String category = transactionSc.next();

            data[row][0] = dateNumber;
            data[row][1] = account;
            data[row][2] = amountNumber;
            data[row][3] = type;
            data[row][4] = category;
        }
        return data;

    }

    public static void deleteTransaction(String transaction) throws FileNotFoundException, IOException {
        File transactionFile = new File(fileName);
        Scanner transactionSc = new Scanner(transactionFile);
        String output = "";
        while (transactionSc.hasNext()) {
            String currentTransaction = transactionSc.nextLine();
            if (!currentTransaction.equals(transaction)) {
                output = output + currentTransaction + "\n";

            }

        }

        FileWriter transactionFileWriter = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(transactionFileWriter);
        pw.write(output);
        pw.close();
    }
    
    public static void addTransaction(String transaction) throws FileNotFoundException, IOException {
        File transactionFile = new File(fileName);
        Scanner transactionSc = new Scanner(transactionFile);
        String line = transactionSc.nextLine() + " " + transaction;
        
        

        FileWriter accountFileWriter = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(accountFileWriter);
        pw.write(line);
        pw.close();
    }
    

}

//add transaction
// delete transaction
