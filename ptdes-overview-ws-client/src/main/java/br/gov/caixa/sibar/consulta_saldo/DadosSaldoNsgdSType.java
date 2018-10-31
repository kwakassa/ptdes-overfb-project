
package br.gov.caixa.sibar.consulta_saldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_saldo_nsgd_s_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_saldo_nsgd_s_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TOTAL" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_saldo_total_cntl_s_Type" minOccurs="0"/>
 *         &lt;element name="CONTABIL" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_saldo_total_cntl_s_Type" minOccurs="0"/>
 *         &lt;element name="SALDO" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_lista_saldo_nsgd_s_Type" maxOccurs="999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_saldo_nsgd_s_Type", propOrder = {
    "total",
    "contabil",
    "saldo"
})
public class DadosSaldoNsgdSType {

    @XmlElement(name = "TOTAL")
    protected DadosSaldoTotalCntlSType total;
    @XmlElement(name = "CONTABIL")
    protected DadosSaldoTotalCntlSType contabil;
    @XmlElement(name = "SALDO")
    protected List<DadosListaSaldoNsgdSType> saldo;

    /**
     * Obtém o valor da propriedade total.
     * 
     * @return
     *     possible object is
     *     {@link DadosSaldoTotalCntlSType }
     *     
     */
    public DadosSaldoTotalCntlSType getTOTAL() {
        return total;
    }

    /**
     * Define o valor da propriedade total.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosSaldoTotalCntlSType }
     *     
     */
    public void setTOTAL(DadosSaldoTotalCntlSType value) {
        this.total = value;
    }

    /**
     * Obtém o valor da propriedade contabil.
     * 
     * @return
     *     possible object is
     *     {@link DadosSaldoTotalCntlSType }
     *     
     */
    public DadosSaldoTotalCntlSType getCONTABIL() {
        return contabil;
    }

    /**
     * Define o valor da propriedade contabil.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosSaldoTotalCntlSType }
     *     
     */
    public void setCONTABIL(DadosSaldoTotalCntlSType value) {
        this.contabil = value;
    }

    /**
     * Gets the value of the saldo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saldo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSALDO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosListaSaldoNsgdSType }
     * 
     * 
     */
    public List<DadosListaSaldoNsgdSType> getSALDO() {
        if (saldo == null) {
            saldo = new ArrayList<DadosListaSaldoNsgdSType>();
        }
        return this.saldo;
    }

}
