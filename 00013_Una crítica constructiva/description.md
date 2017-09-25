Los valores por defecto son útiles, pero no siempre son lo que necesitamos. Por ejemplo, nos gustaría poder crear nuestras golondrinas con energías iniciales **diferentes**:

```java
Golondrina pepita = new Golondrina(250);
Golondrina anastasia = new Golondrina(180);
```

¿Podemos hacer esto? ¡Por supuesto! Al igual que en Ruby, tenemos _constructores_, solo que acá tienen una sintaxis especial...

```java
class Golondrina {
  int energia;
  Golondrina(int energia) {
    this.energia = energia;
  }
  //...
}
```

... que se parece a un método pero no lo es: notá que el constructor siempre se llama igual que la clase y no tiene retorno. 

> Veamos si se entiende: agregá a la clase `Libro` un constructor que permita inicializar (sólamente) `anioEdicion` y `tieneColofon`: `new Libro(1590, false)`;
> Tené en cuenta que los libros que la bibliotecaria Alejandra maneja siempre le llegan en mal estado. 

