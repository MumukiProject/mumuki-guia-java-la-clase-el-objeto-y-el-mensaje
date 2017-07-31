class PruebaSupermercado {
  static void main(String[] args) {
    Supermercado superJimenez = new Supermercado();
    
    superJimenez.registrarVenta(21);
    superJimenez.registrarVenta(90);
    superJimenez.registrarVenta(30);
    superJimenez.cantidadDeClientes(); // => 3
    superJimenez.gastoPromedio();  // => 47
    superJimenez.reiniciar();

    superJimenez.registrarVenta(24);
    superJimenez.cantidadDeClientes(); // => 1
    superJimenez.gastoPromedio(); // => 24
  }
}