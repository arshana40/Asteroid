package id.ac.its.AryaKreshna.asteroid;

import java.math.*;

public class Asteroid extends Sprite{

	private final int BOARD_WIDTH = -50;
    private final int ASTEROID_SPEED = 4;
    
    public Asteroid() {
    	
        super( 600 , (int) (Math.random() * (470+1)) - 10 );
        
        initAsteroid();
    }
    
    private void initAsteroid() {
        
        loadImage("src/resources/asteroid.png");  
        getImageDimensions();
    }

    public void move() {
        
        x -= ASTEROID_SPEED;
        
        if (x < BOARD_WIDTH) {
            visible = false;
        }
        
    }
}
