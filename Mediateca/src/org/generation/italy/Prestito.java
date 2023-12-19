package org.generation.italy;

import java.time.LocalDate;

public class Prestito {

	static int prossimoId; 
	int id;
	LocalDate dataInizio;
	LocalDate dataFine;
	String utente;
	
	public Prestito(String utente) {
		super();
		this.id = id++;
		prossimoId=id++;
		this.utente=utente;
	}
	public static int getProssimoId() {
		return prossimoId;
	}
	public static void setProssimoId(int prossimoId) {
		Prestito.prossimoId = prossimoId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}
	public LocalDate getDataFine() {
		return dataFine;
	}
	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}
	
}
