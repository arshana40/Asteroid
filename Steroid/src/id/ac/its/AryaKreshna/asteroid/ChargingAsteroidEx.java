package id.ac.its.AryaKreshna.asteroid;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ChargingAsteroidEx extends JFrame {

	 public ChargingAsteroidEx() {
	        
	        initUI();
	    }
	    
	    private void initUI() {
	        
	        add(new Board());
	        
	        setSize(600, 450);
	        setResizable(false);
	        
	        setTitle("Charging asteroid");
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public static void main(String[] args) {
	        
	        EventQueue.invokeLater(() -> {
	            ChargingAsteroidEx ex = new ChargingAsteroidEx();
	            ex.setVisible(true);
	        });
	    }
	
}
