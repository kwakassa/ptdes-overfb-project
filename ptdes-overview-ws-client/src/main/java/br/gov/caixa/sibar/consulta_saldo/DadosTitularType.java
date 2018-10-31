
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_titular_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_titular_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPF_CNPJ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NIS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="-999999999999999"/>
 *               &lt;maxInclusive value="999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
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
@XmlType(name = "dados_titular_Type", propOrder = {
    "cpfcnpj",
    "nis",
    "nome"
})
public class DadosTitularType {

    @XmlElement(name = "CPF_CNPJ", defaultValue = "0")
    protected long cpfcnpj;
    @XmlElement(name = "NIS", defaultValue = "0")
    protected Long nis;
    @XmlElement(name = "NOME", required = true, defaultValue = " ")
    protected String nome;

    /**
     * Obtém o valor da propriedade cpfcnpj.
     * 
     */
    public long getCPFCNPJ() {
        return cpfcnpj;
    }

    /**
     * Define o valor da propriedade cpfcnpj.
     * 
     */
    public void setCPFCNPJ(long value) {
        this.cpfcnpj = value;
    }

    /**
     * Obtém o valor da propriedade nis.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNIS() {
        return nis;
    }

    /**
     * Define o valor da propriedade nis.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNIS(Long value) {
        this.nis = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOME() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOME(String value) {
        this.nome = value;
    }

}
