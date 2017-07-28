@Test
public void si_la_golondrina_vuela_en_circulos_y_tiene_200_de_energia_queda_en_100() {
  Golondrina g = new Golondrina();
  g.energia = 200;
  g.volarEnCirculos();
  Assert.assertEquals(100, g.energia);
}

@Test
public void si_la_golondrina_vuela_en_circulos_y_tiene_300_de_energia_queda_en_200() {
  Golondrina g = new Golondrina();
  g.energia = 300;
  g.volarEnCirculos();
  Assert.assertEquals(200, g.energia);
}

@Test
public void si_la_golondrina_come_alpiste_y_tiene_200_de_energia_queda_en_210() {
  Golondrina g = new Golondrina();
  g.energia = 200;
  g.volarEnCirculos();
  Assert.assertEquals(210, g.energia);
}

@Test
public void si_la_golondrina_come_alpiste_y_tiene_300_de_energia_queda_en_310() {
  Golondrina g = new Golondrina();
  g.energia = 300;
  g.volarEnCirculos();
  Assert.assertEquals(310, g.energia);
}