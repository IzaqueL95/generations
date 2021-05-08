package org.generation.blogPessoal.service;

import java.nio.charset.Charset;
import java.util.Optional;
import org.apache.commons.codec.binary.Base64;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder	;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public Usuario CadastrarUsuario (Usuario usuario)
	{
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
											// abaixo ele pede a senha passada dentro de usuario.
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder); //acessar e passar a senha encriptada, ou seja a senha que entrar estara encriptada
		
		return repository.save(usuario); //salva o usuario já com a senha modificada
				
	}
	
	// UserLogin pois o que eu quero retornar ao client, é o que está dento de UserLogin: nome,usuario,senha,token
	public Optional<UserLogin> Logar (Optional<UserLogin> user)
	{
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
														//o primeiro .get é para acessar o objeto que tem dentro dele, no caso (usuario) e assim acessar o método dentro de usuario .getUsuario
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario()); //aqui chama o método criada no UsuarioRepository, e dizer o usuario que vai entrar dentro do optional, no caso (user)
	
		if(usuario.isPresent())
		{
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) //o encoder verificara duas senhas, uma encriptada e outra não, se ambas forem iguais ele retornara um true
			{
				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader ="Basic " + new String(encodedAuth); //convertendo para string o método byte acima
			
				user.get().setToken(authHeader);
				user.get().setId(usuario.get().getId());
				user.get().setNome(usuario.get().getNome());
				user.get().setFoto(usuario.get().getFoto());
				user.get().setTipo(usuario.get().getTipo());
				
				return user;
			}
		}
		
		return null; // ira retornar nulo, caso ele não entre no IF, ou seja caso o usuario não exista na dataBase, caso exista ele entrara no if acima.
	}
}
