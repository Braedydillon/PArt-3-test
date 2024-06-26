/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import javax.swing.JOptionPane;

/**
 *
 * @author braed
 */
public class Task {
         //declartions
    String taskSize;
    String SD;
    String DE;
    String deleteChoice ;
    String taskName;
    String developer;
    String name;
    String surname;
    int taskDuration;
    String taskStatus;
    String taskID;
    public String taskNumber1;
    public String input;
 private static final int MAX_REPORTS = 100;
    static String[] Developer = new String[MAX_REPORTS];
    public static String[] TaskName = new String[MAX_REPORTS];
    public static String[] TaskID = new String[MAX_REPORTS];
    public static int[] TaskDuration = new int[MAX_REPORTS];
    public static String[] TaskStatus = new String[MAX_REPORTS];
    public static String[] TASKDes = new String[MAX_REPORTS];
    public static int Reports = 0;
    
public void loopSize(){
input = JOptionPane.showInputDialog(null,"Please enter amount of tasks you are entering information between 1 and 10");
}
//to ensure task description dosent go over 50
public boolean checkTaskDescription(String taskSize){
  return taskSize.length() <= 50;
}

public void methodsOfInformation(){
    //user input task info
    taskName = JOptionPane.showInputDialog(null, "Please input Task Name");
        taskSize = JOptionPane.showInputDialog(null, "Please enter Task description");
        //if statement for outcome of task sized
    if (!checkTaskDescription(taskSize)) {
        JOptionPane.showMessageDialog(null, "Please enter 50 characters or under");
        while(!checkTaskDescription(taskSize)){
                taskSize = JOptionPane.showInputDialog(null, "Please enter Task description");
}
    } else {
        JOptionPane.showMessageDialog(null, "Task sucessfully captured");
    }        
        name = JOptionPane.showInputDialog(null, "Please enter name");
        surname = JOptionPane.showInputDialog(null, "Please enter surname");
        developer = name + surname;
        String userInput = JOptionPane.showInputDialog("Enter 1 or 2or 3 \n'1:To Do', \n'2:Done', or \n'3:Doing' to select a specific outcome:");
        String userChoice = userInput;
             
        //choice for 3 options
        switch (userChoice) {
            case "1":
                taskStatus = "To Do";
                break;
            case "2":
                taskStatus = "Done";
                break;
            case "3":
                taskStatus = "Doing";
                break;
            default:
        }
}
    public String taskStatus(){
    return "Task Status: "+taskStatus+"\n"+"\n";
}
    
    public String createClassID(){
     String twoLettersOfName = taskName.substring(0, Math.min(taskName.length(), 2));
     String threeDevelop = developer.substring(Math.max(0, developer.length()-3));
      taskID = twoLettersOfName.toUpperCase() + ":" + taskNumber1 + ":" + threeDevelop.toUpperCase();
    return "\nTaskID: "+taskID+"\n";
    }
    

    public int returnTotalHours(){
                 taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter task Duration"));  
             return taskDuration;

    }
    public int forTest(){
                     return taskDuration;
    }

    public String printTaskDetails(){
        //prints details
     String one = taskName;
     String two = taskNumber1;
     String three = taskSize;
     String four = developer;


    return "TaskName: "+one+"\nTask Number: "+two+"\nTask Description:"+three +"\nDeveloper Name:" +four +"\n";

        // Prompt User for Details 
    }

public void loopSave(){
            // Prompt User for Details 
        String dOne = developer;
        String dTwo = taskName;
        String dThree = taskID;
        int dFour = taskDuration;
        String dFive = taskStatus;
        String dSix = taskSize;
        // Populating the Array
        Developer[Reports] = dOne;
        TaskName[Reports] = dTwo;
        TaskID[Reports] = dThree;
        TaskDuration[Reports] = dFour;
        TaskStatus[Reports] = dFive;
        TASKDes[Reports]=dSix;
        Reports++;
    }

