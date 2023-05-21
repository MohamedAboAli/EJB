package Application;

import javax.ejb.Remote;

@Remote
public interface ApplicationBusinessFacadeRemote {

	public int multiple(int a,int b);
}
