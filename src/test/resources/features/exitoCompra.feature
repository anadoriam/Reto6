
@stories
Feature:EXITO
  Mostrar los datos del tv seleccionado en consola con sus caracteristicas requeridas

  @scenario
  Scenario: validacion de caracteristicas del televisor
    Given Ana quiere comprar un Televior marca LG en el exito
    When entra en la aplicacion del grupo exito y buscamos la seccion de televisores
    Then seleccionamos el tv que queremos y se sube al carrito paracomprarla
