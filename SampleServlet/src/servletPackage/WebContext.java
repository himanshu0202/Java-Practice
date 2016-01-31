package servletPackage;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class WebContext implements ServletContextAttributeListener {
	private ServletContext context = null;
	

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		context=arg0.getServletContext();
		System.out.println(arg0.getValue() + "was created");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		context=arg0.getServletContext();
		System.out.println(arg0.getValue() + "was removed");
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub
		context=arg0.getServletContext();
		System.out.println(arg0.getValue() + "was replaced");
	}

}
