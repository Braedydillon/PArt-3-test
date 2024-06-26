/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Login {
    // Declarations
    String username;
    String password;
    String name;
    String surname;
    String enteredUsername;
    String enteredPassword;
    boolean loginStatus;

    /*
      Checks if the username is correctly formatted.
      The username to be checked.
      True if the username is correctly formatted, false otherwise.
    */
    public void inputusername(){
                    username = JOptionPane.showInputDialog(null, "Enter username (5 characters with underscore):", "Username", JOptionPane.QUESTION_MESSAGE);
    }
    public void inputpassword(){
                            password = JOptionPane.showInputDialog(null, "Enter password (8 characters with uppercase, special character, and number):", "Password", JOptionPane.QUESTION_MESSAGE);

    }
    public boolean checkUserName(String username) {
        return  username.contains("_") && username.length() <=5 ;
    }

    /*
     Checks the complexity of the password.
     password The password to be checked.
     True if the password meets the complexity requirements, false otherwise.
     */
    public boolean checkPasswordComplexity(String password) {
return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[^A-Za-z0-9].*");
    }

    /*
     Registers a new user.
     A message indicating the success or failure of the registration process.
     */
    public String registerUser() {
        String message="";

        if (!checkUserName(username)) {
            message += "Username is not correctly formatted. Please ensure that the username has an underscore and is no more than 5 characters in length\n";
        } else {
            message += "User Successfully Captured\n";}
            if (!checkPasswordComplexity(password)) {
                message += "Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character\n";
            } else {
                message += "Password Successfully Captured\n";
                
            }
        

        return message;
    }
    public void nameAndSurname(){
     name = JOptionPane.showInputDialog(null, "Enter your name:", "Name", JOptionPane.QUESTION_MESSAGE);
     surname = JOptionPane.showInputDialog(null, "Enter your surname:", "Surname", JOptionPane.QUESTION_MESSAGE);
    }

    /*
     Logs in a user.
     True if the login is successful, false otherwise.
     */
    public void enterLogin(){
         enteredUsername = JOptionPane.showInputDialog("Enter username:");
         enteredPassword = JOptionPane.showInputDialog("Enter password:");  
    }
    public boolean loginUser() {


        loginStatus = enteredUsername.equals(username) && enteredPassword.equals(password);

        return loginStatus;
    }

    /*
     Returns the login status and displays a welcome message if the login is successful.
     A message indicating the login status.
     */
    public String returnLoginStatus() {
        String welcomeMessage = loginStatus ? "Welcome, " + name + " " + surname + "\nit is great to see you" : "Login Unsuccessful";
        return welcomeMessage;
    }

}

