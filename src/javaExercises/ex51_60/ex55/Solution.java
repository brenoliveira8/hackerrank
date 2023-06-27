package javaExercises.ex51_60.ex55;

import java.util.*;

class Priorities{
    private final PriorityQueue<Student> queue = new PriorityQueue<>(
            Comparator.comparing(Student::getCGPA).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getId)
    );
    public List<Student> getStudents(List<String> events){
        events.forEach(event -> {
                    if(event.equals("SERVED")){
                        queue.poll();
                    }else{
                        String[] words = event.split(" ");
                        String name = words[1];
                        double cgpa = Double.parseDouble(words[2]);
                        int id = Integer.parseInt(words[3]);
                        Student student = new Student(id, name, cgpa);
                        queue.add(student);
                    }
                }
        );
        List<Student> students = new ArrayList<>();
        while(!queue.isEmpty()){
            students.add(queue.poll());
        }
        return students;
    }
}

class Student{
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getCGPA(){
        return cgpa;
    }
}

public class Solution{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args){
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while(totalEvents-- != 0){
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if(students.isEmpty()){
            System.out.println("EMPTY");
        }else{
            for(Student st : students){
                System.out.println(st.getName());
            }
        }
    }
}
