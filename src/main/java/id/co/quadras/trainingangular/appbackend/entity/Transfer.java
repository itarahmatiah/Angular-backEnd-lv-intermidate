package id.co.quadras.trainingangular.appbackend.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="transfer")
public class Transfer {
	@Id @GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	@NotNull
	@ManyToOne @JoinColumn(name ="id_rekening_sumber", nullable=false)
	private Rekening sumberRekening;
	@NotNull
	@ManyToOne @JoinColumn(name ="id_rekening_tujuan", nullable=false)
	private Rekening tujuanRekening;
	@NotNull @Min(1)
	private BigDecimal nilai;
	private String berita;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public Rekening getSumberRekening() {
		return sumberRekening;
	}
	public void setSumberRekening(Rekening sumberRekening) {
		this.sumberRekening = sumberRekening;
	}
	public Rekening getTujuanRekening() {
		return tujuanRekening;
	}
	public void setTujuanRekening(Rekening tujuanRekening) {
		this.tujuanRekening = tujuanRekening;
	}
	public BigDecimal getNilai() {
		return nilai;
	}
	public void setNilai(BigDecimal nilai) {
		this.nilai = nilai;
	}
	public String getBerita() {
		return berita;
	}
	public void setBerita(String berita) {
		this.berita = berita;
	}
	
	
}
