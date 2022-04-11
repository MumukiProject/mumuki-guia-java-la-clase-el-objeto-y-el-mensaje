Ya vimos que podemos instanciar objetos y enviarles mensajes dentro de un `main`. Y también podemos hacerlo dentro de cualquier método (nada sorprendente, ¿eh? :stuck_out_tongue:). Por ejemplo:


```java
class Golondrina {
  int energia;
  Ciudad ubicacion; //atributo de tipo Ciudad
  
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

> Veamos si queda claro: agregá un método `distanciaA`, que tome una ciudad y retorne la distancia a la misma desde la `ubicacion` de la golondrina.
>
> ```java
> ム pepita.distanciaA(rosario);
> 400 // suponiendo que esté en Buenos Aires
> ```
>
> Asumí que las ciudades entienden un mensaje `distancia`, que podés usar: 
> 
> ```java
> ム buenosAires.distancia(rosario);  
> 400
> ```
