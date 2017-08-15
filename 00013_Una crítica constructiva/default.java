class Libro {
  boolean tieneColofon;
  int anioEdicion;
  boolean bienConservado;

  int getAnioEdicion() {
    return anioEdicion;
  }

  void reparar() {
    bienConservado = true;
  }

  boolean esIncunable() {
    return anioEdicion < 1500 || !tieneColofon;
  }
}