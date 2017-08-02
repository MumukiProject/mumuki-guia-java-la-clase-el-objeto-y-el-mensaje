Ciudad buenosAires = new Ciudad();
Ciudad rosario = new Ciudad();

@Test
public void si_esta_en_rosario_la_distancia_a_buenos_aires_es_400() {
  Golondrina pepita = new Golondrina();
  pepita.ubicacion = buenosAires;
  Assert.assertEquals(400, pepita.distanciaA(rosario));
}

@Test
public void si_esta_en_buenosAires_la_distancia_a_rosario_es_400() {
  Golondrina pepita = new Golondrina();
  pepita.ubicacion = rosario;
  Assert.assertEquals(400, pepita.distanciaA(buenosAires));
}