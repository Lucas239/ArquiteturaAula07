package exemplo;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Lucas", 1));
		alunos.add(new Aluno("Gabriel", 2));
		alunos.add(new Aluno("Joao", 2));
		
		
		for(Aluno a:alunos) {
			System.out.println(a);
		}

	}

}
