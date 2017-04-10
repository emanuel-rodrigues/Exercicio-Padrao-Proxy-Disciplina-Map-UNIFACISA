
public class Cliente {

	public static void main(String[] args) {
		
		
		System.out.println("Hacker acessando >(");
		Banco banco = new BancoUsuarioProxy("Hacker", "1234");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());

		System.out.println("\nAdministrador acessando :)");
		banco = new BancoUsuarioProxy("admin", "admin");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());

	}

}
