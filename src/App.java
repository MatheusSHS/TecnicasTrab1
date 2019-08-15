import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class App{
	
	public static void exec() {
        
        System.out.println("Oi, este é um teste de versionamento// Matheus");
        System.out.println("Oi, este é um teste de versionamento 2// Lorenzo");
        
        Scanner sc = new Scanner(System.in);
        
        ControleDeVeiculos cv = new ControleDeVeiculos();
        
        List<Veiculo> lstFinal = new ArrayList<>();
        
        cv.carrega("veiculos.dat");
        
        lstFinal = cv.getTodosVeiculos();
        
        System.out.println("Bem vindo ao menu do Controle de Veiculos!");
        System.out.println("------------------------------------------");
        System.out.println("\nOpcoes disponiveis:");
        System.out.println("\n(1) Digite 1 e depois a placa do veiculo para o retorno de seus dados:");
        System.out.println("(2) Digite 2 e depois a Categoria de veiculos que voce gostaria de visualizar:");
        System.out.println("(3) Digite 3 para visualizar todos os veiculos disponiveis:");
        
        int n = sc.nextInt();
        
        switch(n){
            case 1: String um = sc.next(); //placa
                    System.out.println(cv.getVeiculo(um));
                    break;
            case 2: String dois = sc.next(); //categoria
            		if(dois.toLowerCase().equals("luxo")) {
            			System.out.println(cv.getVeiculo(CategoriaVeiculo.LUXO));	
            		}else if(dois.toLowerCase().equals("simples")) {
            			System.out.println(cv.getVeiculo(CategoriaVeiculo.SIMPLES));
            		}else if(dois.toLowerCase().equals("normal"))
                		System.out.println(cv.getVeiculo(CategoriaVeiculo.NORMAL));
            		break;
            
			case 3: System.out.println(lstFinal.toString());
                    break;            
        }   
        
        System.out.println("\nDesejas escolher outra opcao? Caso nao o programa ira finalizar.");
        System.out.println("(1) SIM ");
        System.out.println("(2) NAO \n");
        
        int a = sc.nextInt();
        
        switch(a){
        	case 1: exec(); 
        			break;
        	case 2: System.out.println("FIM DE PROGRAMA!");
        			System.exit(0);
        			break;
        }
	}
 
    public static void main(String args[]){
    	exec();
    }
}