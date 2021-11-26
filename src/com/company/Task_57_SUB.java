package com.company;

public class Task_57_SUB {
    String fieldOfStudy;
    String[] computerSubjects = {"Subject1", "Subject2", "Subject3"};
    String[] scienceSubjects = {"SubjectA", "SubjectB", "SubjectC"};

    public Task_57_SUB(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
        this.computerSubjects = computerSubjects;
        this.scienceSubjects = scienceSubjects;
    }
    public Task_57_SUB() {
    }

    public void printSubjects() {
        if (fieldOfStudy == null) {
            System.out.println("Unknown");
        } else if (fieldOfStudy.equals("Computer")) {
            for (String str : computerSubjects)
                System.out.println(str);
        } else if (fieldOfStudy.equals("Science")) {
            for (String str : scienceSubjects)
                System.out.println(str);
        }else{
            System.out.println("Unknown");
        }
    }
}
