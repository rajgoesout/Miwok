package com.example.android.miwok;

public class ReportCard {
    double englishGrade, mathGrade, physicsGrade;
    String name, subject[] = {"English", "Math", "Physics"};
    double grades[] = {0, 0, 0};

    public ReportCard(String student) {
        name = student;
    }

    public void setEnglishGrade(double grade) {
        grades[0] = grade;
    }

    public double getEnglishGrade() {
        return grades[0];
    }

    public void setMathGrade(double grade) {
        grades[1] = grade;
    }

    public double getMathGrade() {
        return grades[1];
    }

    public void setPhysicsGrade(double grade) {
        grades[2] = grade;
    }

    public double getPhysicsGrade() {
        return grades[2];
    }

    @Override
    public String toString() {
        String line = "";
        for (int i = 0; i < 3; i++) {
            line += subject[i] + " grade: " + grades[i] + "; ";
        }
        return "Name: " + name + "; " + line + "\n";
    }
}