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
public class LoginTest {
@Test
public void RegisterSucceses(){
Login login = new Login();
login.username = "Kyl_1";
login.password = "Ch&&sec@ke99!";
String Expected="User Successfully Captured\nPassword Successfully Captured\n";
String Actual=login.registerUser();
assertEquals(Expected,Actual);
 
}
@Test
public void RegisterFail(){
Login login = new Login();
login.username = "kyle!!!!!!!";
login.password = "password";
String Expected="Username is not correctly formatted. Please ensure that the username has an underscore and is no more than 5 characters in length\nPassword is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character\n";
String Actual=login.registerUser();
assertEquals(Expected,Actual);
}
@Test
public void SuccesesLogin(){
Login login = new Login();
login.username = "Kyl_1";
login.password = "Ch&&sec@ke99!";
login.enteredUsername="Kyl_1";
login.enteredPassword="Ch&&sec@ke99!";
assertTrue(login.loginUser());
}
@Test
public void UnsucessfullLogin(){
Login login = new Login();
login.username = "kyle!!!!!!!";
login.password = "password";
login.enteredUsername="";
login.enteredPassword="";
assertFalse(login.loginUser());

}
@Test
public void usernameTestTrue(){
Login login = new Login();
assertTrue(login.checkUserName("Kyl_1"));
}
@Test
public void usernameTestFalse(){
Login login = new Login();
assertFalse(login.checkUserName("kyle!!!!!!!"));
}
@Test
public void passwordTestTrue(){
Login login = new Login();
assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
}
@Test
public void passwordTestFalse(){
Login login = new Login();
assertFalse(login.checkPasswordComplexity("password"));
}
}