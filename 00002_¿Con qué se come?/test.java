@Test
public void si_la_golondrina_vuela_en_circulos_y_tiene_200_de_energia_queda_en_100() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 200;
  golondrina.volarEnCirculos();
  Assert.assertEquals(100, golondrina.energia);
}

@Test
public void si_la_golondrina_vuela_en_circulos_y_tiene_300_de_energia_queda_en_200() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 300;
  golondrina.volarEnCirculos();
  Assert.assertEquals(200, golondrina.energia);
}

@Test
public void si_la_golondrina_come_alpiste_y_tiene_200_de_energia_queda_en_210() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 200;
  golondrina.comerAlpiste();
  Assert.assertEquals(210, golondrina.energia);
}

@Test
public void si_la_golondrina_come_alpiste_y_tiene_300_de_energia_queda_en_310() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 300;
  golondrina.comerAlpiste();
  Assert.assertEquals(310, golondrina.energia);
}