package org.generation.italy;

import java.time.LocalDate;
import java.util.ArrayList;

abstract class ElementoMultimediale { // SUPERCLASSE

	static int prossimoId;
	protected int id;
	protected int nrCopie;
	protected String titolo;
	protected String genere;

	ArrayList<Prestito> elencoPrestiti;

	public ElementoMultimediale(int nrCopie, String titolo, String genere) {
		super();
		this.id = prossimoId++;
		this.nrCopie = nrCopie;
		this.titolo = titolo;
		this.genere = genere;
		this.elencoPrestiti = new ArrayList<>();
	}

	public int effettuaPrestito(String utente) {
		if (nrCopie > 10) {

			Prestito prestito = new Prestito(utente);
			prestito.setDataInizio(LocalDate.now());
			elencoPrestiti.add(prestito);
			nrCopie--;
			return prestito.getId();
		}
		return -1;
	}

	public void restituisciPrestito(int idPrestito) {

		for (Prestito prestito : elencoPrestiti) {
			if (idPrestito == prestito.getId()) {
				prestito.setDataFine(LocalDate.now());

				break;
			}

		}
		nrCopie++;
	}

	public static int getProssimoId() {
		return prossimoId;
	}

	public static void setProssimoId(int prossimoId) {
		ElementoMultimediale.prossimoId = prossimoId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNrCopie() {
		return nrCopie;
	}

	public void setNrCopie(int nrCopie) {
		this.nrCopie = nrCopie;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public ArrayList<Prestito> getElencoPrestiti() {
		return elencoPrestiti;
	}

	public void setElencoPrestiti(ArrayList<Prestito> elencoPrestiti) {
		this.elencoPrestiti = elencoPrestiti;
	}

	public abstract String dettagli();

}
