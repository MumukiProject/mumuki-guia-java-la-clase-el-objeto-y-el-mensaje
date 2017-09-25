¿Pero es una buena idea permitir que otros objetos conozcan y modifiquen todo el estado interno de nuestros objetos? :thought_balloon: 

¡No!

Si no tenemos cuidado y agregamos y usamos _getters_ y _setters_ en exceso, casi con seguridad incurriremos en problemas de encapsulamiento :weary:. Por ejemplo, si lo que queremos es poder reparar un libro, en lugar de definir `setBienConservado` sería una mucho mejor idea escribir un método `reparar`:  

```java
class Libro {
  int anioEdicion;
  boolean tieneColofon;
  boolean bienConservado;
  
  int getAnioEdicion() {
    return anioEdicion;
  }
  
  void reparar() {
    bienConservado = true;
  }
  
  boolean esIncunable() {
    return anioEdicion < 1500 || !tieneColofon;
  }
}
```

Así que ya sabés: ¡solo definí los getters y setters que realmente necesites! :sunglasses:

