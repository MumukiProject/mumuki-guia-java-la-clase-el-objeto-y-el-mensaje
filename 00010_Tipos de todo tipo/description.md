:hand: _Hagamos un alto en el camino para hablar más sobre tipos._

Si lo comparamos con Ruby, Java es un lenguaje orientado a objetos _híbrido_: **no todos los tipos son objetos**. En concreto:

  * **Los tipos primitivos** (`int`,`boolean`, etc) no son objetos. No podemos enviarle mensajes, sino sólo usarlos con operadores predefinidos, como el `+`, `!`, etc.  
  * **Los tipos objeto** (`Golondrina`, `Libro`, etc), somo su nombre lo indica, sí lo son. En esta categoría entran todos los tipos que desarrollemos, además de varios que vienen con el lenguaje.
  
La buena noticia es que son fáciles de diferenciar: los primitivos se escriben en `minuscula`, mientras que los objetos se escriben en `CamelCaseMayuscula`. 

> Hay algunos tipos muy simples que no mencionamos hasta ahora: 
> 
>  * `String`: textos como `"PorSuiGieco"` y `"Serú Girán"`
>  * `char`: caracteres como `'a'` y `'R'`
>  * `LocalDate`: fechas como `LocalDate.of(1967, 7, 3)`  (3 de Julio de 1967)
> 
> ¿Cuáles de estos tipos son primitivos?


