package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.useinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        result = (question.equals(nameCourse)) ? true : false;
        System.out.println("-------------------------------"+nameCourse+"-------------------------------");
        return result;
    }
}
