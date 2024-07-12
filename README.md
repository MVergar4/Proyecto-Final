# Proyecto-Final
Sistema de reserva de asientos de autobús.

Grupo Proyecto 4

Francisco Sebastián Cifuentes Ramírez,
Marcelo Adolfo Vergara Fierro.

El sistema de reserva de asientos de autobús permite al personal de una empresa de autobús elegir y reservar asientos de forma conveniente por su cliente. Los usuarios pueden  visualizar una representación gráfica de los asientos disponibles en el  autobús y seleccionar los que deseen ocupar. El sistema muestra información detallada sobre cada asiento, como su ubicación, número y  categoría (por ejemplo, semi cama, Salón Cama).

Una vez que los usuarios seleccionan los asientos deseados, el sistema verifica la disponibilidad y permite confirmar la reserva mostrando el precio a pagar. En caso de que algún asiento ya esté reservado por otro pasajero, se informa al usuario para que pueda elegir otro asiento disponible. El personal confirma el pago (no gestionado por el sistema) lo que reserva los asientos.

El sistema debe gestionar varios tipos de autobuses (por ejemplo, con diferente número de plazas, o de 1 o 2 pisos...).
El sistema debe mostrar un menú que permita seleccionar el autobús en función de su horario y recorrido (se supone que estos datos están disponibles con los autobuses vacíos cuando se lanza el software)

Diagrama UML de clases:

![Reserva asientos](https://github.com/user-attachments/assets/b8a850f1-40f5-4071-aa1b-5a52ffa0c01d)

Diagrama UML de casos de uso:

![Use_Case_Diagram](https://github.com/MVergar4/Proyecto-Final/assets/167582843/a5abfd41-0fcf-4d64-8921-6d89432fcf70)

Patrones utilizados:
- Builder:
  Utilizado por las clases, Builder, BusBuilder, Director, RecorridoChillan, RecorridoConcepcion, RecorridoSantiago, RecorridoTemuco.
  Este patrón fue elegido ya que se querían hacer distintos tipos de buses que requerirían un montón de parámetros, por lo tanto, era mejor usar un builder para organizar los tipos de buses y crear varios con un par de lineas.

Boceto de la interfaz:
![Boceto_de_la_interfaz](https://github.com/MVergar4/Proyecto-Final/assets/167582843/79f6a576-ba1d-4575-9279-cc29a4b704d3)

En un principio tratamos de plantear una idea bastante amplia sin muchos puntos específicos, por ejemplo varias ciudades de destino para los buses o más opciones en pantalla, y entre más nos adentrabamos en el desarrollo del programa, fuimos transformando y adaptando estas ideas a unas más acordes a lo que ibamos escribiendo en el código, por ejemplo, tener menos ciudades como opción pero teniendo más tipos de buses por ciudad.

Uno de los problemas más grandes para nosotros fue tener constancia en el código, a pesar de la dificultad de avanzar en el trabajo junto a lo que son los certámenes de cierre de semestre de otros ramos, igualmente podríamos haber avanzado un poco más de lo que lo hicimos.
Otro fue el aprender a usar cosas como los patrones, aunque fuimos capaces de entenderlos y usarlos, sentimos que podríamos haber hecho un uso más productivo o más eficiente con ellos, sin embargo no dedicamos tanto tiempo a experimentar con estos.
