Ya vimos que podemos instanciar objetos y enviarles mensajes dentro de un `main`. Pero eso no es todo, ¡podemos hacerlo dentro de cualquier método! (nada sorprendete, ¿eh? :stuck_out_tongue:). Por ejemplo:


```java
class Golondrinda {
  int energia;
  Ciudad ubicacion;
  
  //podemos enviarle mensajes a parámetros...
  void comer(AlimentoBalanceado alimento) {
    energia += alimento.aporteEnergetico();
  }
  
  //y también a atributos...
  double estaEnUnPuerto() {
    return ubicacion.esPuerto();
  }
}
```

> Veamos si queda claro: agregá un método `distanciaA`, que tome una ciudad y retorne la distancia a la misma desde la `ubicacion` de la golondrina. Asumí que las ciudades entienden un mensaje `distancia`: 
> 
> ```java
> ム buenosAires.distancia(rosario)  
> 400
> ```
