package GerenciaRede;

class Parallelepiped implements IShape {
  double length, width, height;
  String nome = "Parallelepiped";
  
  Parallelepiped(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public double calculateArea() {
    return 2 * (length*width + width*height + length*height);
  }

  public double calculateVolume() {
    return length * width * height;
  }
  
  public String nome() { 
	  return nome;
  }
}
