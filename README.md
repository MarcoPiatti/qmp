# QMP

## Solucion

![Diagrama UML de la solucion](![ejemplo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/MarcoPiatti/QMP/qmp_diagrama.puml)
)
	
## Comentarios

Quizas estoy sobreinterpretando el enunciado, pero cuando el cliente
hace mencion de los tipos de prenda, utiliza "etc" dando a entender que
la lista de tipos puede y va a extenderse.

Por lo tanto, a diferencia de las categorias que solo son un conjunto finito,
los tipos no pueden quedar como un enum "hardcodeado".
Sería una solucion poco escalable, ya que cada nuevo tipo de prenda que se
presente al sistema tendría que verse reflejado como un nuevo campo de un enum

El usuario tendrá que especificar los tipos a medida que los incorpore,
tal y como lo hará con las prendas.

## 3. Comentarios de alternativas descartadas

- Originalmente había idealizado los tipos de prenda como un enum.
