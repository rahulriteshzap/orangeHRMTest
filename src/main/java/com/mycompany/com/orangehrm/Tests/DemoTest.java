/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.com.orangehrm.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author rahul
 */
public class DemoTest {
    
    WebDriver driver;
    
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        
    }
    
}
