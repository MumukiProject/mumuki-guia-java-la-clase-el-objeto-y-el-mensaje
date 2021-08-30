@Test
public void si_le_quedan_horas_a_alejandra_y_revisa_un_incunable_lo_repara() {
  Libro libro = new Libro(1490, true);

  Bibliotecario alejandra = new Bibliotecario(1200);
  alejandra.revisar(libro);
  
  Assert.assertTrue("Tras revisar un incunable, éste debería estar bienConservado", libro.bienConservado);
}

@Test
public void si_alejandra_revisa_tres_incunables_mal_conservados_no_repara_al_tercero() {
  Libro libro1 = new Libro(1490, true);
  Libro libro2 = new Libro(1490, true);
  Libro libro3 = new Libro(1490, true);
  
  Bibliotecario alejandra = new Bibliotecario(1200);
  alejandra.revisar(libro1);
  alejandra.revisar(libro2);
  alejandra.revisar(libro3);
  
  Assert.assertTrue("El primer libro debería quedar bien conservado", libro1.bienConservado);
  Assert.assertTrue("El segundo libro debería quedar bien conservado", libro2.bienConservado);
  Assert.assertFalse("El tercer libro no debería quedar bien conservado", libro3.bienConservado);
}


@Test
public void si_le_quedan_horas_a_alejandra_y_revisa_un_libro_comun_no_lo_repara() {
  Libro libro = new Libro(1849, true);

  Bibliotecario alejandra = new Bibliotecario(1200);
  alejandra.revisar(libro);
  
  Assert.assertFalse("Tras revisar un comun mal conservado, éste NO debería estar bienConservado", libro.bienConservado);
}

@Test
public void se_puede_crear_a_alejandra_y_enviarle_getCantidadLibrosRevisados() {
  Bibliotecario alejandra = new Bibliotecario(1200);
  Assert.assertEquals("La cantidad inicial de libros revisados de alejandra es 1200", 1200, alejandra.getCantidadLibrosRevisados());
}

@Test
public void se_puede_crear_a_una_bibliotecaria_con_200_libros_revisados_y_enviarle_getCantidadLibrosRevisados() {
  Bibliotecario maria = new Bibliotecario(200);
  Assert.assertEquals("La cantidad inicial de libros revisados de maria es 200", 200, maria.getCantidadLibrosRevisados());
}

@Test
public void se_puede_crear_a_una_bibliotecaria_con_200_libros_revisados_y_que_revise_cinco_mas() {
  Libro libro = new Libro(1490, true);
  
  Bibliotecario maria = new Bibliotecario(200);
  
  maria.revisar(libro);
  maria.revisar(libro);
  maria.revisar(libro);
  maria.revisar(libro);
  maria.revisar(libro);
  
  Assert.assertEquals("La cantidad total de libros revisados de maria es 205", 205, maria.getCantidadLibrosRevisados());
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
}