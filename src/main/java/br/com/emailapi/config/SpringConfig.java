package br.com.emailapi.config;

import br.com.emailapi.service.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public SmtpEmailService smtpEmailService(){
        return new SmtpEmailService();
    }
}
