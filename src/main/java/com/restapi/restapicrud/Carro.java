package com.restapi.restapicrud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String marca;
	String modelo;
	String ano;
	String imgCarro;

}
