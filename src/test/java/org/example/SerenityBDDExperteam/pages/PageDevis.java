package org.example.SerenityBDDExperteam.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class PageDevis extends PageObject {

    @FindBy(xpath = "//input[@value='Entreprise']")
    private WebElement entreprise;

    @FindBy(xpath = "//input[@value='Particulier']")
    private WebElement particulier;

    @FindBy(xpath = "//input[@value='Assujettie à la TVA']")
    private WebElement assujettieTVA;

    @FindBy(xpath = "//input[@value='Exonérée de la TVA']")
    private WebElement exonereTVA;

    @FindBy(xpath = "//input[@name='formation']")
    private WebElement themedeformation;

    @FindBy(xpath = "//input[@name='nombre_personnes']")
    private WebElement nombreparticipants;

    @FindBy(xpath = "//input[@value='Intra-Entreprise']")
    private WebElement intraentreprise;

    @FindBy(xpath = "//input[@value='Inter-Entreprise']")
    private WebElement interentreprise;

    @FindBy(xpath = "//input[@name='your-date']")
    private WebElement datesouhaitee;

    @FindBy(xpath = "//input[@name='your-name']")
    private WebElement nomprenom;

    @FindBy(xpath = "//input[@name='your-tel']")
    private WebElement telephone;

    @FindBy(xpath = "//input[@name='your-email']")
    private WebElement email;

    @FindBy(xpath = "//select[@name='your-job']")
    private WebElement listefonction;

    @FindBy(xpath = "//input[@name='your-company']")
    private WebElement societe;

    @FindBy(xpath = "//input[@value='Urgente']")
    private WebElement urgente;

    @FindBy(xpath = "//input[@value='Moyenne']")
    private WebElement moyenne;

    @FindBy(xpath = "//input[@value='Normale']")
    private WebElement normale;

    @FindBy(xpath = "//input[@value='Email']")
    private WebElement checkboxEmail;

    @FindBy(xpath = "//input[@value='Tél']")
    private WebElement checkboxTel;

    @FindBy(xpath = "//input[@value='Contact Direct']")
    private WebElement checkboxContactdirect;


    @FindBy(xpath = "//input[@value='Envoyer']")
    private WebElement boutonenvoyer;

    @FindBy(xpath = "//option[@value='Administration']")
    private WebElement optionlistederoulante;


    @FindBy(xpath = "//form//div[contains(text(),'Merci pour votre message. Notre service commercial va prendre contact avec vous dans les plus bref délais')]")
    private WebElement notificationsucces;



    @FindBy(xpath = "//input[@name='your-company']/following-sibling::span[@class='wpcf7-not-valid-tip']")
    private WebElement notificationechec;

    public WebElement Notificationechec() {
        return notificationechec;
    }

    public void setNotificationechec(WebElement notificationechec) {
        this.notificationechec = notificationechec;
    }

    public WebElement Notificationsucces() {
        return notificationsucces;
    }

    public void setNotificationsucces(WebElement notificationsucces) {
        this.notificationsucces = notificationsucces;
    }

    public WebElement Optionlistederoulante() {
        return optionlistederoulante;
    }

    public void setOptionlistederoulante(WebElement optionlistederoulante) {
        this.optionlistederoulante = optionlistederoulante;
    }

    public WebElement checkBoxEntreprise() {
        return entreprise;
    }

    public void setEntreprise(WebElement entreprise) {
        this.entreprise = entreprise;
    }

    public WebElement checkBoxParticulier() {
        return particulier;
    }

    public void setParticulier(WebElement particulier) {
        this.particulier = particulier;
    }

    public WebElement checkBoxAssujettieTVA() {
        return assujettieTVA;
    }

    public void setAssujettieTVA(WebElement assujettieTVA) {
        this.assujettieTVA = assujettieTVA;
    }

    public WebElement checkBoxExonereTVA() {
        return exonereTVA;
    }

    public void setExonereTVA(WebElement exonereTVA) {
        this.exonereTVA = exonereTVA;
    }

    public WebElement champsThemedeformation() {
        return themedeformation;
    }

    public void setThemedeformation(WebElement themedeformation) {
        this.themedeformation = themedeformation;
    }

    public WebElement champsNombreparticipants() {
        return nombreparticipants;
    }

    public void setNombreparticipants(WebElement nombreparticipants) {
        this.nombreparticipants = nombreparticipants;
    }

    public WebElement checkBoxIntraentreprise() {
        return intraentreprise;
    }

    public void setIntraentreprise(WebElement intraentreprise) {
        this.intraentreprise = intraentreprise;
    }

    public WebElement checkBoxInterentreprise() {
        return interentreprise;
    }

    public void setInterentreprise(WebElement interentreprise) {
        this.interentreprise = interentreprise;
    }

    public WebElement champsDatesouhaitee() {
        return datesouhaitee;
    }

    public void setDatesouhaitee(WebElement datesouhaitee) {
        this.datesouhaitee = datesouhaitee;
    }

    public WebElement champsNomprenom() {
        return nomprenom;
    }

    public void setNomprenom(WebElement nomprenom) {
        this.nomprenom = nomprenom;
    }

    public WebElement champsTelephone() {
        return telephone;
    }

    public void setTelephone(WebElement telephone) {
        this.telephone = telephone;
    }

    public WebElement champsEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public WebElement Listefonction() {
        return listefonction;
    }

    public void setListefonction(WebElement listefonction) {
        this.listefonction = listefonction;
    }

    public WebElement champsEntreprise() {
        return societe;
    }

    public void setSociete(WebElement societe) {
        this.societe = societe;
    }

    public WebElement checkBoxUrgente() {
        return urgente;
    }

    public void setUrgente(WebElement urgente) {
        this.urgente = urgente;
    }

    public WebElement checkBoxMoyenne() {
        return moyenne;
    }

    public void setMoyenne(WebElement moyenne) {
        this.moyenne = moyenne;
    }

    public WebElement checkBoxNormale() {
        return normale;
    }

    public void setNormale(WebElement normale) {
        this.normale = normale;
    }

    public WebElement checkBoxEmail() {
        return checkboxEmail;
    }

    public void setCheckboxEmail(WebElement checkboxEmail) {
        this.checkboxEmail = checkboxEmail;
    }

    public WebElement checkBoxTel() {
        return checkboxTel;
    }

    public void setCheckboxTel(WebElement checkboxTel) {
        this.checkboxTel = checkboxTel;
    }

    public WebElement checkBoxContactdirect() {
        return checkboxContactdirect;
    }

    public void setCheckboxContactdirect(WebElement checkboxContactdirect) {
        this.checkboxContactdirect = checkboxContactdirect;
    }

    public WebElement boutonEnvoyer() {
        return boutonenvoyer;
    }

    public void setBoutonenvoyer(WebElement boutonenvoyer) {
        this.boutonenvoyer = boutonenvoyer;
    }


}
