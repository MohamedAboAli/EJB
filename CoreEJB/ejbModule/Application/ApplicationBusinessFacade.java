package Application;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ApplicationBusinessFacade
 */
@Stateless
public class ApplicationBusinessFacade implements ApplicationBusinessFacadeRemote, ApplicationBusinessFacadeLocal {

    /**
     * Default constructor. 
     */
    public ApplicationBusinessFacade() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int multiple(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
