package sistemaDeVentasFinal.sistemaventas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.format.datetime.DateFormatter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        // Registrar un formato de fecha global para yyyy-MM-dd
        registry.addFormatter(new DateFormatter("yyyy-MM-dd"));
    }
}


