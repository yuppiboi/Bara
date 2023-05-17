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
class Lesson {
    private String lessonId;
    private String lessonTitle;
    private String content;
    private List<Lesson> lessons;
    
    public Lesson(String lessonId, String lessonTitle, String content) {
        this.lessonId = lessonId;
        this.lessonTitle = lessonTitle;
        this.content = content;
        this.lessons = new ArrayList<>();
    }

    public String getLessonId() {
        return lessonId;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public String getContent() {
        return content;
    }
    
    public List<Lesson> getLesson() {
        return lessons;
    }

}
