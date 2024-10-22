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
        String[] cols = {"Date", "AccountIn", "AccountOut", "Amount", "Type", "Category"};
        return cols;
    }

    //gets the names of the colums in the transaction table
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

            //get the transaction and add it to the table
        }

        fileSc = new Scanner(transactionsFile);
        String[][] data = new String[count][6];
        for (int row = 0; row < count; row++) {
            String transaction = fileSc.nextLine();
            Scanner transactionSc = new Scanner(transaction);
            String line = transactionSc.nextLine();
            Scanner lineSc = new Scanner(line);

            String dateNumber = lineSc.next();
            String accountIn = lineSc.next();
            String accountOut = lineSc.next();
            String amountNumber = lineSc.next();
            String type = lineSc.next();
            String category = lineSc.next();

            data[row][0] = dateNumber;
            data[row][1] = accountIn;
            data[row][2] = accountOut;
            data[row][3] = amountNumber;
            data[row][4] = type;
            data[row][5] = category;
        }
        return data;
// gets the order of each heading of the table,goes through the file to get each piece of data entered as they are separated by a space
    }

    public static void deleteTransaction(String transaction) throws FileNotFoundException, IOException {
        File transactionFile = new File(fileName);
        Scanner transactionSc = new Scanner(transactionFile);
        String output = "";

        while (transactionSc.hasNext()) {
            String currentTransaction = transactionSc.nextLine();
            if (!currentTransaction.equalsIgnoreCase(transaction)) {
                output = output + currentTransaction;

                //if there are more in the file and the current transaction is not equal to the transaction selected leave the current transaction as is
                if (transactionSc.hasNext()) {
                    output += "\n";
                }
            }
        }

        FileWriter transactionFileWriter = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(transactionFileWriter);
        pw.write(output);
        pw.close();
    }

    public static void addTransaction(String transaction) throws FileNotFoundException, IOException {
        File transactionFile = new File(fileName);
        FileWriter fw = new FileWriter(transactionFile, true);
        fw.write("\n" + transaction);
        fw.close();

        //add a line and then the transaction details entered to the file
    }

}

//add transaction
// delete transaction
