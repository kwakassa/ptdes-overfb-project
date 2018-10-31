
package br.gov.caixa.sibar.consulta_saldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_filtro_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_filtro_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="SALDO" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_saldo_filtro_Type" minOccurs="0"/>
 *           &lt;element name="MARCAS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_filtro_Type", propOrder = {
    "saldoOrMARCAS"
})
public class DadosFiltroType {

    @XmlElements({
        @XmlElement(name = "SALDO", type = DadosSaldoFiltroType.class),
        @XmlElement(name = "MARCAS")
    })
    protected List<Object> saldoOrMARCAS;

    /**
     * Gets the value of the saldoOrMARCAS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saldoOrMARCAS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSALDOOrMARCAS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosSaldoFiltroType }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSALDOOrMARCAS() {
        if (saldoOrMARCAS == null) {
            saldoOrMARCAS = new ArrayList<Object>();
        }
        return this.saldoOrMARCAS;
    }

}
