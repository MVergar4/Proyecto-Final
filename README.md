# Proyecto-Final
Sistema de reserva de asientos de autobús.

Grupo Proyecto 4

Francisco Sebastián Cifuentes Ramírez,
Marcelo Adolfo Vergara Fierro.

Diagrama UML de clases:

![Reserva asientos](https://github.com/MVergar4/Proyecto-Final/assets/167582843/5b7b4ffe-ab07-4eda-81c9-c53ad86e7c22)

Diagrama UML de casos de uso:

![Use_Case_Diagram](https://github.com/MVergar4/Proyecto-Final/assets/167582843/dc2963e9-d916-41b3-a634-a1b56a44a7f1)

Patrones utilizados:
- Builder:
  Utilizado por las clases, Builder, BusBuilder, Director, RecorridoChillan, RecorridoConcepcion, RecorridoSantiago, RecorridoTemuco.
  Este patrón fue elegido ya que se querían hacer distintos tipos de buses que requerirían un montón de parámetros, por lo tanto, era mejor usar un builder para organizar los tipos de buses y crear varios con un par de lineas.

Boceto de la interfaz:
![Boceto_de_la_interfaz](https://github.com/MVergar4/Proyecto-Final/assets/167582843/79f6a576-ba1d-4575-9279-cc29a4b704d3)

En un principio tratamos de plantear una idea bastante amplia sin muchos puntos específicos, por ejemplo varias ciudades de destino para los buses o más opciones en pantalla, y entre más nos adentrabamos en el desarrollo del programa, fuimos transformando y adaptando estas ideas a unas más acordes a lo que ibamos escribiendo en el código, por ejemplo, tener menos ciudades como opción pero teniendo más tipos de buses por ciudad.

Uno de los problemas más grandes para nosotros fue tener constancia en el código, a pesar de la dificultad de avanzar en el trabajo junto a lo que son los certámenes de cierre de semestre de otros ramos, igualmente podríamos haber avanzado un poco más de lo que lo hicimos.
Otro fue el aprender a usar cosas como los patrones, aunque fuimos capaces de entenderlos y usarlos, sentimos que podríamos haber hecho un uso más productivo o más eficiente con ellos, sin embargo no dedicamos tanto tiempo a experimentar con estos.
