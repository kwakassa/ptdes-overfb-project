
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de dados_correcao_nsgd_e_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_correcao_nsgd_e_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA_MOVIMENTO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSU" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_correcao_nsu_nsgd_e_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_correcao_nsgd_e_Type", propOrder = {
    "datamovimento",
    "nsu"
})
public class DadosCorrecaoNsgdEType {

    @XmlElement(name = "DATA_MOVIMENTO")
    protected XMLGregorianCalendar datamovimento;
    @XmlElement(name = "NSU")
    protected DadosCorrecaoNsuNsgdEType nsu;

    /**
     * Obtém o valor da propriedade datamovimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAMOVIMENTO() {
        return datamovimento;
    }

    /**
     * Define o valor da propriedade datamovimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAMOVIMENTO(XMLGregorianCalendar value) {
        this.datamovimento = value;
    }

    /**
     * Obtém o valor da propriedade nsu.
     * 
     * @return
     *     possible object is
     *     {@link DadosCorrecaoNsuNsgdEType }
     *     
     */
    public DadosCorrecaoNsuNsgdEType getNSU() {
        return nsu;
    }

    /**
     * Define o valor da propriedade nsu.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCorrecaoNsuNsgdEType }
     *     
     */
    public void setNSU(DadosCorrecaoNsuNsgdEType value) {
        this.nsu = value;
    }

}
