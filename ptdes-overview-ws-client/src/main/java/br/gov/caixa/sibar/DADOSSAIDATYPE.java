
package br.gov.caixa.sibar;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import br.gov.caixa.sibar.consulta_saldo.DadosSaidaType;


/**
 * <p>Classe Java de DADOS_SAIDA_TYPE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DADOS_SAIDA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTROLE_NEGOCIAL" type="{http://caixa.gov.br/sibar}CONTROLE_NEGOCIAL_TYPE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EXCECAO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5000"/>
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
@XmlType(name = "DADOS_SAIDA_TYPE", propOrder = {
    "controlenegocial",
    "excecao"
})
@XmlSeeAlso({
    DadosSaidaType.class
})
public class DADOSSAIDATYPE {

    @XmlElement(name = "CONTROLE_NEGOCIAL")
    protected List<CONTROLENEGOCIALTYPE> controlenegocial;
    @XmlElement(name = "EXCECAO")
    protected String excecao;

    /**
     * Gets the value of the controlenegocial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlenegocial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTROLENEGOCIAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CONTROLENEGOCIALTYPE }
     * 
     * 
     */
    public List<CONTROLENEGOCIALTYPE> getCONTROLENEGOCIAL() {
        if (controlenegocial == null) {
            controlenegocial = new ArrayList<CONTROLENEGOCIALTYPE>();
        }
        return this.controlenegocial;
    }

    /**
     * Obtém o valor da propriedade excecao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCECAO() {
        return excecao;
    }

    /**
     * Define o valor da propriedade excecao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCECAO(String value) {
        this.excecao = value;
    }

}
