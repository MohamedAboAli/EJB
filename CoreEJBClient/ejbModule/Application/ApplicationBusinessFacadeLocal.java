package Application;

import javax.ejb.Local;

@Local
public interface ApplicationBusinessFacadeLocal {

	public int add(int a,int b);
}
