package com.class17HomeWork;

public class StudentsTester {
    public static void main(String[] args) {

        Students jacob = new Students("Jacob", 4.0, 10.5, 14);
        jacob.calculateAverageGrade();
        Students alex = new Students("Alex", 5.0, 15.5, 17);
        alex.calculateAverageGrade();
        Students ashley = new Students("Ashley", 4.0, 7.5, 18);
        ashley.calculateAverageGrade();
        Students jack = new Students("Jack", 4.0, 5.5, 19);
        jack.calculateAverageGrade();
        Students lisa = new Students("Lisa", 4.0, 10, 20);
        lisa.calculateAverageGrade();


    }
}
