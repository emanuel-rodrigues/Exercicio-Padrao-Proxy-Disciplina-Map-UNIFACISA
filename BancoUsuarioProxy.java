
public class BancoUsuarioProxy implements Banco{

	
	protected String usuario, senha;
	
	
	Banco banco = new BancoUsuarios();
	
	public BancoUsuarioProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	

	@Override
	public String getNumeroDeUsuarios() {
		if (temPermissaoDeAcesso()) {
			return banco.getNumeroDeUsuarios();
		}
		return null;
	}

	@Override
	public String getUsuariosConectados() {
		if (temPermissaoDeAcesso()) {
			return banco.getUsuariosConectados();
		}
		return null;
	}
	
	
	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
	
	
}
