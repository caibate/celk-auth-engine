package br.com.auth.celk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author Caibas
 *
 * Classe principal do projeto
 */

@SpringBootApplication
@EnableCaching
public class CelkApplication {

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }    

    public static void main(String[] args) {
        SpringApplication.run(CelkApplication.class, args);
    }

}
