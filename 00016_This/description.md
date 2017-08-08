¿Y si queremos que un objeto se envíe un mensaje sí mismo? ¡Simple! Tal como en Ruby teníamos `self`, acá tenemos `this`: 

```java
class Golondrina {
  int energia; 
  boolean estaCansada() {
    return energia < 13;
  }
  void volarEnCirculos() {
    energia -= 100;
  }
  void volarEnCirculosSiPuede() {
    if (!this.estaCansada()) {
      this.volarEnCirculos();
    }
  }
}
```

> Veamos si se entiende: el código en el editor repite siempre la misma lógica de incrementar (buuu :rage:). Pero podrías evitarla con la ayuda de un nuevo método `alimentarseCon`, que tome una cantidad de gramos y la cantidad de energía por gramo.
> 
> ¡Animate a mejorar la solución!     

