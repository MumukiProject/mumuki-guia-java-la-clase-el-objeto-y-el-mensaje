:thought_balloon: ¿Te preguntaste que sucede si definís la clase `Supermercado` antes de `PruebaSupermercado`? 

```java
class Supermercado {
  //..etc...
}

class PruebaSupermercado {
  //..etc...
}
```

¿Y si lo hacés al revés? 


```java
class PruebaSupermercado {
  //..etc...
}

class Supermercado {
  //..etc...
}
```

¡Da lo mismo! **En este sentido**, Java es un lenguaje declarativo: a diferencia de Ruby o JavaScript, Java no va a ejecutar todo el código directamente, sino que la cosa es un poco más compleja :scream:. Hagamos un alto en el camino para entender ésto...

