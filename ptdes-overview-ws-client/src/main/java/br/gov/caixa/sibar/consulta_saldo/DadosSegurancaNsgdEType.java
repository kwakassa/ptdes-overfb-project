
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_seguranca_nsgd_e_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_seguranca_nsgd_e_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SISTEMA_SOLICITANTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CHAVE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="136"/>
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
@XmlType(name = "dados_seguranca_nsgd_e_Type", propOrder = {
    "sistemasolicitante",
    "chave"
})
public class DadosSegurancaNsgdEType {

    @XmlElement(name = "SISTEMA_SOLICITANTE")
    protected String sistemasolicitante;
    @XmlElement(name = "CHAVE")
    protected String chave;

    /**
     * Obtém o valor da propriedade sistemasolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISTEMASOLICITANTE() {
        return sistemasolicitante;
    }

    /**
     * Define o valor da propriedade sistemasolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISTEMASOLICITANTE(String value) {
        this.sistemasolicitante = value;
    }

    /**
     * Obtém o valor da propriedade chave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHAVE() {
        return chave;
    }

    /**
     * Define o valor da propriedade chave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHAVE(String value) {
        this.chave = value;
    }

}
