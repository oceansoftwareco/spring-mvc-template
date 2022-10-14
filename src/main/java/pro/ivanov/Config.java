package pro.ivanov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("pro.ivanov")
@EnableWebMvc
public class Config  extends WebMvcConfigurerAdapter  {
	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		
		//resolver.setViewClass(JstlView.class);
		
		return resolver;
	}
	
	 /* @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/*");
	    }**/
}
