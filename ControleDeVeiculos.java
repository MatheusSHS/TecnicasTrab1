import java.util.List;
import java.util.ArrayList;

public class ControleDeVeiculos{
	private PersistenciaVeiculos pv;
	private static List<Veiculo> list;
	
	public ControleDeVeiculos(){
		this.list = new ArrayList<Veiculo>();
		this.pv = new PersistenciaVeiculos();
	}
	
	public void carrega(String string) {
		list = pv.carregaVeiculos(string);
	}
    public static Veiculo getVeiculo(String placa){
        for(Veiculo veiculo : list){
            if(veiculo.getPlaca().equals(placa)){
                return veiculo;
            }
        }
        return null;
    }
    
    public List<Veiculo> getVeiculo(CategoriaVeiculo categoria){
        List<Veiculo> lst = new ArrayList<>();
        
        if(list.size() == 0){
            return lst;
        }

        for(Veiculo v: list){
            if(v.getCategoriaVeiculo().equals(categoria)){
                lst.add(v);
            }
        }

        return lst;
    }

    public List<Veiculo> getTodosVeiculos(){
        return list;
    }
}