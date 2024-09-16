/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainmenu;

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

    public static void deleteGoal(String goals) throws FileNotFoundException, IOException {
        File goalsFile  = new File(GoalsManager.goalsData);
        Scanner goalsSc = new Scanner(goalsFile);

        String line = "";
        while (goalsSc.hasNext()) {
            String currentGoal = goalsSc.next();
            if (!currentGoal.equals(goals)) {
                line = line + currentGoal + " ";

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
        if(goalsSc.hasNext()){
            line = goalsSc.nextLine() +" " ;
        }
        line = line + goals;

        FileWriter goalsFileWriter = new FileWriter(goalsData);
        PrintWriter pw = new PrintWriter(goalsFileWriter);
        pw.write(line);
        pw.close();
    }

    
     public static String completedGoalsData = "Data\\completedGoals.txt";
    
    public static void completeGoal(String goal) throws FileNotFoundException, IOException {
        deleteGoal(goal);
       
        File completeGoalsFile = new File(completedGoalsData);
        Scanner completedGoalsSc = new Scanner(completeGoalsFile);
        String line = "";
        if(completedGoalsSc.hasNext()){
            line =completedGoalsSc.nextLine() +" ";
        }
        line = line + goal;

        FileWriter completedGoalsFileWriter = new FileWriter(completedGoalsData);
        PrintWriter pw = new PrintWriter(completedGoalsFileWriter);
        pw.write(line);
        pw.close();
        
       
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
       
    }
    
}
