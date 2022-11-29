En este ejercicio vas a necesitar la vieja y conocida alternativa condicional: un `if`. La sintaxis es muy simple y similar a la de JavaScript <i class="da da-javascript"></i> y Gobstones <i class="da da-gobstones"></i>: 

```java
if (...condicion...) {
  ...hacerAlgo...
} else {
  ...hacerOtraCosa...
}
```

Por ejemplo: 

```java
if (aniosEnServicio > 20) {
  activo = false;
} else {
  aniosEnServicio += 1;
}
```
>  Como dijimos, las golondrinas necesitan 10 unidades de energía. Definí el método `reanimarConUnChocolate`, que le aporta 40 unidades de energía, pero sólo si tiene menos de `10` :chocolate_bar:.