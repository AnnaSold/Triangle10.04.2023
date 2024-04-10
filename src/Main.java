import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    }
    public void readFile() throws FileNotFoundException {
        ArrayList<Triangle> triangles = new ArrayList<>();
        String filename = "INPUT.txt";
        Scanner scan = new Scanner(new File(filename));
        while(scan.hasNext()){
            double ab = scan.nextDouble();
            double bc = scan.nextDouble();
            double ac = scan.nextDouble();
            triangles.add(new Triangle(ab, bc, ac));
        }
        scan.close();
    }

}