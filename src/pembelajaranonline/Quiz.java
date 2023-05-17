/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembelajaranonline;

import java.util.List;

/**
 *
 * @author ASUS
 */
class Quiz {
    private String quizId;
    private String quizTitle;

    public Quiz(String quizId, String quizTitle) {
        this.quizId = quizId;
        this.quizTitle = quizTitle;
    }

    public String getQuizId() {
        return quizId;
    }

    public String getQuizTitle() {
        return quizTitle;
    }
}
