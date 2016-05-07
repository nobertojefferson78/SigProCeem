import dao.NivelAcessoService;
import dao.util.JPAUtil;
import modelos.NivelAcesso;

public class Main {

	public static void main(String[] args) {
		NivelAcesso na1, na2, na3;
		NivelAcessoService nas = new NivelAcessoService(JPAUtil.EMF);
		
		na1 = new NivelAcesso();
		na2 = new NivelAcesso();
		na3 = new NivelAcesso();
		
		na1.setNomeNivel("ADM");
		na2.setNomeNivel("AuxAdm");
		na3.setNomeNivel("Prof");
		
		na1 = nas.criarNivelAcesso(na1);
	}
}
