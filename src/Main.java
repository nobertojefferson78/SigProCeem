
import controladores.ControladorAluno;
import dao.AlunoService;
import dao.util.JPAUtil;
import modelos.Aluno;
import modelos.Contato;
import modelos.HistoricoEscolar;

public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Contato cont = new Contato();
		HistoricoEscolar hist = new HistoricoEscolar();
		
		AlunoService alunoServ = new AlunoService(JPAUtil.EMF);
		
		ControladorAluno contr = new ControladorAluno(alunoServ);
		
		aluno.setNome("aluno");
		
		cont.setTelefone("999886695");
		
		aluno.setContato(cont);
		aluno.setHistoricoEscolar(hist);
		
		System.out.println(aluno.getId() + "");
		
		aluno = contr.inserirAlunoDB(aluno);
		
		System.out.println(aluno.getId() + "");
	}
}
