¿Y si queremos conocer el estado de un objeto? Por ejemplo, ¿cómo podriamos hacer para, desde otro objeto, conocer la energía de  _pepita_?

Como siempre, mediante mensajes :wink:. En este caso, necesitaremos declarar un método que devuelva la `energia` de la golondrina:

```java
class Golondrina {
  int energia;
  
  // notá que el mensaje se llama getEnergia y
  // no simplemente energia
  int getEnergia() {
    return energia;
  }
}
```

Pero, ¿por qué prefijamos a nombre del método con `get`? En Java existe la convención de nombrar de esta forma a los métodos **sin parámatetros** que **devuelvan un atributo**.

Y, hablando de convenciones, también contamos con una para los métodos que toman **un sólo parámetro** y asignan un atributo:


```java
class Golondrina {
  int energia;
  
  // notá que empieza con set, toma un parámetro y
  // su tipo de retorno es void
  void setEnergia(int nuevaEnergia) {
    energia = nuevaEnergia;
  }
}
```

> Tu turno: agregá a la clase Libro el _getter_ `getAnioEdicion` y el _setter_ `setBienConservado`. 

