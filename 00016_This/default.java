class Golondrina {
  int energia; 
  boolean estaCansada() {
    return energia < 13;
  }
  void volarEnCirculosSiPuede() {
    if (!this.estaCansada()) {
      this.volarEnCirculos();
    }
  }
}