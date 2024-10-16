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
public class NotesManager {
    
     public static String fileName = "Data\\Notes.txt";

    public static String[] getNote() throws FileNotFoundException {

        File notesFile = new File(fileName);
        Scanner notesSc = new Scanner(notesFile);

        int count = 0;
        while (notesSc.hasNext()) {
            count++;
            notesSc.next();
            System.out.println("");

        }

        notesSc = new Scanner(notesFile);
        String[] notes = new String[count];
        for (int i = 0; i < count; i++) {
            notes[i] = notesSc.next();

        }
        return notes;
    }

    public static void deleteNote(String notes) throws FileNotFoundException, IOException {
        File notesFile = new File(fileName);
        Scanner notesSc = new Scanner(notesFile);

        String line = "";
        while (notesSc.hasNext()) {
            String currentNote = notesSc.next();
            if (!currentNote.equals(notes)) {
                line = line + currentNote + " ";

            }

            FileWriter notesFileWriter = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(notesFileWriter);
            pw.write(line);
            pw.close();

        }

    }

    public static void addNote(String notes) throws FileNotFoundException, IOException {
        File notesFile = new File(fileName);
        Scanner notesSc = new Scanner(notesFile);
        String line = notesSc.nextLine() + " " + notes;

        FileWriter notesFileWriter = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(notesFileWriter);
        pw.write(line);
        pw.close();
    }
    
    

    
}
