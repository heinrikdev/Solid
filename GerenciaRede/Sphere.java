package GerenciaRede;

class Sphere implements IShape {
  double radius;
  String nome = "Sphere";

  Sphere(double radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    return 4 * Math.PI * Math.pow(radius, 2);
  }

  public double calculateVolume() {
    return (4/3) * Math.PI * Math.pow(radius, 3);
  }
  
  public String nome() { 
	  return nome;
  }
}