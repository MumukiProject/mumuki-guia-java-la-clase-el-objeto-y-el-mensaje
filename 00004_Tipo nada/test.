@Test 
public void si_la_golondrina_tiene_30_de_energia_energiaUtil_devuelve_20() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 30;
  Assert.assertEquals(20, golondrina.energiaUtil());
}

@Test 
public void energiaUtil_no_modifica_la_energia_de_la_glondrina() {
  Golondrina golondrina = new Golondrina();
  golondrina.energia = 30;
  golondrina.energiaUtil();
  Assert.assertEquals("la energía no debería haber cambiado", golondrina.energia, 30);
}