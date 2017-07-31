class Golondrina {
  int energia;

  void volarEnCirculos() {
    energia -= 100;
  }
  
  boolean leQuedaEnegia() { 
    return energia > 0; 
  }
}