/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembelajaranonline;

/**
 *
 * @author ASUS
 */
public class Comment {
    public static void main(String[] args) {
        // Membuat objek pengguna
        User user = new User("1", "Bara Teguh Permadi");

        // Membuat objek kursus
        Course course = new Course("C001", "Program Pembelajaran");

        // Menambahkan pelajaran ke dalam kursus
        Lesson lesson1 = new Lesson("L001", "Variables and Data Types", "Lesson content goes here");
        Lesson lesson2 = new Lesson("L002", "Conditional Statements", "Lesson content goes here");
        course.addLesson(lesson1);
        course.addLesson(lesson2);

        // Menambahkan kuis ke dalam kursus
        Quiz quiz1 = new Quiz("Q001", "Variables and Data Types Quiz");
        Quiz quiz2 = new Quiz("Q002","Conditional Statements Quiz");
        course.addQuiz(quiz1);
        course.addQuiz(quiz2);
        
 // Menambahkan tugas ke dalam kursus
    Assignment assignment1 = new Assignment("A001", "Variables and Data Types Assignment");
    Assignment assignment2 = new Assignment("A002", "Conditional Statements Assignment");
    course.addAssignment(assignment1);
    course.addAssignment(assignment2);

    // Membuat objek forum diskusi
    DiscussionForum forum = new DiscussionForum();

    // Menambahkan posting ke dalam forum diskusi
    forum.addPost("Welcome to the course!");
    forum.addPost("Any questions about the first lesson?");

    // Menampilkan informasi pengguna, kursus, pelajaran, kuis, tugas, dan posting forum
    System.out.println("User: " + user.getUsername());
    System.out.println("Course: " + course.getCourseTitle());
    System.out.println("Discussion Forum Posts: " + forum.getPosts().size());
}
}

