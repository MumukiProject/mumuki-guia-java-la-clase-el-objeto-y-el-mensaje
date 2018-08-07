Por si no te habías cansado de ponerle tipo a atributos, variables locales y parámetros, si el método retorna algo, ¡también hay que tiparlo! :sweat_smile:

```java
class Golondrina {
  int energia;
  
  // devuelve un booleano
  boolean leQuedaEnergia() { 
    return energia > 0; 
  }
}
```

¿Y si el método no devuelve nada? Acá es donde entra `void`:

```java
class Golondrina {
  int energia;
  
  // void es el tipo de retorno para los métodos que no devuelven nada
  void volarEnCirculos() {
    energia -= 100;
  }
}
```

`void` es un tipo muy especial que se usa solamente en **retornos de métodos** que no devuelven nada.



> ¡A ver si se va entendiendo! Las golondrinas en realidad necesitan al menos 10 unidades de energía para sobrevivir; sabiendo esto, agregá el método `energiaUtil`, que devuelva cuánta energía útil le queda (es decir, su `energia` menos `10`).
