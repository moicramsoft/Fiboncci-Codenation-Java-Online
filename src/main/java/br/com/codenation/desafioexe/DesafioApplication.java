package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		  List<Integer> AdicionaNaLista = new ArrayList<>();

		for(int a=0, b=1; a<=377; b+=a, a=b-a) {
			AdicionaNaLista.add(a);
		}

		return AdicionaNaLista;
    }

		public static Boolean isFibonacci(Integer a) {
		return (fibonacci().contains(a));
	}
 public static void main(String[] args) {
        DesafioApplication.fibonacci();
        //DesafioApplication.isFibonacci((a));
            
}
}