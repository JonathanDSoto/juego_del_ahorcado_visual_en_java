import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Test extends JButton implements ActionListener{
	
	//propiedad animal, estado, 
	
	public Test() {
		//super();
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Hola");
		
	}

}
