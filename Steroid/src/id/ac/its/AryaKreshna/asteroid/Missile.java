package id.ac.its.AryaKreshna.asteroid;

import java.awt.Rectangle;

public class Missile extends Sprite {

    private final int BOARD_WIDTH = 580;
    private final int MISSILE_SPEED = 4;

    public Missile(int x, int y) {
        super(x, y);
        
        initMissile();
    }
    
    private void initMissile() {
        
        loadImage("src/resources/missile.png");  
        getImageDimensions();
    }

    public void move() {
        
        x += MISSILE_SPEED;
        
        if (x > BOARD_WIDTH) {
            visible = false;
        }
    }

	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
}
