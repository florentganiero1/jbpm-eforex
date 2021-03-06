package com.akasi.eforex;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class demandeAnnuelleData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "DEMANDEANNUELLEDATA_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "DEMANDEANNUELLEDATA_ID_SEQ", name = "DEMANDEANNUELLEDATA_ID_GENERATOR")
	@org.kie.api.definition.type.Label("Identifiant")
	private int id;

	@org.kie.api.definition.type.Label("Numero")
	private java.lang.String numero;

	@javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	@org.kie.api.definition.type.Label("Id usager")
	private com.akasi.eforex.usagersData idUsager;

	@org.kie.api.definition.type.Label("Autre information")
	private java.lang.String autreInformation;

	@org.kie.api.definition.type.Label("Demande pour annee")
	private int demandePourAnnee;

	@org.kie.api.definition.type.Label("Created at")
	private String createdAt;

	public demandeAnnuelleData() {
	}

	public java.lang.String getNumero() {
		return this.numero;
	}

	public void setNumero(java.lang.String numero) {
		this.numero = numero;
	}

	public com.akasi.eforex.usagersData getIdUsager() {
		return this.idUsager;
	}

	public void setIdUsager(com.akasi.eforex.usagersData idUsager) {
		this.idUsager = idUsager;
	}

	public java.lang.String getAutreInformation() {
		return this.autreInformation;
	}

	public void setAutreInformation(java.lang.String autreInformation) {
		this.autreInformation = autreInformation;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDemandePourAnnee() {
		return this.demandePourAnnee;
	}

	public void setDemandePourAnnee(int demandePourAnnee) {
		this.demandePourAnnee = demandePourAnnee;
	}

	public java.lang.String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(java.lang.String createdAt) {
		this.createdAt = createdAt;
	}

	public demandeAnnuelleData(int id, java.lang.String numero,
			com.akasi.eforex.usagersData idUsager,
			java.lang.String autreInformation, int demandePourAnnee,
			java.lang.String createdAt) {
		this.id = id;
		this.numero = numero;
		this.idUsager = idUsager;
		this.autreInformation = autreInformation;
		this.demandePourAnnee = demandePourAnnee;
		this.createdAt = createdAt;
	}

}