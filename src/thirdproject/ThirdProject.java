package thirdproject;

import java.util.ArrayList;

public class ThirdProject {

    public static void main(String[] args) {
        String dados[] = new String[2];
        ArrayList<Pair> array = new ArrayList();
        Plot image = new Plot();
        Distance distance = new Distance();

        SimpleReader reader = new SimpleReader("mobile.txt");
        String line = reader.readLine();

        while (line != null) {
            dados = line.split("  ");
            String posicao = String.valueOf(dados[0]);
            double x = Double.parseDouble(dados[1]);
            double y = Double.parseDouble(dados[2]);
            image.Devices(x, y);
            distance.Distance(x, y);
            array.add(new Pair(posicao, x, y));
            String tower = distance.Distance(x, y);
            line = reader.readLine();
        }
        reader.close();
        
        

        /*System.out.println("---");
        System.out.println("--- PARÂMETROS");
        System.out.println("---");
        for (Pair p : array) {
            System.out.println("Arquivo: " + p);
        }*/
    }

    private static class Pair implements Comparable<Pair> {

        public String p;
        public double x;
        public double y;

        public Pair(String p, double x, double y) {
            this.p = p;
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return this.p + ": X - " + this.x + ", Y - " + this.y;
        }

        public int compareTo(ThirdProject.Pair p) {
            return this.p.compareTo(p.p);
        }
    }
}
