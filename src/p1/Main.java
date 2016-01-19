package p1;

public class Main {

    public static void main(String[] args)
    {
        double[] monthlysales = {1590.70,7890.15,6090.15};

        monthlysales[0] = 1590.70;
        monthlysales[1] = 7890.15;
        monthlysales[2] = 6090.15;

        for (double each : monthlysales)
        {
            System.out.println(each);
        }
    }
}
