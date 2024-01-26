package GerenciaRede;

public class Main {
  public static void main(String[] args) {
	  	  
    Sphere sphere = new Sphere(5);
    ShapeCalculator shapeCalculator = new ShapeCalculator(sphere);
    shapeCalculator.print();
        
    Cube cube = new Cube(2); 
    ShapeCalculator shapeCalculatorCube = new ShapeCalculator(cube); 
    shapeCalculatorCube.print();
    
    Parallelepiped parallelepiped = new Parallelepiped(4, 8, 1);
    ShapeCalculator shapeCalculatorParallelepiped = new ShapeCalculator(parallelepiped);
    shapeCalculatorParallelepiped.print();
    
  }
}