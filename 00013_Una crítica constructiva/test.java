@Test
public void un_libro_de_1490_con_colofon_es_incunable() {
  Libro libro = new Libro(true, 1490);
  Assert.assertTrue(libro.esIncunable());
}


@Test
public void un_libro_de_1590_sin_colofon_es_incunable() {
  Libro libro = new Libro(false, 1590);
  libro.anioEdicion = ;
  libro.tieneColofon = ;
  Assert.assertTrue(libro.esIncunable());
}

@Test
public void un_libro_de_1629_sin_colofon_es_incunable() {
  Libro libro = new Libro();
  libro.anioEdicion = 1629;
  libro.tieneColofon = false;
  Assert.assertTrue(libro.esIncunable());
}