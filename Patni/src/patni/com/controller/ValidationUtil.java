/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patni.com.controller;

import javax.swing.JLabel;

/**
 *
 * @author itiss
 */
public class ValidationUtil {
    private static final String namepattern = "^[a-zA-Z|| ]+$";
    private static final String idpattern = "^(pat[a-zA-Z0-9]{5})";
    private static final String religionpattern = "^(Hinduism|Buddhism|Islam|Kirant|Christianity|Bon|Others|)$";
    private static final String  heightpattern = "5'([0-9]|10|11)|6'[0-5]";
    private static final String jobpattern = "^[a-zA-Z|| ]+$";
    private static final String salarypattern = "\\d+";
    private static final String genderpattern = "^(Male|Female|Other|)";
    private static final String agepattern = "\\d{2}";

     
    public static boolean isNullOrEmpty(String value){
        return value == null || value.trim().isEmpty();
    }
        
    public static boolean isValidId(String id, JLabel label) {
        if (id.matches(idpattern)&& !isNullOrEmpty(id)) {
            return true;
        } else {
            label.setText("Error in ID");
            return false;
        }
    }
    
    public static boolean isValidAge(String age, JLabel label){
        if (age.matches(agepattern)&& !isNullOrEmpty(age)){
            if (Integer.parseInt(age) < 20){
                label.setText("You are too young to marry");
                return false;
            }
            return true;
        }
        else{
            label.setText("Invalid Age");
            return false;
        }
    }

    public static boolean isValidName(String name, JLabel label) {
        if (name.matches(namepattern)&& !isNullOrEmpty(name)) {
            return true;
        } else {
            label.setText("Error in Name");
            return false;
        }
    }

    public static boolean isValidReligion(String religion, JLabel label) {
        if (religion.matches(religionpattern)&& !isNullOrEmpty(religion)) {
            return true;
        } else {
            label.setText("Error in Religion");
            return false;
        }
    }

    public static boolean isValidHeight(String height, JLabel label) {
        if (height.matches(heightpattern)&& !isNullOrEmpty(height)) {
            return true;
        } else {
            label.setText("Error in Height");
            return false;
        }
    }

    public static boolean isValidJob(String job, JLabel label) {
        if (job.matches(jobpattern)&& !isNullOrEmpty(job)) {
            return true;
        } else {
            label.setText("Error in Job");
            return false;
        }
    }

    public static boolean isValidSalary(String salary, JLabel label) {
        if (salary.matches(salarypattern)&& !isNullOrEmpty(salary)) {
            return true;
        } else {
            label.setText("Error in Salary");
            return false;
        }
    }

    public static boolean isValidGender(String gender, JLabel label) {
        if (gender.matches(genderpattern)&& !isNullOrEmpty(gender)) {
            return true;
        } else {
            label.setText("Error in Gender");
            return false;
        }
    }
}
