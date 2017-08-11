¿Te pusiste a pensar cual es el valor inicial de la energía de una golondrina? Por ejemplo, si tenemos...

```java
class Golondrina
  int energia;
  int getEnergia() { 
    return energia;
  }
}
```

...¿cuál es el resultado de la expresión `new Golondrina().getEnergia()`? ¿`0`, `null` u otra cosa? En otras palabras, ¿cuál es el _valor por defecto_ del atributo `energia`?

En Ruby la cosa era fácil: todo atributo por defecto vale `nil`. En Java, en cambio, tenemos más reglas: 

 * los atributos de tipo objeto por defecto valen `null`;
 * los atributos de tipo primitivo por defecto valen: 
    * `0` si es numérico (`int`, `long`, `double`, etc)
    * `false` si es `boolean`

> ¿Se entendió? 
>
> 