@Test
public void un_libro_de_1490_con_colofon_es_incunable() {
  Libro libro = new Libro();
  libro.anioEdicion = 1490;
  libro.tieneColofon = true;
  Assert.assertTrue(libro.esIncunable());
}


@Test
public void un_libro_de_1590_sin_colofon_es_incunable() {
  Libro libro = new Libro();
  libro.anioEdicion = 1590;
  libro.tieneColofon = false;
  Assert.assertTrue(libro.esIncunable());
}

@Test
public void un_libro_de_1629_sin_colofon_es_incunable() {
  Libro libro = new Libro();
  libro.anioEdicion = 1629;
  libro.tieneColofon = false;
  Assert.assertTrue(libro.esIncunable());
}