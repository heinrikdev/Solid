package GerenciaRede;

interface IShape {
  double calculateArea();
  double calculateVolume();
  String nome();
}

class ShapeCalculator {
  IShape shape;

  ShapeCalculator(IShape shape) {
    this.shape = shape;
  }


  double calculateArea() {
    return shape.calculateArea();
  }

  double calculateVolume() {
    return shape.calculateVolume();
  }
  
  String Nome() {
	 return shape.nome();
  }
  
  void print()  {
	  System.out.println("Nome da figura: " + shape.nome());
	  System.out.println("Area: " + shape.calculateArea());
	  System.out.println("Volume: " + shape.calculateVolume());
	  System.out.println("\n");
  }
  
}
