
@driver:firefox
Feature: Formulaire Devis


  Scenario: Remplissage correct formulaire devis

    Given l'utilisateur est sur la page d'acceuil
    When l'utilisateur clique sur bouton devis
    And l'utilisateur remplie le formulaire correctement
    And l'utilisateur valide l'envoie du formulaire
    Then vérifier le succès de l'opération


  Scenario: Remplissage incorrect formulaire devis

    Given l'utilisateur est sur la page d'acceuil
    When l'utilisateur clique sur bouton devis
    And l'utilisateur ne remplie pas correctement le formulaire
    And l'utilisateur valide l'envoie du formulaire
    Then vérifier l echec de l opération