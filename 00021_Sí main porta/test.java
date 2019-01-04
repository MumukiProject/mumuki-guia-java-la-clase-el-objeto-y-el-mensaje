@Test
public void al_ejecutar_el_programa_el_volumen_esta_en_100() {
  Fiesta.main(new String[]{});
  Assert.assertEquals("El volumen debe ser 100 al ejecutar el programa", 100, fiesta.volumen);
  
}

@Test
public void al_ejecutar_el_programa_las_puertas_estan_abiertas() {
  Fiesta.main(new String[]{});
  Assert.assertTrue("Las puertas deben abrirse la ejecutar el programa", puertasAbiertas);
}