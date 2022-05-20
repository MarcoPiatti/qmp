# QMP

## Solucion

![Diagrama UML de la solucion](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/MarcoPiatti/QMP/main/docs/qmp_diagrama.puml)
	
## Comentarios

Por como lo modelé, cada nuevo uniforme necesitaría una nueva subclase Factory para ser creado.
Esto no me resulta ideal porque implica tener algo hardcodeado por cada posible uniforme que quiera tener.
Idealmente hubiese tenido algun mecanismo que permita al administrador crear diferentes Factories en tiempo real
Pero no supe encararlo.

## 3. Comentarios de alternativas descartadas

- El builder de las prendas antes no enforzaba un orden de creacion, por lo que había que compensar eso con validaciones de nulls adicionales
