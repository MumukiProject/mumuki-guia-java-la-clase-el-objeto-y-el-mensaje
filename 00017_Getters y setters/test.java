@Test
public void si_anioEdicion_es_1999_getAnioEdicion_devuelve_1999() {
  Libro cuentosCompletos = new Libro();
  cuentosCompletos.anioEdicion = 1999;
  Assert.assertEquals(1999, pepita.getAnioEdicion());
}

@Test
public void setBienConservado_modifica_el_estado_de_conservacion() {
  Libro cuentosCompletos = new Libro();
  cuentosCompletos.setBienConservado(true);
  Assert.assertTrue(cuentosCompletos.bienConservado);
}