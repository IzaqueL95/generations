package org.generation.blogPessoal.seguranca;

import java.util.Collection;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javassist.SerialVersionUID;

public class UserDetailsImpl implements UserDetails {
	
	private static final long SerialVersionUID = 1L;
	
	//atributos privados
	private String userName;
	private String password;
	
	//criar o construtor de classe
	public UserDetailsImpl(Usuario user)
	{
		this.userName = user .getUsuario();  //usuario e senha que vem da model usuario.
		this.password = user.getSenha(); //usuario e senha que vem da model usuario.
	}
	
	//criar o construtor vazio
	public UserDetailsImpl() {}

	/**o sistema pedira para adicionar todos os métodos da implementação, então assim que acusar o erro, 
	 * basta clicar que ele ira trazer os métodos da implementação.
	 */
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
