Los valores por defecto son útiles, pero no siempre son lo que necesitamos. Por ejemplo, nos gustaría poder crear nuestras golondrinas con energías iniciales **diferentes**:

```java
Golondrina pepita = new Golondrina(250);
Golondrina anastasia = new Golondrina(180);
```

¿Podemos hacer ésto? 

¡Por supuesto! Al igual que en Ruby, tenemos _constructores_, sólo que acá tienen una sintaxis especial...:

```java
class Golondrina {
  int energia;
  Golondrina(int energiaInicial) {
    energia = energiaInicial;
  }
  //...
}
```

..., que se parece a un método pero no lo es: notá que el constructor siempre se llama igual que la clase y no tiene retorno. 

> 