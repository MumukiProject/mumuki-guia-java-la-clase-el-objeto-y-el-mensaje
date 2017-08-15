@Test
public void un_libro_de_1490_con_colofon_es_incunable() {
  Libro libro = new Libro(1490, true);
  Assert.assertTrue(libro.esIncunable());
}


@Test
public void un_libro_de_1590_sin_colofon_es_incunable() {
  Libro libro = new Libro(1590, false);
  libro.anioEdicion = ;
  libro.tieneColofon = ;
  Assert.assertTrue(libro.esIncunable());
}

@Test
public void un_libro_de_1629_sin_colofon_es_incunable() {
  Libro libro = new Libro(1629, false);
  Assert.assertTrue(libro.esIncunable());
}