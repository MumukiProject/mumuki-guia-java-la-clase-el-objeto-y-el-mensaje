Por si no te habías cansado de ponerle tipo a atributos, variables locales y parámetros, si el método retorna algo, ¡también hay que tiparlo!

```java
class Golondrina {
  int energia;
  
  // devuelve un booleano
  boolean leQuedaEnegia() { 
    return energia > 0; 
  }
}
```

¿Y si el método no devuelve nada? ¡Acá es donde entra `void`!

```java
class Golondrina {
  int energia;
  
  // void es el tipo de retorno para los métodos que no devuelven nada
  void volarEnCirculos() {
    energia -= 100;
  }
}
```



