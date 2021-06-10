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

  @AutenticacionExitosaConDatatable
  Scenario: Diligenciamiento exitoso del formulario de autenticacion en Colorlib
    Given Yo Ingreso a la plataforma colorlib
    When Yo me autentico con los siguientes datos
      | Usuario | Clave |
      |  demo   |  demo |
    Then Yo verifico el ingreso exitoso

  @AutenticacionExitosaConTitulosDeCampos
  Scenario Outline: Diligenciamiento exitoso del formulario de autenticacion en Colorlib
    Given Yo Ingreso a la plataforma colorlib
    When Yo me autentico con los datos
      |<Usuario> | <Clave> |
    Then Yo verifico el mensaje
      | <Esperado> |

    Examples:
      | Usuario  | Clave  | Esperado                  |
      |  demo1   |  demo1 | Bootstrap-Admin-Template  |


  @AutenticacionExitosaConDatosExcel
  Scenario Outline: Diligenciamiento exitoso del formulario de autenticacion en Colorlib
    Given Yo Ingreso a la plataforma colorlib
    When Yo me autentico con los datos de excel
      |<Usuario> | <Clave> |
    Then Yo verifico el mensaje
      | <Esperado> |

    Examples:
      | Usuario  | Clave  | Esperado                  |
      ##@externaldata@./src/test/resources/datos/datos.xlsx@Sheet1
   |demo1   |demo1   |Bootstrap-Admin-Template|
   |demo2   |demo2   |Bootstrap-Admin-Template|
