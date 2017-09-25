¡Develemos el misterio del `int` :open_mouth:! Java es un lenguaje con _tipado_... 

1. _estático_: **antes de ejecutar el programa**, necesita saber con exactitud el tipo de toda variable y expresión
2. _explícito_: debemos **indicar explícitamente** el tipo de cada variable

Los tipos más simples,  _tipos primitivos_ son: 

* los booleanos `boolean`
* los números enteros `byte`, `int` y `long`
* y los números con [coma flotante](https://es.wikipedia.org/wiki/Coma_flotante) `float` y `double`

¡Pero la cosa no termina acá! Si nuestros métodos toman parámetros, **también** debemos indicar su tipo :sweat_smile::

```java
void volarDurante(double cantidadHoras) {
  energia -= cantidadHoras * 310.5
}
```

> Veamos si se entiende: modificá tu código para que `comerAlpiste` tome la cantidad de alpiste (un `double`) que comerá la golondrina; cada gramo de alpiste le da 2 unidades de energía. 
