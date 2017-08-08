class Libro {
  boolean tieneColofon;
  int anioEdicion;
  boolean bienConservado;
  
  // completar acá...
  
  boolean esIncunable() {
    return anioEdicion < 1500 || !tieneColofon;
  }
}