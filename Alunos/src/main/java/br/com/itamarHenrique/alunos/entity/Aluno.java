package br.com.itamarHenrique.alunos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {
	
	private String nome;
	private String sobrenome;
	private int matricula;
	private String cpf;
}
