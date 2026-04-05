package com.example;

public class App {

    public String getGrade(int marks) {

        if (marks >= 90) return "Grade S";
        else if (marks >= 80) return "Grade A";
        else if (marks >= 70) return "Grade B";
        else if (marks >= 60) return "Grade C";
        else if (marks >= 50) return "Grade D";
        else if (marks >= 40) return "Grade E";
        else return "Grade F";
    }

    public static void main(String[] args) {
        App obj = new App();
        System.out.println(obj.getGrade(85));
        print(" ")
    }
}
