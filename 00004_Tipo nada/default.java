class Golondrina {
  int energia;

  void volarEnCirculos() {
    energia -= 100;
  }
  
  boolean leQuedaEnergia() { 
    return energia > 0; 
  }
}