class Mumukibot {
  int aniosEnServicio;
  boolean activo = true;
  
  void hacerRevisionAnual() {
    if (aniosEnServicio > 20) {
      activo = false;
    } else {
      aniosEnServicio++;
    }
  }
}