import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.geom.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Activity3 extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int x = 450;
        int y = 50;
        int fontX = 300;

        //hourglass
        GeneralPath gp = new GeneralPath();
        gp.moveTo(132 + x, 112 + y);
        gp.lineTo(55 + x, 61 + y);
        gp.curveTo(94 + x, 22 + y, 213 + x, 20 + y, 258 + x, 61 + y);
        gp.lineTo(93 + x, 211 + y);
        gp.curveTo(116 + x, 234 + y, 197 + x, 232 + y, 218 + x, 217 + y);//lower inner arc
        gp.lineTo(55 + x, 61 + y);
        gp.lineTo(261 + x, 222 + y);
        gp.curveTo(227 + x, 256 + y, 88 + x, 253 + y, 57 + x, 222 + y);//outer lower arc
        gp.lineTo(222 + x, 71 + y);
        gp.curveTo(197 + x, 46 + y, 122 + x, 45 + y, 97 + x, 67 + y);
        gp.lineTo(261 + x, 222 + y);

        //star
        GeneralPath star = new GeneralPath();
        star.moveTo(118 + x, 0 + y);
        star.lineTo(159 + x, 115 + y);
        star.lineTo(180 + x, 62 + y);
        star.lineTo(166 + x, 136 + y);
        star.lineTo(200 + x, 280 + y);
        star.lineTo(158 + x, 164 + y);
        star.lineTo(138 + x, 220 + y);
        star.lineTo(149 + x, 140 + y);
        star.lineTo(118 + x, 0 + y);

        //Ring
        GeneralPath ring = new GeneralPath();
        ring.moveTo(110 + x, 125 + y);
        ring.lineTo(54 + x, 135 + y);
        ring.curveTo(160 + x, 145 + y, 158 + x, 145 + y, 268 + x, 133 + y);//curve
        ring.lineTo(199 + x, 125 + y);
        ring.lineTo(323 + x, 133 + y);//curve
        ring.curveTo(102 + x, 158 + y, 232 + x, 154 + y, 0 + x, 136 + y);//curve
        ring.lineTo(110 + x, 125 + y);

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setFont(new Font("Times New Roman", 0, 34));
        g2d.drawString("The Red Hourglass signifies the desire to be on time", fontX, 350);
        g2d.drawString("The Star signifies the pursuit of success", fontX, 380);
        g2d.drawString("The Ring shows the importance of resolve to pursue goals", fontX, 410);
        
        //display figures
        g2d.setColor(Color.red);
        g2d.fill(gp);
        g2d.setColor(Color.blue);
        g2d.fill(star);
        g2d.setColor(Color.gray);
        g2d.fill(ring);
    }

    public static void main(String[] args) {
        Activity3 act3 = new Activity3();
        act3.setTitle("Reyes 4CSA Activity 3");
        act3.setSize(1280, 720);
        act3.setForeground(Color.BLACK);
        act3.setVisible(true);
        act3.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
