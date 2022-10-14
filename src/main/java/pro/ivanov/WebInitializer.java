package pro.ivanov;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
  
public class WebInitializer implements WebApplicationInitializer {
    
	/*@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();  
        ctx.register(WebInitializer.class);  
        ctx.setServletContext(servletContext);    
        Dynamic servlet = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(ctx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/*");  
        
	}*/
	
	 @Override
	 public void onStartup(ServletContext container) {
		 AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();  
	     
		 ctx.register(WebInitializer.class);  
	     ctx.setServletContext(container);
	     ctx.setConfigLocation("pro.ivanov");   
	     
		 ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet(ctx));
		 
	     registration.setLoadOnStartup(1);
	     registration.addMapping("/*");
	 }
}