package com.dojo.iv.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_veiculo")
public class VeiculoEntity {

  @Id
  private String registro;

  @Column(name = "tipo_veiculo", length = 50, nullable = false)
  private String tipoVeiculo;

  @Column(name = "valor", nullable = false)
  private BigDecimal valor;

  @Column(name = "qtde_rodas", nullable = false)
  private Integer quantidadeRodas;

  public String getRegistro() {
    return registro;
  }

  public void setRegistro(String registro) {
    this.registro = registro;
  }

  public String getTipoVeiculo() {
    return tipoVeiculo;
  }

  public void setTipoVeiculo(String tipoVeiculo) {
    this.tipoVeiculo = tipoVeiculo;
  }

  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public Integer getQuantidadeRodas() {
    return quantidadeRodas;
  }

  public void setQuantidadeRodas(Integer quantidadeRodas) {
    this.quantidadeRodas = quantidadeRodas;
  }
}
