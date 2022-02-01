package com.example.table_memorizer;

public class TrueFalseQuestionDataholder {
    String question;
    boolean answer;

    public TrueFalseQuestionDataholder(String question, boolean answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
