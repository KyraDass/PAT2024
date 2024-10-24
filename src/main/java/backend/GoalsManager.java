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
public class GoalsManager {

    public static String goalsData = "Data\\Goals.txt";

    public static String[] getGoals() throws FileNotFoundException {

        File goalsFile = new File(GoalsManager.goalsData);
        Scanner goalsSc = new Scanner(goalsFile);

        int count = 0;
        while (goalsSc.hasNext()) {
            count++;
            goalsSc.next();
            System.out.println("");

        }

        goalsSc = new Scanner(goalsFile);
        String[] goals = new String[count];
        for (int i = 0; i < count; i++) {
            goals[i] = goalsSc.next();

        }
        return goals;
    }
// reads all the goals in the file and returns them to the list

    public static void deleteGoal(String goals) throws FileNotFoundException, IOException {
        File goalsFile = new File(GoalsManager.goalsData);
        Scanner goalsSc = new Scanner(goalsFile);

        String line = "";
        while (goalsSc.hasNext()) {
            String currentGoal = goalsSc.next();
            if (!currentGoal.equals(goals)) {
                line = line + currentGoal + " ";
                //gets the current goal and if not the same as the selected account then just leave it

            }

            FileWriter goalsFileWriter = new FileWriter(GoalsManager.goalsData);
            PrintWriter pw = new PrintWriter(goalsFileWriter);
            pw.write(line);
            pw.close();

        }

    }

    public static void addGoal(String goals) throws FileNotFoundException, IOException {
        File goalsFile = new File(goalsData);
        Scanner goalsSc = new Scanner(goalsFile);

        String line = "";
        if (goalsSc.hasNext()) {
            line = goalsSc.nextLine() + " ";
            //keep going until end of line to go to next empty line
        }
        line = line + goals;

        FileWriter goalsFileWriter = new FileWriter(goalsData);
        PrintWriter pw = new PrintWriter(goalsFileWriter);
        pw.write(line);
        pw.close();
        //when a goal is added,add it to a new line when it is written back to the file
    }

    public static String completedGoalsData = "Data\\completedGoals.txt";

    public static void completeGoal(String goal) throws FileNotFoundException, IOException {
        deleteGoal(goal);

        File completeGoalsFile = new File(completedGoalsData);
        Scanner completedGoalsSc = new Scanner(completeGoalsFile);
        String line = "";
        if (completedGoalsSc.hasNext()) {
            line = completedGoalsSc.nextLine() + " ";
        }
        line = line + goal;
        //go to next line and then add completed goal

        FileWriter completedGoalsFileWriter = new FileWriter(completedGoalsData);
        PrintWriter pw = new PrintWriter(completedGoalsFileWriter);
        pw.write(line);
        pw.close();

        // if text file has more input continue until last one and then go to next line and space.
    }

    public static String[] getCompletedGoals() throws FileNotFoundException, IOException {

        File goalsFile = new File(completedGoalsData);
        Scanner goalsSc = new Scanner(goalsFile);

        int count = 0;
        while (goalsSc.hasNext()) {
            count++;
            goalsSc.next();
            System.out.println("");

        }

        goalsSc = new Scanner(goalsFile);
        String[] goals = new String[count];
        for (int i = 0; i < count; i++) {
            goals[i] = goalsSc.next();

        }
        return goals;

        //if the goal is selected add it to the completed goals list
    }

    public static void deleteCompletedGoal(String goals) throws FileNotFoundException, IOException {

        File goalsFile = new File(GoalsManager.completedGoalsData);
        Scanner goalsSc = new Scanner(goalsFile);

        String line = "";
        while (goalsSc.hasNext()) {
            String currentGoal = goalsSc.next();
            if (!currentGoal.equals(goals)) {
                line = line + currentGoal + " ";
                //gets the current goal and if not the same as the selected account then just leave it

            }

        }

        FileWriter goalsFileWriter = new FileWriter(GoalsManager.completedGoalsData);
        PrintWriter pw = new PrintWriter(goalsFileWriter);
        pw.write(line);
        pw.close();

    }

}
