import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;

public class PersistenciaVeiculos {//tem que dar extends para ControleVeiculos
    
    public List<Veiculo> carregaVeiculos(String str){
        
    	List<Veiculo> lista = new ArrayList<>();
    	try {
    		Scanner sc = new Scanner(new File(str));
    		String line = sc.nextLine();
    		String [] fields = line.split(",");
    		for(int i = 0; i < fields.length; i = i + 4) {
    			Veiculo veiculo = new Veiculo(fields[i], fields[i+1], fields[i+2], fields[i+3]); ;
    			lista.add(veiculo);
    		}   	
    		sc.close();
    	}catch(FileNotFoundException e) {
    		System.out.println("Arquivo nao encontrado!");
    	}
    	return lista;
        
    }

    public boolean persisteVeiculos(ArrayList<Veiculo> list){
    	try{
			File listaVeiculos = new File("lstVeiculos.dat");
			PrintWriter saida = new PrintWriter(listaVeiculos);
			for(Veiculo v: list){
				saida.print(v.getPlaca() + ",");
				saida.print(v.getMarca()+ ",");
				saida.print(v.getCor()+",");
				saida.print(v.getCategoriaVeiculo()+",");
			}
			saida.close();
		}catch(FileNotFoundException e){
			return false;
		}
		return true;
	}

               
} 
        
    

