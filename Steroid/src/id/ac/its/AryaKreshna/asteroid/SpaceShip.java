package id.ac.its.AryaKreshna.asteroid;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;


public class SpaceShip extends Sprite {

    private int dx;
    private int dy;
    private List<Missile> missiles;
    private List<Asteroid> asteroids;
    private int rng = 2;
    
    

    public SpaceShip(int x, int y) {
        super(x, y);
        
        initSpaceShip();
    }

    private void initSpaceShip() {

        missiles = new ArrayList<>();
        asteroids = new ArrayList<>();
        
        loadImage("src/resources/spaceship.png"); 
        getImageDimensions();
    }

    public void move() {
    	
    	if(rng == (int) (Math.random() * 15-1+1) + 1) {
    		water();
    	}
    	
    	if(x<1 && dx<0) {
    		dx = 0;
    	}
    	else if(x>530 && dx>0) {
    		dx = 0;
    	}
    	else if(y<1 && dy<0) {
    		dy = 0;
    	}
    	else if(y>355 && dy>0) {
    		dy = 0;
    	}
    	else
        x += dx;
        y += dy;
        
    }
    
    

    public List<Missile> getMissiles() {
        return missiles;
    }
    public List<Asteroid> getAsteroid(){
    	return asteroids;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            fire();
         
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }
    }

    public void fire() {
        missiles.add(new Missile(x + width, y + height / 2));
    }
    public void water() {
    	asteroids.add(new Asteroid());
    }
    
        
    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}