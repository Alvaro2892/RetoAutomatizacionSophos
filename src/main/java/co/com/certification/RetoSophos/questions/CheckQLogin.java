package co.com.certification.RetoSophos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.certification.RetoSophos.userinterface.Track.VERIFYITEMS;

public class CheckQLogin implements Question<Boolean>
{
    String word;

    public CheckQLogin(String word)
    {
        this.word = word;
    }

    public static CheckQLogin is(String questionv)
    {
        return new CheckQLogin(questionv);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text = Text.of(VERIFYITEMS).viewedBy(actor).asString();
        return word.equals(text );
    }
}


