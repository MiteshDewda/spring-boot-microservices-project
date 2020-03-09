package io.mitesh;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
		.withUser("user")
		.password("abcd")
		.roles("user")
		.and()
		.withUser("admin")
		.password("admin")
		.roles("admin");
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("admin")
		.antMatchers("/user").hasAnyRole("user", "admin")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}
}
