package thirdproject;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

public class Plot extends JFrame {
    PlotComponent pcomp = new PlotComponent(500, 500);
    
    public Plot() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pcomp);
        pcomp.addPoint(0.1*500, 0.1*500);
        pcomp.addPoint(0.1*500, 0.3*500);
        pcomp.addPoint(0.1*500, 0.7*500);
        pcomp.addPoint(0.1*500, 0.9*500);
        pcomp.addPoint(0.3*500, 0.1*500);
        pcomp.addPoint(0.3*500, 0.3*500);
        pcomp.addPoint(0.3*500, 0.7*500);
        pcomp.addPoint(0.3*500, 0.9*500);
        pcomp.addPoint(0.7*500, 0.1*500);
        pcomp.addPoint(0.7*500, 0.3*500);
        pcomp.addPoint(0.7*500, 0.7*500);
        pcomp.addPoint(0.7*500, 0.9*500);
        pcomp.addPoint(0.9*500, 0.1*500);
        pcomp.addPoint(0.9*500, 0.3*500);
        pcomp.addPoint(0.9*500, 0.7*500);
        pcomp.addPoint(0.9*500, 0.9*500);
        pack();
        setVisible(true);
    }

    public void Devices(double x, double y, int linhas) {
        for(int i = 0; i < linhas; i++) {
            pcomp.addPoint2(x*500, y*500);
            pack();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new Plot());
    }
}

class PlotComponent extends JComponent {
    private ArrayList<Point2D> points = new ArrayList<Point2D>();
    private ArrayList<Point2D> points2 = new ArrayList<Point2D>();

    public PlotComponent(int width, int height) {
        setPreferredSize(new Dimension(width, height));
    }

    public void addPoint(double x, double y) {
        points.add(new Point2D.Double(x, y));
    }
    
    public void addPoint2(double x, double y) {
        points2.add(new Point2D.Double(x, y));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Graphics2D g2d2 = (Graphics2D) g;
        
        g2d.setColor(Color.BLUE);
        

        for (Point2D p : points) {
            Shape point = new Ellipse2D.Double(p.getX(), p.getY(), 10, 10);
            g2d.draw(point);
        }
        
        g2d.setColor(Color.RED);
        for (Point2D p : points2) {
            Shape point2 = new Ellipse2D.Double(p.getX(), p.getY(), 10, 10);
            g2d2.draw(point2);
        }
    }
}