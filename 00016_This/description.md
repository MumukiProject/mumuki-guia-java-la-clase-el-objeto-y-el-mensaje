¿Y si queremos que un objeto se envíe a sí mismo? ¡Simple! Tal como en Ruby teníamos `self`, acá tenemos `this`: 

```java
class Golondrina {
  int energia; 
  boolean estaCansada() {
    return energia < 13;
  }
  void volarEnCirculosSiPuede() {
    if (!this.estaCansada()) {
      this.volarEnCirculos();
    }
  }
}
```