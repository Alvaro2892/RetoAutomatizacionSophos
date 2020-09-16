package co.com.certification.RetoSophos.tasks;

import co.com.certification.RetoSophos.model.InitializeObjects;
import co.com.certification.RetoSophos.userinterface.Track;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.certification.RetoSophos.util.Constants.ZERO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ComeIn  implements Task
{
    private List<InitializeObjects> data;

    public ComeIn (List<InitializeObjects> data)

    {
        this.data = data;
    }

    public static ComeIn WebSite(List<InitializeObjects> initializeObjects)
    {
        return Tasks.instrumented(ComeIn.class, initializeObjects);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        InitializeObjects info = data.get(ZERO);

        actor.attemptsTo(WaitUntil.the(Track.ClosePopUpNotify, isVisible()),
                Click.on(Track.ClosePopUpNotify),
                WaitUntil.the(Track.ClickSearch, isVisible()),
                Click.on(Track.ClickSearch),
                Enter.theValue(info.getItems()).into(Track.ClickSearch).thenHit(Keys.ENTER),
                Scroll.to(Track.ScrollItems),
                Click.on(Track.ClickAddMani),
                WaitUntil.the(Track.CLosePopUp, isVisible()),
                Click.on(Track.CLosePopUp),
                WaitUntil.the(Track.ScrollUpPage, isVisible()),
                Scroll.to(Track.ScrollUpPage),
                Click.on(Track.ClickShoppingCart),
                Click.on(Track.ClickLookCart),
                Scroll.to(Track.ScrollToVerify)
                );
    }
}
