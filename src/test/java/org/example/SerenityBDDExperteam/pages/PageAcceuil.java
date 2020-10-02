package org.example.SerenityBDDExperteam.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://www.expertunisie.com/")
public class PageAcceuil extends PageObject {

    @FindBy(css = "#menu-item-181", timeoutInSeconds = "20")
    private WebElement boutondevis;

    public void setBoutondevis(WebElement boutondevis) {
        this.boutondevis = boutondevis;
    }

    public WebElement Boutondevis() {
        return boutondevis;
    }


}
