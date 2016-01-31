package sample;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.LocalBean;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SampleBean
 */
@SuppressWarnings("serial")
@Stateless
@LocalBean
@AccessTimeout(value=100)
public class SampleBean implements SessionBean{

    /**
     * Default constructor. 
     */
    public SampleBean() {
        // TODO Auto-generated constructor stub
    }
    @Lock(Write)
    public int addition(int a,int b){
    	return a+b;//represents the functionality of the bean itself once it is created.However this isn't enough on its own to define a bean.A session bean must have additional methods to control how it is instantiated, modified and removed.
    }

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}
}
