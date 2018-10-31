
package br.gov.caixa.sibar.consulta_saldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_marcas_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_marcas_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_MARCA" maxOccurs="75">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SITUACAO_MARCAS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
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
@XmlType(name = "dados_marcas_Type", propOrder = {
    "tipomarca",
    "situacaomarcas"
})
public class DadosMarcasType {

    @XmlElement(name = "TIPO_MARCA", required = true, defaultValue = " ")
    protected List<String> tipomarca;
    @XmlElement(name = "SITUACAO_MARCAS", defaultValue = "0")
    protected Short situacaomarcas;

    /**
     * Gets the value of the tipomarca property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipomarca property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIPOMARCA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTIPOMARCA() {
        if (tipomarca == null) {
            tipomarca = new ArrayList<String>();
        }
        return this.tipomarca;
    }

    /**
     * Obtém o valor da propriedade situacaomarcas.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSITUACAOMARCAS() {
        return situacaomarcas;
    }

    /**
     * Define o valor da propriedade situacaomarcas.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSITUACAOMARCAS(Short value) {
        this.situacaomarcas = value;
    }

}
