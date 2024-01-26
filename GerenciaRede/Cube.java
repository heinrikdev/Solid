package GerenciaRede;

class Cube implements IShape {
  double side;
  String nome = "Cube";

  Cube(double side) {
    this.side = side;
  }

  public double calculateArea() {
    return 6 * Math.pow(side, 2);
  }

  public double calculateVolume() {
    return Math.pow(side, 3);
  }
  
  public String nome() { 
	  return nome;
  }
}
