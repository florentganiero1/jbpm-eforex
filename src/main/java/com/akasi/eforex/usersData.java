package com.akasi.eforex;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class usersData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;

	@org.kie.api.definition.type.Label("First Name")
	private java.lang.String firstName;

	@org.kie.api.definition.type.Label("Email")
	private java.lang.String email;

	@org.kie.api.definition.type.Label("Telephone")
	private java.lang.String telephone;

	@org.kie.api.definition.type.Label("Password")
	private java.lang.String password;

	@org.kie.api.definition.type.Label("Adresse")
	private java.lang.String adresse;

	@org.kie.api.definition.type.Label("Status")
	private java.lang.Boolean status;

	@org.kie.api.definition.type.Label("Created at")
	private String createdAt;

	@org.kie.api.definition.type.Label("Uuid")
	private char uuid;

	@org.kie.api.definition.type.Label("Email verified at")
	private String email_verified_at;

	@org.kie.api.definition.type.Label("Remember token")
	private java.lang.String remember_token;

	@org.kie.api.definition.type.Label("Updated at")
	private String updated_at;

	@org.kie.api.definition.type.Label("Identifiant")
	private int id;

	public usersData() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(java.lang.String telephone) {
		this.telephone = telephone;
	}

	public java.lang.String getPassword() {
		return this.password;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	public java.lang.String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(java.lang.String adresse) {
		this.adresse = adresse;
	}

	public java.lang.Boolean getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.Boolean status) {
		this.status = status;
	}

	public char getUuid() {
		return this.uuid;
	}

	public void setUuid(char uuid) {
		this.uuid = uuid;
	}

	public java.lang.String getRemember_token() {
		return this.remember_token;
	}

	public void setRemember_token(java.lang.String remember_token) {
		this.remember_token = remember_token;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public java.lang.String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(java.lang.String createdAt) {
		this.createdAt = createdAt;
	}

	public java.lang.String getEmail_verified_at() {
		return this.email_verified_at;
	}

	public void setEmail_verified_at(java.lang.String email_verified_at) {
		this.email_verified_at = email_verified_at;
	}

	public java.lang.String getUpdated_at() {
		return this.updated_at;
	}

	public void setUpdated_at(java.lang.String updated_at) {
		this.updated_at = updated_at;
	}

	public usersData(java.lang.String name, java.lang.String firstName,
			java.lang.String email, java.lang.String telephone,
			java.lang.String password, java.lang.String adresse,
			java.lang.Boolean status, java.lang.String createdAt, char uuid,
			java.lang.String email_verified_at,
			java.lang.String remember_token, java.lang.String updated_at, int id) {
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
		this.adresse = adresse;
		this.status = status;
		this.createdAt = createdAt;
		this.uuid = uuid;
		this.email_verified_at = email_verified_at;
		this.remember_token = remember_token;
		this.updated_at = updated_at;
		this.id = id;
	}

}