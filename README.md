# TP 1
## Chinpokomon

### Configuracion de entorno
#### 1: git clone {url repositorio}
#### 2: file > project structure > Project SDK = Java 11 (O la que tengas instalada en tu pc) Project lenguaje level = 11 (O alguna inferior a la SDK que hayas elejido)
#### 3: Dentro dl archivo main.java ejecutarlo y ver que compile y devuelva el resultado por consola

### Enunciado:

Queremos diseñar un videojuego de "Chinpokomon", donde diversas criaturas se
enfrentan entre sí en feroces batallas.

Cada chinpokomon tiene un nombre, un nivel de vida (un número) y una serie de
ataques que sabe infligir contra su rival. Cuando ponemos un chinpokomon a
pelear contra otro, estos se atacan entre sí, por turnos, atacando una vez cada
uno. Para atacar utilizarán uno de los araques que tiene disponibles de forma
aleatoria.

El que lleva primero la vida de su rival a cero es el vencedor.

Queremos modelar 3 chinpokomons y sus ataques:

* Carnotron (tiene 20 de vida, dos ataques, "rayo veloz" que inflige 3 puntos de
  daño, y "cañón sónico" que infringe 4 de daño)
* Gallotronix (tiene 25 de vida y un ataque "garra mecánica", que hace 2 de
  daño)
* Zapato (tiene 30 de vida y un ataque "zapatazo" que realiza 1 punto de daño)

##### Punto 1:
En nuestra primera implementación queremos crear la clase `Chinpokomon`, crear
los chinpokomons mencionados en un main, y poner a pelear a "Carnotron" contra
"Zapato". Para pelear, se pide considere que haya alguna entidad encargada de
gestionar las batallas, cuyo comportamiento sea hacer que ambos peleen y que
devuelva el ganador. El objetivo entonces es en un main poder hacer batallar dos
e imprimir el nombre del ganador.

##### Punto 2:
Queremos poder loggear la información de la batalla (ej. que vida tiene cada uno
a un momento, quien atacó a quien, cuanto daño le hizo, etc.). Para ello vamos a
crear un logger. Un logger tiene que poder ser instanciado con un "nivel"
específico, que puede ser DEBUG, INFO, WARN o ERROR, y se debe poder cambiar su
nivel en runtime con `setLevel`. Si se configura en nivel "DEBUG", entonces
todos los mensajes se imprimen siempre, si se configura como "INFO" se imprimen
todos los mensajes que no sean debug, si es "WARN", todos menos debug e info, y
si es "ERROR" entonces solo los mensajes de error. Así, el logger debe entender
los mensajes `debug`, `info`, `warn` y `error` que esperan un string, e imprimen
el mismo en pantalla si el nivel del logger coincide con el mensaje o es uno
inferior. Por ej. si se llama a `info` en un logger con nivel "DEBUG" se debe
imprimir el mensaje en pantalla, pero si el nivel es "WARN" entonces no se
imprime nada.

El logger debe ser siempre el mismo, y debe poder accederse desde distintos
lugares del código.

##### Punto 3:
Ahora, algunos ataques son más veloces que otros. Por ejemplo, "zapatazo" tiene
un 50% de probabilidades de golpear al enemigo 2 veces (y no solo una) en cada
ataque que realiza. Por su lado, "garra mecánica" debería propinar un golpe
crítico con un 10% de probabilidad, sacando al enemigo la mitad de la vida que
le queda disponible.

Modifique el código para que estos ataques tengan dicho comportamiento.

##### Punto 4:
Queremos crear 2 zapatos, y hacerlos pelear. El primer Zapato solo conoce
"zapatazo", como se mencionó antes, pero el segundo conoce "zapatazo" y "Pomada
Wassington", un ataque que le recupera 5 puntos de vida a sí mismo, en lugar de
dañar al oponente.

##### Punto 5:
Los chinpokomon pueden categorizarse segun su naturaleza. Hay chinpokomon que
son Animales, otros que son Robots, y otros que son Cosas. La naturaleza de un
chinpokomon es de vital importancia en la batalla, ya que algunas naturalezas
tienen ventaja contra otra. Por ejemplo, los chinpokomon con naturaleza Robot
tienen ventaja contra los chinpokomon Animales. Cuando un chinpokomon tiene
ventaja contra otro, sus ataques son más efectivos, inflingiendo más puntos de
daño que los que haría en caso de no tener ventaja. Cada ataque tiene entonces
un "booster por ventaja", que se aplica para los golpes normales (ej. no
critico) que se realizan cuando hay ventaja:

* Rayo velóz y Cañon Sónico hacen un punto más de daño
* Garra Mecánica hace 2 puntos más de daño
* Zapatazo hace 3 puntos más de daño
* Pomada Wassinton recupera 1 punto más de vida.

Agregue esta funcionalidad al problema teniendo en cuenta los siguientes
esquemas de ventaja y desventaja:

* Robot tiene ventaja contra Animal
* Animal tiene ventaja contra Cosa
* Cosa tiene ventaja contra Robot

