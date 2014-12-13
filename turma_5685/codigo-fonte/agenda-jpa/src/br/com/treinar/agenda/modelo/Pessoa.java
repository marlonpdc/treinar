package br.com.treinar.agenda.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity(name="Funcionario")
@Table(name="tb_pessoa", uniqueConstraints={@UniqueConstraint(columnNames={"nome"})})
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name", nullable=false, length=255)
	private String nome;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimento;
	
	@Transient
	private Integer idade;
   
}
