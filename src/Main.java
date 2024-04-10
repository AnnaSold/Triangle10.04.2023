import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    ArrayList<Triangle> triangles = readFile();
    calculateAllArea(triangles);

    }
    public static ArrayList<Triangle> readFile() throws FileNotFoundException {
        ArrayList<Triangle> triangles = new ArrayList<>();
        String filename = "INPUT1.txt";
        Scanner scan = new Scanner(new File(filename));
        while (scan.hasNext()) {
            double ab = scan.nextDouble();
            double bc = scan.nextDouble();
            double ac = scan.nextDouble();
            if (Triangle.compareStoronTriangle(ab, bc, ac) == true) {
                triangles.add(new Triangle(ab, bc, ac));}
                 else continue;

        }
        scan.close();
            System.out.println(triangles);
        return triangles;
    }
    public static double calculateAllArea(ArrayList<Triangle> triangles){
        double summa = 0;
        for(Triangle t : triangles){
            double s = this.calculateAreaFigure();
            summa += s;
        }
        return summa;
    }}