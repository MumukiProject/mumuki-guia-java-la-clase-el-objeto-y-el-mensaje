class Golondrina {
  int energia; 
  void comerAlpiste(double gramos) {
    energia += gramos * 2;
  }
  void comerChocolate(double gramos) {
    energia += gramos * 9;
  }
  void comerSesamo(double gramos) {
    energia += gramos * 1.5;
  }
}