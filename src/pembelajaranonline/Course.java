/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembelajaranonline;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
class Course {
    private String courseId;
    private String courseTitle;
    private List<Lesson> lessons;
    private List<Quiz> quizzes;
    private List<Assignment> assignments;
    

    public Course(String courseId, String courseTitle) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.lessons = new ArrayList<>();
        this.quizzes = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public void addQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    Object getLessons() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getQuiz() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getAssignment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getLesson() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
