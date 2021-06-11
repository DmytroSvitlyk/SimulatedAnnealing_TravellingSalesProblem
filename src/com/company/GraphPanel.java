package com.company;

import javax.swing.*;
import java.awt.*;

public class GraphPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        for (int i = 0; i < Solution.size; i++) {
            int x = Solution.cords[Solution.committedPath[i]].x;
            int y = Solution.cords[Solution.committedPath[i]].y;
            g.drawString(String.valueOf(i), x-10, y-10);
            g.fillOval(x-5, y-5, 10, 10);
            g.drawLine(x, y, Solution.cords[Solution.committedPath[(i+1)%Solution.size]].x, Solution.cords[Solution.committedPath[(i+1)%Solution.size]].y);
        }
    }
}
