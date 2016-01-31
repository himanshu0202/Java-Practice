package converter;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface homeInterface extends EJBHome {
	public Converter create() throws CreateException, RemoteException;
}
