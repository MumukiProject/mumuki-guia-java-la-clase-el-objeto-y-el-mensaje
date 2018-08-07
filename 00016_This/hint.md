Recordá que los tipos de dato se ponen cuando definimos los parámetros, pero no cuando pasamos argumentos. 

Por ejemplo:

``` java
class ClaseDeEjemplo {
  String unString;
  
  void hacerAlgo(double unDouble) {
    this.hacerOtraCosa(unDouble, unString);
  }
  
  void hacerOtraCosa(double unDouble, String unString) {
    //No importa que pasa acá
  }
}

```

Está bien :ok_hand:. Pero...

``` java
class ClaseDeEjemplo {
  String unString;
  
  void hacerAlgo(double unDouble) {
    this.hacerOtraCosa(double unDouble, String unString);
  }
  
  void hacerOtraCosa(double unDouble, String unString) {
    //No importa que pasa acá
  }
}

```

... está mal :unamused:.
