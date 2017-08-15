@Test
public void se_puede_crear_a_alejandra_y_enviarle_getCantidadLibrosRevisados() {
  Bibliotecario alejandra = new Bibliotecario(1200);
  Assert.assertEquals("La cantidad inicial de libros revisados de alejandra es 1200", alejandra.getCantidadLibrosRevisados());
}

@Test
public void se_puede_crear_a_una_bibliotecaria_con_200_libros_revisados_y_enviarle_getCantidadLibrosRevisados() {
  Bibliotecario maria = new Bibliotecario(200);
  Assert.assertEquals("La cantidad inicial de libros revisados de maria es 200", maria.getCantidadLibrosRevisados());
}

@Test
public void un_libro_de_1490_con_colofon_es_incunable() {
  Libro libro = new Libro(1490, true);
  Assert.assertTrue(libro.esIncunable());
}

@Test
public void un_libro_de_1590_sin_colofon_es_incunable() {
  Libro libro = new Libro(1590, false);
  Assert.assertTrue(libro.esIncunable());
}

@Test
public void un_libro_de_1629_sin_colofon_es_incunable() {
  Libro libro = new Libro(1629, false);
  Assert.assertTrue(libro.esIncunable());
}TODO@Test
public void un_libro_de_1490_con_colofon_es_incunable() {
  Libro libro = new Libro(1490, true);
  Assert.assertTrue(libro.esIncunable());
}

@Test
public void un_libro_de_1590_sin_colofon_es_incunable() {
  Libro libro = new Libro(1590, false);
  Assert.assertTrue(libro.esIncunable());
}

@Test
public void un_libro_de_1629_sin_colofon_es_incunable() {
  Libro libro = new Libro(1629, false);
  Assert.assertTrue(libro.esIncunable());
}