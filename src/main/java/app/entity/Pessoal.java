package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PESSOAL
 * @generated
 */
@Entity
@Table(name = "\"PESSOAL\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pessoal")
public class Pessoal implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome_user;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_criacao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data_criacao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_final", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data_final;

  /**
   * Construtor
   * @generated
   */
  public Pessoal(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Pessoal setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome_user
   * return nome_user
   * @generated
   */
  
  public java.lang.String getNome_user(){
    return this.nome_user;
  }

  /**
   * Define nome_user
   * @param nome_user nome_user
   * @generated
   */
  public Pessoal setNome_user(java.lang.String nome_user){
    this.nome_user = nome_user;
    return this;
  }

  /**
   * Obtém data_criacao
   * return data_criacao
   * @generated
   */
  
  public java.util.Date getData_criacao(){
    return this.data_criacao;
  }

  /**
   * Define data_criacao
   * @param data_criacao data_criacao
   * @generated
   */
  public Pessoal setData_criacao(java.util.Date data_criacao){
    this.data_criacao = data_criacao;
    return this;
  }

  /**
   * Obtém data_final
   * return data_final
   * @generated
   */
  
  public java.util.Date getData_final(){
    return this.data_final;
  }

  /**
   * Define data_final
   * @param data_final data_final
   * @generated
   */
  public Pessoal setData_final(java.util.Date data_final){
    this.data_final = data_final;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pessoal object = (Pessoal)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
