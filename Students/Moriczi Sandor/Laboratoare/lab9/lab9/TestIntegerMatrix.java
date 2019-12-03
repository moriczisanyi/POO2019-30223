package lab9;

public class TestIntegerMatrix {
 public static void main(String[] args) {
 // Creaza tablourile de intregi m1, m2
 Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
 Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};
 Double[][] m1d = new Double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {1.0, 1.0, 1.0}};
 Double[][] m2d = new Double[][]{{1.0, 1.1, 1.1}, {2.0, 2.0, 2.0}, {0.0, 0.0, 0.0}};
 // Creaza o instanta de IntegerMatrix
 IntegerMatrix integerMatrix = new IntegerMatrix();
 DoubleMatrix doubleMatrix = new DoubleMatrix();
 
 System.out.println("\nm1 + m2 is ");
 GenericMatrix.printResult(
 m1, m2, integerMatrix.addMatrix(m1, m2), '+');
 System.out.println("\nm1 * m2 is ");
 GenericMatrix.printResult(
 m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');
 
 System.out.println("\nm1d + m2d is ");
 GenericMatrix.printResult(
 m1d, m2d, doubleMatrix.addMatrix(m1d, m2d), '+');
 System.out.println("\nm1d * m2d is ");
 GenericMatrix.printResult(
 m1d, m2d, doubleMatrix.multiplyMatrix(m1d, m2d), '*');
 }
}