  public String onlyStatusDone() {
    StringBuilder onlyStatusDone = new StringBuilder();
    String SD = "Done";
    for (int i = 0; i < Reports; i++) {
        if (TaskStatus[i].equalsIgnoreCase(SD)) {
            onlyStatusDone.append("Developer: ").append(Developer[i])
                    .append("\nTask Name: ").append(TaskName[i])
                    .append("\nDuration: ").append(TaskDuration[i])
                    .append("\nTask Status: ").append(TaskStatus[i])
                    .append("\n\n");
        }
    }
    
    String report = onlyStatusDone.toString();
    
    if (report.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No report available.", "INCORRECT ENTRY", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, report, "Report", JOptionPane.INFORMATION_MESSAGE);
    }
    
    return report;
}
  
  
public String longestTaskDur() {
    if (Reports == 0) {
        JOptionPane.showMessageDialog(null, "No reports available.", "INCORRECT ENTRY", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }

    StringBuilder onlyStatusDone = new StringBuilder();

    int highestMarksIndex = 0;
    for (int i = 1; i < Reports; i++) {
        if (TaskDuration[i] > TaskDuration[highestMarksIndex]) {
            highestMarksIndex = i;
        }
    }

    onlyStatusDone.append("Developer: ").append(Developer[highestMarksIndex])
            .append("\nDuration: ").append(TaskDuration[highestMarksIndex])
            .append("\n\n");

    if (onlyStatusDone.length()==0) {
        JOptionPane.showMessageDialog(null, "No report available.", "INCORRECT ENTRY", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, onlyStatusDone.toString(), "Report", JOptionPane.INFORMATION_MESSAGE);
    }

    return onlyStatusDone.toString();
}
public void InputForName(){
SD = JOptionPane.showInputDialog(null, "Please enter Task Name");
}
public void inputForDeveloper(){
DE = JOptionPane.showInputDialog(null,"Please enter Developer");
}
public String searchByName() {
    StringBuilder onlyStatusDone = new StringBuilder();
    for (int i = 0; i < Reports; i++) {
        if (TaskName[i].equalsIgnoreCase(SD)) {
            onlyStatusDone.append("Developer: ").append(Developer[i])
                    .append("\nTask Name: ").append(TaskName[i])
                    .append("\nTask Status: ").append(TaskStatus[i])
                    .append("\n\n");
        }
    }
    if (onlyStatusDone.length() == 0) {
        return "No report available.";
    } else {
        return onlyStatusDone.toString();
    }
}

    public String searchdeveloper(){
        StringBuilder onlyStatusDone = new StringBuilder();
        for (int i = 0; i < Reports; i++) {
            if (Developer[i].equalsIgnoreCase(DE)) {
              onlyStatusDone.append("Developer: ").append(Developer[i])
                       .append("\nTask Name: ").append(TaskName[i])
                       .append("\nTask Status: ").append(TaskStatus[i])
                       .append("\n"+"\n");
            }
        }
    if (onlyStatusDone.length() == 0) {
        return "No report available.";
    } else {
        return onlyStatusDone.toString();
    }
    }
    
    
    
    
    public String delete(){
    String dev = JOptionPane.showInputDialog(null, "Enter task Name to search:");
    for (int i = 0; i < Reports; i++) {
        if (TaskName[i].equalsIgnoreCase(dev)) {
            JOptionPane.showMessageDialog(null, 
                "Developer: " + Developer[i] + 
                "\nTask Name: " + TaskName[i] + 
                "\nTaskID: " + TaskID[i] + 
                "\nTask Duration: " + TaskDuration[i] + 
                "\nTask Status: " + TaskStatus[i], 
                "Report Search", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }

    // Delete feature
     deleteChoice = JOptionPane.showInputDialog(null, "Do you want to delete this report? (Yes/No)");
    if (deleteChoice.equalsIgnoreCase("Yes")) {
        int i = 0;
        
        // Code to delete the report
        for (int j = i; j < Reports - 1; j++) {
            Developer[j] = Developer[j + 1];
            TaskName[j] = TaskName[j + 1];
            TaskID[j] = TaskID[j + 1];
            TaskDuration[j] = TaskDuration[j + 1];
            TaskStatus[j] = TaskStatus[j + 1];
        }
        Reports--; // Decrease the count of students after deletion
        return"Report deleted successfully.";
    } else {
        return "Report not deleted.";
    }
}
    
    
    public String displayAllStudents() {
 
   
        StringBuilder allStudents = new StringBuilder();
        for (int i = 0; i < Reports; i++) {
            allStudents.append("Developer Name: ").append(Developer[i])
                       .append("\nTask Name Name: ").append(TaskName[i])
                       .append("\nTask ID: ").append(TaskID[i])
                       .append("\nDuration: ").append(TaskDuration[i])
                       .append("\nTask Status: ").append(TaskStatus[i])
                       .append("\nTask Description: ").append(TASKDes[i])
                       .append("\n"+"\n");
        }
        if (allStudents.length() ==0) {
            return "No report available.";
        } else {
            return allStudents.toString();
        }
    }
}
