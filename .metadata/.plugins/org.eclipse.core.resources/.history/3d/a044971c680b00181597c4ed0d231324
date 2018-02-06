//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      
      head(window);
      upperBody(window);
      lowerBody(window);

      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);


		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
	   window.setColor(Color.blue);
	   window.fillRect(300, 250, 200, 100);
	   window.fillOval(355, 125, 20, 10);
	   window.fillOval(425, 125, 20, 10);
	   window.fillOval(400, 145, 8, 8);
	   window.drawArc(388, 145, 30, 40, 0, -180);

   }

   public void lowerBody( Graphics window )
   {

	   window.setColor(Color.gray);
	   window.fillRect(300, 400, 200, 100);
	   window.fillRect(200, 250, 100, 2);
	   window.fillRect(500, 250, 100, 2);
	   
	   window.fillRect(330, 500, 2, 300);
	   window.fillRect(470, 500, 2, 300);
	   

   }
}