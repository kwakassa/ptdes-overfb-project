
package br.gov.caixa.sibar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HEADER_BARRAMENTO_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="HEADER_BARRAMENTO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VERSAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AUTENTICACAO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USUARIO_SERVICO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USUARIO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OPERACAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INDICE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SISTEMA_ORIGEM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UNIDADE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDENTIFICADOR_ORIGEM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_HORA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ID_PROCESSO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HEADER_BARRAMENTO_TYPE", propOrder = {
    "versao",
    "autenticacao",
    "usuarioservico",
    "usuario",
    "operacao",
    "indice",
    "sistemaorigem",
    "unidade",
    "identificadororigem",
    "datahora",
    "idprocesso"
})
public class HEADERBARRAMENTOTYPE {

    @XmlElement(name = "VERSAO", required = true)
    protected String versao;
    @XmlElement(name = "AUTENTICACAO")
    protected String autenticacao;
    @XmlElement(name = "USUARIO_SERVICO")
    protected String usuarioservico;
    @XmlElement(name = "USUARIO")
    protected String usuario;
    @XmlElement(name = "OPERACAO", required = true)
    protected String operacao;
    @XmlElement(name = "INDICE")
    protected Integer indice;
    @XmlElement(name = "SISTEMA_ORIGEM")
    protected String sistemaorigem;
    @XmlElement(name = "UNIDADE")
    protected String unidade;
    @XmlElement(name = "IDENTIFICADOR_ORIGEM")
    protected String identificadororigem;
    @XmlElement(name = "DATA_HORA", required = true)
    protected String datahora;
    @XmlElement(name = "ID_PROCESSO")
    protected String idprocesso;

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSAO() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSAO(String value) {
        this.versao = value;
    }

    /**
     * Obtém o valor da propriedade autenticacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTENTICACAO() {
        return autenticacao;
    }

    /**
     * Define o valor da propriedade autenticacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTENTICACAO(String value) {
        this.autenticacao = value;
    }

    /**
     * Obtém o valor da propriedade usuarioservico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSUARIOSERVICO() {
        return usuarioservico;
    }

    /**
     * Define o valor da propriedade usuarioservico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSUARIOSERVICO(String value) {
        this.usuarioservico = value;
    }

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSUARIO() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSUARIO(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade operacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERACAO() {
        return operacao;
    }

    /**
     * Define o valor da propriedade operacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERACAO(String value) {
        this.operacao = value;
    }

    /**
     * Obtém o valor da propriedade indice.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getINDICE() {
        return indice;
    }

    /**
     * Define o valor da propriedade indice.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setINDICE(Integer value) {
        this.indice = value;
    }

    /**
     * Obtém o valor da propriedade sistemaorigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISTEMAORIGEM() {
        return sistemaorigem;
    }

    /**
     * Define o valor da propriedade sistemaorigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISTEMAORIGEM(String value) {
        this.sistemaorigem = value;
    }

    /**
     * Obtém o valor da propriedade unidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIDADE() {
        return unidade;
    }

    /**
     * Define o valor da propriedade unidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIDADE(String value) {
        this.unidade = value;
    }

    /**
     * Obtém o valor da propriedade identificadororigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICADORORIGEM() {
        return identificadororigem;
    }

    /**
     * Define o valor da propriedade identificadororigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICADORORIGEM(String value) {
        this.identificadororigem = value;
    }

    /**
     * Obtém o valor da propriedade datahora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAHORA() {
        return datahora;
    }

    /**
     * Define o valor da propriedade datahora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAHORA(String value) {
        this.datahora = value;
    }

    /**
     * Obtém o valor da propriedade idprocesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPROCESSO() {
        return idprocesso;
    }

    /**
     * Define o valor da propriedade idprocesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPROCESSO(String value) {
        this.idprocesso = value;
    }

}
