Feature: Autenticacion en formulario de Colorlib
  Description: El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitu y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través de un globo informativo.


  @AutenticacionExitosa
  Scenario: Diligenciamiento exitoso del formulario de autenticacion en Colorlib
    Given Yo Ingreso a la plataforma colorlib
    When Yo me autentico con usuario "demo" y clave "demo"
    Then Yo verifico el ingreso exitoso