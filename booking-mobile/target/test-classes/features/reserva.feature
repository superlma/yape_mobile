Feature: Reserva

  Scenario: Realizar reserva
    Given dar click a la opción cerrar login
    When escribir el destino "Cusco" del hospedaje
    And se selecciona la fecha inicio "29 January 2024"
    And se selecciona la fecha fin "31 January 2024"
    And se ingresa 1 cuartos
    And se ingresa 2 adultos
    And se ingresa niño de 5 años
    And se realiza la busqueda
    And se selecciona la opción "Palacio del Inka, a Luxury Collection Hotel, Cusco"
    And se realiza la reserva

