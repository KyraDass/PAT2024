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
    //sets the notes text as the file name for easy access

    public static String[] getNote() throws FileNotFoundException {

        File notesFile = new File(fileName);
        Scanner notesSc = new Scanner(notesFile);
        // Scanner object is created to read the contents of the file.

        int count = 0;
        while (notesSc.hasNext()) {
            count++;
            notesSc.next();
            System.out.println("");

            //reads each note and adds 1 to count for each note and prints a new line
        }

        notesSc = new Scanner(notesFile);
        String[] notes = new String[count];
        for (int i = 0; i < count; i++) {
            notes[i] = notesSc.next();
            //

        }
        return notes;
    }
    // the code above checks if there are anymore notes using a scanner

    public static void deleteNote(String notes) throws FileNotFoundException, IOException {
        File notesFile = new File(fileName);
        Scanner notesSc = new Scanner(notesFile);
        //A Scanner object (notesSc) is created to read the contents of the file.
        String line = "";
        while (notesSc.hasNext()) {
            String currentNote = notesSc.next();
            if (!currentNote.equals(notes)) {
                line = line + currentNote + " ";

            }
            // if the selected note is not the current note then go to next line

            FileWriter notesFileWriter = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(notesFileWriter);
            pw.write(line);
            pw.close();

            //use a print writer to a write the updated list of notes back to the file.
        }

    }

    public static void addNote(String notes) throws FileNotFoundException, IOException {
        File notesFile = new File(fileName);
        Scanner notesSc = new Scanner(notesFile);
        // The Scanner object (notesSc) is created to read the contents of the file.
        String line = notesSc.nextLine() + " " + notes;
        //scans through the file and adds a line for a new note

        FileWriter notesFileWriter = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(notesFileWriter);
        pw.write(line);
        pw.close();
        //This writes the updated list of notes back to the file.
    }

}
