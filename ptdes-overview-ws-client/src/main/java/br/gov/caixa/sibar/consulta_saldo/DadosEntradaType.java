
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_entrada_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_entrada_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CONSULTA_SALDO" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_consulta_saldo_e_Type"/>
 *           &lt;element name="CONSULTA_SALDO_NSGD" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_consulta_saldo_nsgd_e_Type"/>
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
@XmlType(name = "dados_entrada_Type", propOrder = {
    "consultasaldo",
    "consultasaldonsgd"
})
public class DadosEntradaType {

    @XmlElement(name = "CONSULTA_SALDO")
    protected DadosConsultaSaldoEType consultasaldo;
    @XmlElement(name = "CONSULTA_SALDO_NSGD")
    protected DadosConsultaSaldoNsgdEType consultasaldonsgd;

    /**
     * Obtém o valor da propriedade consultasaldo.
     * 
     * @return
     *     possible object is
     *     {@link DadosConsultaSaldoEType }
     *     
     */
    public DadosConsultaSaldoEType getCONSULTASALDO() {
        return consultasaldo;
    }

    /**
     * Define o valor da propriedade consultasaldo.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosConsultaSaldoEType }
     *     
     */
    public void setCONSULTASALDO(DadosConsultaSaldoEType value) {
        this.consultasaldo = value;
    }

    /**
     * Obtém o valor da propriedade consultasaldonsgd.
     * 
     * @return
     *     possible object is
     *     {@link DadosConsultaSaldoNsgdEType }
     *     
     */
    public DadosConsultaSaldoNsgdEType getCONSULTASALDONSGD() {
        return consultasaldonsgd;
    }

    /**
     * Define o valor da propriedade consultasaldonsgd.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosConsultaSaldoNsgdEType }
     *     
     */
    public void setCONSULTASALDONSGD(DadosConsultaSaldoNsgdEType value) {
        this.consultasaldonsgd = value;
    }

}
