package Cosas;

import javax.swing.JButton;

public class GSCEbutton extends JButton implements GSCElistener{

	private static final long serialVersionUID = 9038644174539259336L;

	public GSCEbutton(String string) {
		super(string);
	}

	@Override
	public void handleGSCE(GSCE ev) {
		/**
		 * This should be overridden on instantiation 
		 */
	}

}
