@Test
public void se_puede_ejecutar_el_programa() {
  PruebaSupermercado.main(new String[]{});
}

@Test
public void reiniciar_vuelve_a_cero_la_cantidadDeClientes() {
  Supermercado superJimenez = new Supermercado();
  
  superJimenez.registrarVenta(21);
  superJimenez.registrarVenta(30);
  
  superJimenez.reiniciar();

  Assert.assertEquals(0, superJimenez.cantidadDeClientes());
}

@Test
public void registrarVenta_aumenta_la_cantidadDeClientes() {
  Supermercado superJimenez = new Supermercado();
  
  superJimenez.registrarVenta(21);
  superJimenez.registrarVenta(30);
  
  Assert.assertEquals(2, superJimenez.cantidadDeClientes());
}