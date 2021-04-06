package org.generation.blogPessoal.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity // idica que a classe se trada de uma classe de Configuração de segurança do spring
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
	protected void configure (AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.userDetailsService(userDetailsService);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	/**sere para liberar endPoints, ou seja caminhos dentro do controller, para que o 
	 * client tenha acesso sem precisar passar uma chave/token, o endPoint liberado no caso é usuarios/logar e usuarios/cadastrar
	 * como escrito abaixo, pois para logar ele precisa ter acesso a fazer a requisição dentro desse endPoint.
	 */
	@Override
	protected void configure (HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/usuarios/logar").permitAll()
		.antMatchers("/usuarios/cadastrar").permitAll()
		.anyRequest().authenticated() // serve para dizer que as demais requisições deverão ser autenticadas.
		.and().httpBasic() //serve para usar o padrão basic para gerar a chave/token
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) //vai indicar o tipo de sessão usada
		.and().cors()
		.and().csrf().disable();
	}

}
