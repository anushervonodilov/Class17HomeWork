package com.class17HomeWork;

public class Students {

//    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
//    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
//    with different marks. Your program should print an average mark of each student.
//    NOTE: please use different names for instance and local variables.

    String name;
    double math;
    double history;
    double algebra;

    Students(String sName, double mathGrade, double historyGrade, double algebraGrade) {
        name = sName;
        math = mathGrade;
        history = historyGrade;
        algebra = algebraGrade;
    }

    void calculateAverageGrade() {
        double average = ((math + history + algebra) / 3);
        System.out.println(average);
    }

}
