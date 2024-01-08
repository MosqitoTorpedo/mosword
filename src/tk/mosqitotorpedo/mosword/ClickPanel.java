package tk.mosqitotorpedo.mosword;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClickPanel extends JPanel {

    private final List<Point> list = new ArrayList<>();

    public ClickPanel() {

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                list.add(e.getPoint());
                int listSize = list.size();
                Point lastPointAdded = list.get(listSize - 1);
                System.out.println(lastPointAdded);
                repaint();
            }
        });


    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);


        for (Point p : list) {
            int circleRadius = 10;
            g2.fillOval((int) p.getX() - circleRadius, (int) p.getY() - circleRadius, 2 * circleRadius, 2 * circleRadius);
        }
    }


    public List<Point> getPoints() {
        return Collections.unmodifiableList(list);
    }
}
