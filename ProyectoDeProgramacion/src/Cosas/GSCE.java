package Cosas;

import java.util.EventObject;

/**
 * EventObject subclass for {@link Partida} sources 
 * @author Dario
 *
 */
public class GSCE extends EventObject {
	
	private static final long serialVersionUID = 1167218539017906933L;

	public GSCE(Object source) {
		super(source);
	}

	
}
