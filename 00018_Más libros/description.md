¡Estamos llegando al final de nuestra primera lección! Así que es hora de un desafío final: modelar una clase `Bibliotecario`. Sabemos que...

* cada mes, los bibliotecarios revisan muchísimos libros :books:;
* tienen 20 horas asignadas a la reperación de incunables (sólo reparan mientras no excedan esa cantidad de horas) :alarm_clock:;
* reparar cada incunable les toma 10 horas :hourglass_flowing_sand:.

...y nos gustaría poder simular su trabajo de la siguiente forma: 

```java
// alejandra es una bibliotecaria que ua revisó 1200 libros
Bibliotecario alejandra = new Bibliotecario(1200);

alejandra.revisar(unLibroIncunableMalConservado); 
// revisa un incunable, y como está mal conservado y aún tiene 20 horas, lo repara 

alejandra.revisar(unLibroIncunableBienConservado);
// revisa un incunable, pero no lo repera porque está en condiciones

alejandra.revisar(unLibroComun);
// revisa un libro, pero no lo repara porque no es incunable

alejandra.revisar(unLibroIncunableMalConservado);
// revisa un incunable, y como está mal conservado y aún tiene 10 horas, lo repara 

alejandra.revisar(unLibroIncunableMalConservado);
// revisa un incunable, y aunque está mal conservado, no lo repeara porque se quedó sin horas

alejandra.getCantidadLibrosRevisados(); 
// devuelve 1205, porque a los 1200 que ya había revisado, 
// se suman los 5 que acaba de revisar

alejandra.pasarMes();
// reinicia la cantidad de horas a 20. 
```

> Desarrollá la clase `Bibliotecario`. Podés agregar métodos a la clase `Libro`.

