package Atividadeheranca;

public class Proncipalheranca {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Funcionario funcionario = new Funcionario("Kaiky morelli", "5609", 10000, "998334348", "francico correa da silva", "26/02");

		System.out.println("nome: "+funcionario.getNome());

		System.out.println("matricula: " +funcionario.getMatricula());

		System.out.println("salario: "+funcionario.getSalario());

		System.out.println("telefone: "+funcionario.getTelefone());

		System.out.println("endereco: "+funcionario.getEndereco());

		System.out.println("data nascimento: "+funcionario.getDataNascimento());


		Administrador administrador = new Administrador(1237485);

		System.out.println("cra: "+administrador.getCra());


		Engenheiro engenheiro = new Engenheiro(1237485);

		System.out.println("número do crea: "+engenheiro.getNumCrea());


		Medico medico = new Medico(1237485);

		System.out.println("número do crea: "+medico.getCrm());
	}
	

}
