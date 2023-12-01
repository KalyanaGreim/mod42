package com.kaly.vendas.online.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name="Cliente", description="Cliente") 
public class Cliente {
	
	@Id
	@Schema(description="Identificador único") 
	private String id;
	
	@NotNull
	@Schema(description="Nome", minLength = 1, maxLength=50, nullable = false) 
	private String nome;
	
	@NotNull
	@Schema(description="CPF", nullable = false) 
    private Long cpf;
    
	@NotNull
	@Schema(description="Telefone", nullable = false) 
    private Long tel;
	
	@Indexed(unique = true, background = true)
	@Schema(description="Email", minLength = 1, maxLength=50, nullable = false)
	@Pattern(regexp = ".+@.+\\..+", message = "Email inválido")
	private String email;
    
	@NotNull
	@Schema(description="Endereço", minLength = 1, maxLength=50, nullable = false)
    private String end;
    
	@NotNull
	@Schema(description="Numero residencial", nullable = false) 
    private Integer numero;
    
	@NotNull
	@Schema(description="Cidade", minLength = 1, maxLength=50, nullable = false)
    private String cidade;
    
	@NotNull
	@Schema(description="Estado", minLength = 1, maxLength=50, nullable = false)
    private String estado;
    

}
