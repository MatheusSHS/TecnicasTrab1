public class Veiculo{
    public String placa;
    public String marca;
    public String cor;
    public CategoriaVeiculo catveiculo;
	
    
    public Veiculo(String placa, String marca, String cor, String catveiculo){
        this.placa = placa ;
        this.marca = marca;
        this.cor = cor;
        //this.catveiculo = catveiculo;
        catveiculo = catveiculo.toUpperCase();
        if(catveiculo.equals("LUXO")) {
            this.catveiculo = CategoriaVeiculo.LUXO;
    	}else if(catveiculo.equals("NORMAL")) {
            this.catveiculo = CategoriaVeiculo.NORMAL;
        }else if(catveiculo.equals("SIMPLES")) {
            this.catveiculo = CategoriaVeiculo.SIMPLES;
    	}
    }

    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public String getCor(){
        return cor;
    }

    public CategoriaVeiculo getCategoriaVeiculo(){
        return catveiculo;
    }

    @Override
	public String toString() {
		return "Placa: " + placa + " | Marca: " + marca + " | Cor: " + cor + " | Categoria: " + catveiculo + "\n";
	}
}