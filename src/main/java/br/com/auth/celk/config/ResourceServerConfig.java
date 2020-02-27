package br.com.auth.celk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;


/**
 * @Author Caibas
 *
 *
 *The @EnableResourceServer annotation adds a filter of type OAuth2AuthenticationProcessingFilter automatically
 *to the Spring Security filter chain.
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
            .headers()
                .frameOptions()
                .disable()
                .and()
            .authorizeRequests()
      .antMatchers("/swagger-ui.html", "/v2/api-docs", "/webjars/**","/swagger-resources/**", "/oauth/authorize")
                .permitAll()
                .antMatchers("/**").authenticated();
    }


}
