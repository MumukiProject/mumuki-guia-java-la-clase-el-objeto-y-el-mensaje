class Golondrina {
  int energia;
  
  void volarEnCirculos() {
    energia -= 100;
  }
  void comerAlpiste(double gramos) {
    energia += gramos * 2;
  }
}