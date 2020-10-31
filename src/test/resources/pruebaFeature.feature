
  Feature: Validacion de campos
    Deseo poder validar el tamaño del campo codigo de reserva

    Scenario: Validar campo reseva
      Given me encuentro en la pagina web de LATAM  Colombia
      When entro a mis viajes y busco el codigo de reserva
      Then  se ve que el codigo tiene 6 digitos
