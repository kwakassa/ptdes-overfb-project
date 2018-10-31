
package br.gov.caixa.sibar;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mensagens_controle_negocial_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="mensagens_controle_negocial_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RETORNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTITUCIONAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INFORMATIVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TELA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MENSAGEM" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mensagens_controle_negocial_Type", propOrder = {
    "retorno",
    "institucional",
    "informativa",
    "tela",
    "mensagem"
})
public class MensagensControleNegocialType {

    @XmlElement(name = "RETORNO")
    protected String retorno;
    @XmlElement(name = "INSTITUCIONAL")
    protected String institucional;
    @XmlElement(name = "INFORMATIVA")
    protected String informativa;
    @XmlElement(name = "TELA")
    protected String tela;
    @XmlElement(name = "MENSAGEM")
    protected List<String> mensagem;

    /**
     * Obtém o valor da propriedade retorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETORNO() {
        return retorno;
    }

    /**
     * Define o valor da propriedade retorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETORNO(String value) {
        this.retorno = value;
    }

    /**
     * Obtém o valor da propriedade institucional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUCIONAL() {
        return institucional;
    }

    /**
     * Define o valor da propriedade institucional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUCIONAL(String value) {
        this.institucional = value;
    }

    /**
     * Obtém o valor da propriedade informativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFORMATIVA() {
        return informativa;
    }

    /**
     * Define o valor da propriedade informativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFORMATIVA(String value) {
        this.informativa = value;
    }

    /**
     * Obtém o valor da propriedade tela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELA() {
        return tela;
    }

    /**
     * Define o valor da propriedade tela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELA(String value) {
        this.tela = value;
    }

    /**
     * Gets the value of the mensagem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mensagem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMENSAGEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMENSAGEM() {
        if (mensagem == null) {
            mensagem = new ArrayList<String>();
        }
        return this.mensagem;
    }

}
