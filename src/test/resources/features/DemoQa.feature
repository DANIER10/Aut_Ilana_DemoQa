#language:es
@tag
Característica: Automatizacion DemoQA

  @realizarRegistro
  Esquema del escenario: realizar registro de estudiante
    Dado que el usuario ingresa al formulario de registro de estudiantes

    Cuando registra un estudiante
      |nombre|apellido|correo|numero|cumpleanos|
      |<nombre>|<apellido>|<correo>|<numero>|<cumpleanos>|

    Entonces verifica que se registro el estudiante
      |mensaje|
      |<mensaje>|
    Ejemplos:
      |nombre|apellido|correo|numero|cumpleanos|mensaje|
      |Danier|Mena    |danier@test.com|3235648800|19 Dec 1993|Thanks for submitting the form|


   @carrusel
    Esquema del escenario: verificar el funcionamiento del carrusel
    Dado que el usuario ingresa a la seccion sliders

    Cuando arrastra el control deslizante hasta la posicion tres

    Entonces verifica que se muestra en el campo valor del slider, el numero de la posicion
      |<posicion>|
    Ejemplos:
      |posicion|
      |3      |

     # @enlaces
 # Esquema del escenario: verificar los enlaces
 #   Dado que el usuario ingresa a la seccion de Enlaces

 #   Cuando ingresa a cada uno de los enlaces

   # Entonces verifica que cada uno de los enlaces dirige a la pag correcta
  #    |home|homei68kg|created|nocontent|moved|badrequest|unauthorized|forbidden|notfound|
  #    |<home>|<homei68kg>|<created>|<nocontent>|<moved>|<badrequest>|<unauthorized>|<forbidden>|<notfound>|
  #  Ejemplos:
   #   |home|homei68kg|created|nocontent|moved|badrequest|unauthorized|forbidden|notfound|
  #    |https://demoqa.com/|https://demoqa.com/|created|nocontent|moved|badrequest|unauthorized|forbidden|notfound|