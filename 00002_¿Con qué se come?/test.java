@Test
public void si_la_golondrina_vuela_en_circulos_y_tiene_200_de_energia_queda_en_100() {
  Golondrina g = new Golondrina();
  g.energia = 200;
  g.volarEnCirculos();
  assertEquals(100);
}

@Test
public void si_la_golondrina_vuela_en_circulos_y_tiene_300_de_energia_queda_en_200() {
  Golondrina g = new Golondrina();
  g.energia = 300;
  g.volarEnCirculos();
  assertEquals(200);
}

@Test
public void si_la_golondrina_come_alpiste_y_tiene_200_de_energia_queda_en_210() {
  Golondrina g = new Golondrina();
  g.energia = 200;
  g.volarEnCirculos();
  assertEquals(210);
}

@Test
public void si_la_golondrina_come_alpiste_y_tiene_300_de_energia_queda_en_310() {
  Golondrina g = new Golondrina();
  g.energia = 300;
  g.volarEnCirculos();
  assertEquals(310);
}