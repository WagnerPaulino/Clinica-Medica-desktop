package com.clinicaMedica.domain;

public class Consulta {

	private int codigo_Prontuario;
	private String especialidade;
	private String diagnostico;
	private String exame;
	private String tratamento;
	private double sintomas;
	private String descricao;
	private double peso;
	private double altura;
	private int pressao;
	private String dtConsulta;
	private String dtRetorno;
	private double valorConsulta;
	
	private Recepcionista recepcionista;
	private Medico medico;

	public Consulta() {
	}

	public Consulta(int codigo_Prontuario, String especialidade, String diagnostico, String exame, String tratamento,
			double sintomas, String descricao, double peso, double altura, int pressao, String dtConsulta,
			String dtRetorno, double valorConsulta) {
		this.codigo_Prontuario = codigo_Prontuario;
		this.especialidade = especialidade;
		this.diagnostico = diagnostico;
		this.exame = exame;
		this.tratamento = tratamento;
		this.sintomas = sintomas;
		this.descricao = descricao;
		this.peso = peso;
		this.altura = altura;
		this.pressao = pressao;
		this.dtConsulta = dtConsulta;
		this.dtRetorno = dtRetorno;
		this.valorConsulta = valorConsulta;
	}

	public int getCodigo_Prontuario() {
		return codigo_Prontuario;
	}

	public void setCodigo_Prontuario(int codigo_Prontuario) {
		this.codigo_Prontuario = codigo_Prontuario;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getExame() {
		return exame;
	}

	public void setExame(String exame) {
		this.exame = exame;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	public double getSintomas() {
		return sintomas;
	}

	public void setSintomas(double sintomas) {
		this.sintomas = sintomas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPressao() {
		return pressao;
	}

	public void setPressao(int pressao) {
		this.pressao = pressao;
	}

	public String getDtConsulta() {
		return dtConsulta;
	}

	public void setDtConsulta(String dtConsulta) {
		this.dtConsulta = dtConsulta;
	}

	public String getDtRetorno() {
		return dtRetorno;
	}

	public void setDtRetorno(String dtRetorno) {
		this.dtRetorno = dtRetorno;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public Recepcionista getRecepcionista() {
		return recepcionista;
	}

	public void setRecepcionista(Recepcionista recepcionista) {
		this.recepcionista = recepcionista;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo_Prontuario;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		if (codigo_Prontuario != other.codigo_Prontuario)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Consulta [codigo_Prontuario=" + codigo_Prontuario + ", especialidade=" + especialidade
				+ ", diagnostico=" + diagnostico + ", exame=" + exame + ", tratamento=" + tratamento + ", sintomas="
				+ sintomas + ", descricao=" + descricao + ", peso=" + peso + ", altura=" + altura + ", pressao="
				+ pressao + ", dtConsulta=" + dtConsulta + ", dtRetorno=" + dtRetorno + ", valorConsulta="
				+ valorConsulta + ", recepcionista=" + recepcionista + ", medico=" + medico + "]";
	}

}