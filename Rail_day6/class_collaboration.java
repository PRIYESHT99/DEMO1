package Rail_day6;

class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class Student {
    private String name;
    private int age;
    private School school;
    private Subject[] subjects;

    public Student(String name, int age, School school, Subject[] subjects) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.subjects = subjects;
    }

    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School: " + school.getName());
        System.out.println("Subjects and Scores:");
        for (Subject subject : subjects) {
            System.out.println(subject.getName() + ": " + subject.getScore());
        }
    }
}

public class class_collaboration  {
    public static void main(String[] args) {
        School school = new School("Example School");
        Subject[] subjects = {new Subject("Math", 90), new Subject("Science", 85), new Subject("History", 88)};
        Student student = new Student("amit shah", 17, school, subjects);
        student.displayResult();
    }
}


