@Test 
public void si_la_golondrina_tiene_30_de_energia_energiaUtil_devuelve_20() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 30;
  Assert.assertEquals(golondrina.energiaUtil(), 20);
}

@Test 
public void energiaUtil_no_modifica_la_energia_de_la_glondrina() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 30;
  golondrina.energiaUtil()
  Assert.assertEquals("la energía no debería haber cambiado", golondrina.energia, 30);
}

@Test 
public void si_la_golondrina_tiene_30_de_energia_energiaUtil_reanimarConUnChocolate_no_la_modifica() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 30;
  golondrina.reanimarConUnChocolate();
  Assert.assertEquals(golondrina.energiaUtil(), 30);
}

@Test 
public void si_la_golondrina_tiene_5_de_energia_energiaUtil_reanimarConUnChocolate_sube_su_energia_a_45() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 5;
  golondrina.reanimarConUnChocolate();
  Assert.assertEquals(golondrina.energiaUtil(), 45);
}

@Test 
public void si_la_golondrina_tiene_6_de_energia_energiaUtil_reanimarConUnChocolate_sube_su_energia_a_46() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 6;
  golondrina.reanimarConUnChocolate();
  Assert.assertEquals(golondrina.energiaUtil(), 46);
}
