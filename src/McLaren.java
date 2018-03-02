import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.geom.*;


import java.awt.event.*;

@SuppressWarnings("serial")
public class McLaren extends Frame{
    @Override
    public void paint (Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        String name="McLaren";
        int x = 0;
        int y = 0;

        //rear of car
        GeneralPath rearWing = new GeneralPath();
        rearWing.moveTo(31+x, 280+y);
        rearWing.lineTo(31+x, 191+y);
        rearWing.quadTo(31+x, 190+y, 32+x, 190+y);
        rearWing.lineTo(115+x, 190+y);
        rearWing.lineTo(120+x, 195+y);
        rearWing.lineTo(120+x, 244+y);
        rearWing.lineTo(78+x, 314+y);
        rearWing.lineTo(75+x, 314+y);
        rearWing.lineTo(65+x, 289+y);
        rearWing.lineTo(31+x, 280+y);
        //diffuser
        GeneralPath diff = new GeneralPath();
        diff.moveTo(74+x, 312+y);
        diff.lineTo(66+x, 320+y);
        diff.lineTo(66+x, 341+y);
        diff.lineTo(99+x, 341+y);
        diff.lineTo(99+x, 312+y);
        diff.lineTo(74+x, 312+y);

        //Body
        GeneralPath body = new GeneralPath();
        //engine cover
        body.moveTo(163+x, 262+y);
        body.curveTo(273+x, 229+y, 332+x, 230+y, 351+x, 230+y);
        body.lineTo(351+x, 231+y);
        body.lineTo(366+x, 204+y);
        body.lineTo(373+x, 204+y);
        body.quadTo(375+x, 204+y, 375+x, 207+y);//seat start, engine cover end
        body.lineTo(375+x, 230+y);
        body.curveTo(379+x, 233+y, 385+x, 246+y, 389+x, 262+y);
        body.curveTo(390+x, 263+y, 393+x, 268+y, 397+x,268+y);
        body.lineTo(485+x, 268+y);
        body.curveTo(503+x, 266+y, 508+x, 256+y, 511+x, 240+y);
        body.lineTo(512+x,239+y);
        body.lineTo(513+x,239+y);
        body.lineTo(514+x,240+y);
        body.curveTo(517+x, 247+y, 538+x, 254+y, 583+x, 263+y);
        body.lineTo(586+x, 343+y);
        body.lineTo(467+x, 343+y);
        body.lineTo(466+x, 344+y);
        body.lineTo(160+x, 344+y);
        body.lineTo(163+x, 262+y);
        
        //body aero
        GeneralPath pod = new GeneralPath();
        pod.moveTo(183+x,281+y);
        pod.curveTo(309+x, 276+y,429+x,275+y, 473+x, 280+y);
        pod.moveTo(470+x, 334+y);
        pod.lineTo(470+x, 288+y);
        pod.curveTo(471+x, 286+y, 472+x, 285+y, 476+x, 285+y);
        pod.lineTo(487+x, 285+y);
        
        //bargeboards(?)
        GeneralPath board1 = new GeneralPath();
        board1.moveTo(470+x, 291+y);
        board1.lineTo(517+x, 291+y);
        board1.lineTo(517+x, 340+y);
        board1.curveTo(507+x, 336+y, 488+x, 334+y, 470+x, 334+y);
        board1.lineTo(470+x, 291+y);
        GeneralPath board2 = new GeneralPath();
        board2.moveTo(470+x, 291+y);
        board2.lineTo(517+x,334+y);
        board2.lineTo(517+x,288+y);
        board2.lineTo(520+x, 285+y);
        board2.lineTo(572+x,295+y);
        board2.lineTo(586+x,343+y);
        board2.lineTo(450+x,343+y);
        board2.lineTo(470+x,335+y);
        board2.lineTo(470+x,291+y);
        
        //front wing
        GeneralPath wing = new GeneralPath();
        wing.moveTo(661+x, 274+y);
        wing.lineTo(670+x, 274+y);
        wing.curveTo(706+x, 300+y, 731+x, 314+y, 752+x, 322+y);
        wing.curveTo(757+x, 324+y, 761+x, 326+y, 762+x, 329+y);
        wing.curveTo(764+x, 333+y, 763+x, 335+y, 753+x, 346+y);
        wing.lineTo(645+x, 346+y);
        wing.curveTo(668+x, 328+y, 674+x, 295+y, 661+x, 274+y);
        //wing lower part
        GeneralPath someWing = new GeneralPath();
        someWing.moveTo(650+x, 342+y);
        someWing.lineTo(770+x, 342+y);
        someWing.lineTo(770+x, 346+y);
        someWing.lineTo(645+x, 346+y);
        someWing.lineTo(645+x, 342+y);
        someWing.lineTo(650+x, 342+y);
        
        //orange body parts
        GeneralPath orangeBod = new GeneralPath();
        orangeBod.moveTo(187+x, 254+y);
        orangeBod.curveTo(205+x, 259+y, 228+x, 272+y, 234+x, 279+y);
        orangeBod.lineTo(288+x,278+y);
        orangeBod.lineTo(293+x, 281+y);
        orangeBod.lineTo(329+x, 334+y);
        orangeBod.lineTo(329+x, 345+y);
        orangeBod.lineTo(133+x, 345+y);
        orangeBod.lineTo(133+x, 254+y);
        orangeBod.lineTo(187+x, 254+y);
        
        orangeBod.moveTo(500+x, 263+y);
        orangeBod.lineTo(540+x, 303+y);
        orangeBod.lineTo(600+x, 303+y);
        orangeBod.lineTo(600+x, 263+y);
        orangeBod.lineTo(500+x, 263+y);
        
        GeneralPath bodyBlack = new GeneralPath();
        bodyBlack.moveTo(470+x, 334+y);
        bodyBlack.quadTo(470+x, 344+y, 466+x, 344+y);
        bodyBlack.lineTo(143+x, 344+y);
        bodyBlack.lineTo(171+x, 335+y);
        bodyBlack.lineTo(269+x, 338+y);
        bodyBlack.lineTo(299+x, 334+y);
        bodyBlack.lineTo(470+x, 334+y);
        
        GeneralPath shield = new GeneralPath();
        shield.moveTo(580+x, 263+y);
        shield.lineTo(500+x, 263+y);
        shield.lineTo(500+x, 200+y);
        shield.lineTo(580+x, 200+y);
        shield.lineTo(580+x, 263+y);

        Ellipse2D.Double rearWheel = new Ellipse2D.Double(76+x,243+y, 110, 110);
        Ellipse2D.Double frontWheel = new Ellipse2D.Double(564+x, 252+y, 101, 101);
        
        Area wheel = new Area(rearWheel);
        Area fwing = new Area(wing);
        Area fwing2 = new Area(someWing);
        Area blackBody = new Area(bodyBlack);
        Area bod = new Area(body);
        Area bod2 = new Area(body);
        Area bod3 = new Area(body);
        Area shld = new Area(shield);
        bod.intersect(blackBody);
        bod2.intersect(new Area(orangeBod));
        bod3.intersect(shld);
        wheel.add(new Area(frontWheel));
        fwing.intersect(fwing2);

        Color mclarenOrange = new Color(250, 20, 7);
        Color floorColor = new Color(25, 25, 25);

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(floorColor);
        g2d.fill(diff);
        g2d.setColor(mclarenOrange);
        g2d.fill(bod2);
        g2d.fill(rearWing);
        g2d.setColor(Color.black);
        g2d.draw(body);
        g2d.draw(bodyBlack);
        g2d.draw(pod);
        g2d.draw(wing);
        g2d.setColor(new Color(74,67,38));
        g2d.fill(fwing);
        g2d.setColor(Color.BLACK);
        g2d.fill(board2);
        g2d.setColor(floorColor);
        g2d.fill(board1);
        g2d.fill(bod);
        g2d.setColor(new Color(79,83,82));
        g2d.fill(bod3);
        g2d.setColor(new Color(23,21,22));
        g2d.fill(wheel);
        

    }
    public static void main(String [] args) {
        McLaren mclaren = new McLaren();
        mclaren.setTitle("McLaren MP4/4");
        mclaren.setSize(1280, 720);
        mclaren.setVisible(true);
        mclaren.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}