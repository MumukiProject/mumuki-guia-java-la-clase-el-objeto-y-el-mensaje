class Libro {
  int anioEdicion;
  boolean tieneColofon;
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