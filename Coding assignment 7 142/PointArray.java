import java.io.FileInputStream;
import java.io.IOException;

/* This is the the class that does all the input for different points
 * using arrays, checks collinear, sorts them and compares the points within the arrays.
 */

public class PointArray {
    // data field
    private Point points[];
        
    // Constructor 1 assigns x and y values and identifies points within the arrays
    public PointArray(double arr[]){
        points = new Point[arr.length / 2];

        int i = 0;
        int j = 0;
        while(i < arr.length)
        {
            points[j] = new Point(arr[i], arr[i + 1]);
            // arr[i] = x, arr[i + 1] = y
            
            System.out.println("x: " + arr[i] + " y: " + arr[i+1]);
            i += 2;
            j++;
        }
    }

    // constructor 2 read from the file, the given points.
    public PointArray(FileInputStream fis) throws IOException{
        byte b1[] = new byte[fis.available()];
        fis.read(b1, 0, b1.length);

        char ch = (char) b1[0];
        int size = Integer.parseInt("" + ch);

        String lines[] = new String[size];
        for(int i = 0; i < lines.length; i++){
            lines[i] = "";
        }

        int k = 0;
        int count = 0;
        for(int i = 3; i < b1.length; i++){
            if(b1[i] == '\n'){
                count++;

                if(count == 1){
                    k++;
                }
            }
            else {
                lines[k] += (char) b1[i];
                count = 0;
            }
        }

        points = new Point[size];
        int j = 0;

        for(int i = 0; i < lines.length; i++)
        {
            String line = lines[i];
            String tokens[] = line.split(" ");

            double x_coord = Double.parseDouble(tokens[0]);
            double y_coord = Double.parseDouble(tokens[1]);
            points[j] = new Point(x_coord, y_coord);
            j++;
        }

        fis.close();
    }

    // Contains3collinear method that compares slopes.
    public boolean contains3collinear()
    {
        if(points[0].slopeTo(points[1]) == points[1].slopeTo(points[2])){
            return true;
        }
        else {
            return false;
        }
    }

    // Sort method that sorts using x and y (x + 1) values.
    public void sort()
    {
        for(int i = 0; i < points.length - 1; i++)
        {
            int minIndex = i;

            for(int j = i + 1; j < points.length; j++)
            {
                if(points[j].lessThan(points[minIndex])){
                    minIndex = j;
                }
            }

            if(minIndex != i)
            {
                Point temp = points[i];
                points[i] = points[minIndex];
                points[minIndex] = temp;
            }
        }
    }

    // Equals method that checks if two points are equal.
    public boolean equals(PointArray anotherPointArray)
    {
        if(points.length != anotherPointArray.points.length){
            return false;
        }

        boolean founds[] = new boolean[points.length];

        for(int i = 0; i < points.length; i++)
        {
            for(int j = 0; j < anotherPointArray.points.length; j++)
            {
                if(points[i].equals(anotherPointArray.points[j]) && founds[j] == false) {
                    founds[j] = true;
                    break;
                }
            }
        }

        for(int i = 0; i < founds.length; i++)
        {
            if(founds[i] == false) {
                return false;
            }
        }
        return true;
    }

    // toString method that prints out or displays the arrays and their values.
    public String toString()
    {
        String result = "{";

        for(int i = 0; i < points.length; i++) {
            if(i != points.length - 1)
                result += points[i] + ", ";
            else
                result += points[i];
        }

        result += "}";
        return result;
    }
}