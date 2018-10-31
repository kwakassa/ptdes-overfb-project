
package br.gov.caixa.sibar.consulta_saldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_titulares_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_titulares_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TITULAR" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_titular_Type" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_titulares_Type", propOrder = {
    "titular"
})
public class DadosTitularesType {

    @XmlElement(name = "TITULAR", required = true)
    protected List<DadosTitularType> titular;

    /**
     * Gets the value of the titular property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titular property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTITULAR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosTitularType }
     * 
     * 
     */
    public List<DadosTitularType> getTITULAR() {
        if (titular == null) {
            titular = new ArrayList<DadosTitularType>();
        }
        return this.titular;
    }

}
