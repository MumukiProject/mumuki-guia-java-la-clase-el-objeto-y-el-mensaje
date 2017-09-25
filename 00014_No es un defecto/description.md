¿Te pusiste a pensar cuál es el valor inicial de la energía de una golondrina? Por ejemplo, si tenemos...

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

¡Y hay más! Si no nos sirve este valor por defecto, podemos explícitamente declarar el valor inicial del atributo...

```java
class Golondrina
  int energia = 100;
  // ...
}
```

...que por supuesto, tiene que ser del tipo adecuado :stuck_out_tongue:. 


> ¿Se entendió?  Comprobémoslo con este ejemplo:
>
> ```java
> class X { 
>   int a;
>   boolean b;
>   String c;
>   String d = "hola";
>}
> ```
> 
> Si hacemos `X x = new X()`, ¿cuánto valen los atributos del objeto `x` que acabamos de crear? 
> 
