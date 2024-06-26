/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


/**
 *
 * @author braed
 */
public class TaskTest {
         private Task Task;

    @BeforeEach
    public void setUp() {
        Task = new Task();

        // Initializing test data
        Task.Developer = new String[]{"MikeSmith", "EdwardHarrison", "SamanthaPaulson", "GlendaOberholzer"};
        Task.TaskName = new String[]{"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        Task.TaskDuration = new int[]{5, 8, 2, 11};
        Task.TaskStatus = new String[]{"To Do", "Doing", "Done", "To Do"};
        Task.Reports = 4;
    }

        
    @Test
    public void testTwoLoopsData() {
        Task task = new Task();
        task.input="2";
        task.taskName = "Login Feature";
        task.taskSize = "Create a login to authenticate users";
        task.name = "Robyn";
        task.surname = "Harrison";
        task.taskStatus = "To Do";
        task.taskDuration= 8;
        task.developer = task.name + task.surname;
        task.taskStatus = "To Do";
        int num = task.forTest();

        String Expected="TaskName:Task 1\nTask Number: 1\nTask Description:This is a task description\n";
        String actualOutput = task.printTaskDetails() + "Total Hours: " + num + task.createClassID();
        
    }
    @Test 
    public void testTaskDescriptionPass() {
        Task task = new Task();
        String taskSize = "Complete task description within limit";
        boolean result = task.checkTaskDescription(taskSize);
        assertEquals(true, result);
    }

    @Test
    public void testTaskDescriptionFail() {
        Task task = new Task();
        String taskSize = "This task description is way too long and exceeds the limit allowed";
        boolean result = task.checkTaskDescription(taskSize);
        assertEquals(false, result);
    }
 @Test
    public void testCreateID1() {
        Task task = new Task();
        task.taskName = "CR";
        task.taskNumber1 = "0";
        task.developer = "IKE";

        String expectedID = "\nTaskID: CR:0:IKE\n";
        String actualID = task.createClassID();

        assertEquals(expectedID, actualID);
    }
        @Test
    public void testCreateID2() {
        Task task = new Task();
        task.taskName = "CR";
        task.taskNumber1 = "1";
        task.developer = "ARD";
        String expectedID = "\nTaskID: CR:1:ARD\n";
        String actualID = task.createClassID();

        assertEquals(expectedID, actualID);
    }
    @Test
    public void testCreateID3() {
        Task task = new Task();
        task.taskName = "CR";
        task.taskNumber1 = "2";
        task.developer = "THA";
        String expectedID = "\nTaskID: CR:2:THA\n";
        String actualID = task.createClassID();

        assertEquals(expectedID, actualID);
    }
  @Test
    public void testTaskDuration() {
        Task task = new Task();
        int expectedTotalHours = 0;
        int[] hours = {10, 12, 55, 11, 1};

        for (int i = 0; i < hours.length; i++) {
            task.taskDuration = hours[i];
            expectedTotalHours += hours[i];
        }
    }

@Test
    public void testOnlyStatusDone() {
        String expected = "Developer: SamanthaPaulson\nTask Name: Create Reports\nDuration: 2\nTask Status: Done\n\n";
        assertEquals(expected, Task.onlyStatusDone());
    }

    @Test
    public void testLongestTaskDur() {
        String expected = "Developer: GlendaOberholzer\nDuration: 11\n\n";
        assertEquals(expected, Task.longestTaskDur());
    }

    @Test
    public void testSearchByName() {
        String expected = "Developer: MikeSmith\nTask Name: Create Login\nTask Status: To Do\n\n";
        Task.SD="Create Login";
        assertEquals(expected, Task.searchByName());
    }

    @Test
    public void testSearchDeveloper() {
        String expected = "Developer: SamanthaPaulson\nTask Name: Create Reports\nTask Status: Done\n\n";
        Task.DE = "SamanthaPaulson";
        assertEquals(expected, Task.searchdeveloper());
    }

    
    
}
