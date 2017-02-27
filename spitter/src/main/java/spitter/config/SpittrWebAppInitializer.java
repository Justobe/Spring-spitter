package spitter.config;

/**
 * Created by YanMing on 2017/2/26.
 */
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import spitter.web.WebConfigs;
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfigs.class };
    }

}