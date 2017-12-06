package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiByteHeaderSignature;


/**
 * Classe que representa a tabela ARQUIVOS
 * @generated teedfgdfg
 */
@Entity
@Table(name = "\"ARQUIVOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Arquivos")
public class Arquivos implements Serializable {

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
  @Column(name = "nome_arq", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome_arq;

  /**
  * @generated
  */
  @Column(name = "imagem", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] imagem;

  /**
  * @generated
  */
  @Column(name = "file", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] file;

  /**
   * Construtor
   * @generated
   */
  public Arquivos(){
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
  public Arquivos setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome_arq
   * return nome_arq
   * @generated
   */
  
  public java.lang.String getNome_arq(){
    return this.nome_arq;
  }

  /**
   * Define nome_arq
   * @param nome_arq nome_arq
   * @generated
   */
  public Arquivos setNome_arq(java.lang.String nome_arq){
    this.nome_arq = nome_arq;
    return this;
  }

  /**
   * Obtém imagem
   * return imagem
   * @generated
   */
  
  public byte[] getImagem(){
    return this.imagem;
  }

  /**
   * Define imagem
   * @param imagem imagem
   * @generated
   */
  public Arquivos setImagem(byte[] imagem){
    this.imagem = imagem;
    return this;
  }

  /**
   * Obtém file
   * return file
   * @generated
   */
  
  public byte[] getFile(){
    return this.file;
  }

  /**
   * Define file
   * @param file file
   * @generated
   */
  public Arquivos setFile(byte[] file){
    this.file = file;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Arquivos object = (Arquivos)obj;
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
