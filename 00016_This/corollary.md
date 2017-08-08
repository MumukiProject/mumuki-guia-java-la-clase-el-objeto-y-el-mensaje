Por si lo estás pensando: sí, _es lo mismo, pero con un sombrero nuevo_ :womans_hat:.

De hecho, al igual que en Ruby, `this` es una _pseudoreferencia_, que se puede pasar por parámetro...

```java
class Golondrina {
  void descansarEn(Nido nido) {
    //...
    nido.abrigar(this);
  }
}
```

...o incluso se puede omitir a la hora de enviar un mensaje: 

```java
class Golondrina {
  void volarEnCirculosSiPuede() {
    if (!estaCansada()) {
      volarEnCirculos();
    }
  }
}
```
