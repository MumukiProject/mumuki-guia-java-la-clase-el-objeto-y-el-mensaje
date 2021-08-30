@Test 
public void si_la_golondrina_tiene_30_de_energia_energiaUtil_reanimarConUnChocolate_no_la_modifica() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 30;
  golondrina.reanimarConUnChocolate();
  Assert.assertEquals(30, golondrina.energia);
}

@Test 
public void si_la_golondrina_tiene_5_de_energia_energiaUtil_reanimarConUnChocolate_sube_su_energia_a_45() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 5;
  golondrina.reanimarConUnChocolate();
  Assert.assertEquals(45, golondrina.energia);
}

@Test 
public void si_la_golondrina_tiene_6_de_energia_energiaUtil_reanimarConUnChocolate_sube_su_energia_a_46() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 6;
  golondrina.reanimarConUnChocolate();
  Assert.assertEquals(46, golondrina.energia);
}
