# Autor: Alberto Caballero

  @stories
  Feature: Bancolombia Page
    As a user i want to open an PDF document to see some bank information
  @scenario1
  Scenario: Search for the PDF of Tarifas de cuentas de depósitos
    Given than Tom wants to know the Tarifas de cuentas de Depósitos
    When he seach for the PDF document
    Then he find the PDF document about Tarifas de cuentas de Depósitos
    |      urlTarifasCuentasDepositos     |
    |     Tarifas_cuentas_depositos       |
  @scenario2
  Scenario: Search for the PDF document about the visita del presidente del BID
    Given than Tom wants to reed the news about the visita del presidente del BID
    When he search for the PDF document
    Then he find the News about visita del presidente del BID
    |   urlVisitaDelBID       |
    |  VISITA+PRESIDENTE+BID  |
