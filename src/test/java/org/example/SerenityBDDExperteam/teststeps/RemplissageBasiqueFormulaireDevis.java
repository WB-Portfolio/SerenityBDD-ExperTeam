package org.example.SerenityBDDExperteam.teststeps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.SerenityBDDExperteam.pages.PageAcceuil;
import org.example.SerenityBDDExperteam.pages.PageDevis;
import org.junit.Assert;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class RemplissageBasiqueFormulaireDevis {


    PageAcceuil pageAcceuil;
    PageDevis pageDevis;


    @Given("^l'utilisateur est sur la page d'acceuil$")
    public void lUtilisateurEstSurLaPageDAcceuil() {
        getDriver().manage().window().maximize();
        pageAcceuil.open();
    }

    @When("l'utilisateur clique sur bouton devis")
    public void lUtilisateurCliqueSurBoutonDevis() {
        pageAcceuil.Boutondevis().click();
    }

    @And("l'utilisateur remplie le formulaire correctement")
    public void lUtilisateurRemplieLeFormulaireCorrectement() {
        pageDevis.checkBoxParticulier().click();
        pageDevis.checkBoxAssujettieTVA().click();
        pageDevis.champsThemedeformation().sendKeys("ISTQB - Testeur logiciel - Niveau foundation");
        pageDevis.champsNombreparticipants().sendKeys("12");
        pageDevis.checkBoxInterentreprise().click();
        pageDevis.champsDatesouhaitee().clear();
        pageDevis.champsDatesouhaitee().sendKeys("27/10/2020");
        pageDevis.champsNomprenom().sendKeys("Frack Ribery");
        pageDevis.champsTelephone().sendKeys("258966445599");
        pageDevis.champsEmail().sendKeys("frack.ribery@bayern.com");
        pageDevis.Listefonction().click();
        pageDevis.Optionlistederoulante().click();
        pageDevis.champsEntreprise().sendKeys("ExperTeam");
        pageDevis.checkBoxUrgente().click();
        pageDevis.checkBoxEmail().click();
    }

    @And("^l'utilisateur valide l'envoie du formulaire$")
    public void lUtilisateurValideLEnvoieDuFormulaire() {
        pageDevis.boutonEnvoyer().click();
    }

    @Then("^vérifier le succès de l'opération$")
    public void vérifierLeSuccèsDeLOpération() {
        Assert.assertTrue(pageDevis.Notificationsucces().isDisplayed());
    }


    @And("l'utilisateur ne remplie pas correctement le formulaire")
    public void lUtilisateurNeRempliePasCorrectementLeFormulaire() {
        pageDevis.checkBoxParticulier().click();
        pageDevis.checkBoxAssujettieTVA().click();
        pageDevis.champsThemedeformation().sendKeys("ISTQB - Testeur logiciel - Niveau foundation");
        pageDevis.champsNombreparticipants().sendKeys("12");
        pageDevis.checkBoxInterentreprise().click();
        pageDevis.champsDatesouhaitee().clear();
        pageDevis.champsDatesouhaitee().sendKeys("27/10/2020");
        pageDevis.champsNomprenom().sendKeys("Frack Ribery");
        pageDevis.champsTelephone().sendKeys("258966445599");
        pageDevis.champsEmail().sendKeys("frack.ribery@bayern.com");
        pageDevis.Listefonction().click();
        pageDevis.Optionlistederoulante().click();
        pageDevis.checkBoxUrgente().click();
        pageDevis.checkBoxEmail().click();
    }

    @Then("vérifier l echec de l opération")
    public void vérifierLEchecDeLOpération() {
        Assert.assertTrue(pageDevis.Notificationechec().isDisplayed());
    }


}
