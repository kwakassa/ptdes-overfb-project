
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_consulta_saldo_nsgd_s_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_consulta_saldo_nsgd_s_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTROLE" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_controle_nsgd_s_Type" minOccurs="0"/>
 *         &lt;element name="SALDOS" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_saldo_nsgd_s_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_consulta_saldo_nsgd_s_Type", propOrder = {
    "controle",
    "saldos"
})
public class DadosConsultaSaldoNsgdSType {

    @XmlElement(name = "CONTROLE")
    protected DadosControleNsgdSType controle;
    @XmlElement(name = "SALDOS")
    protected DadosSaldoNsgdSType saldos;

    /**
     * Obtém o valor da propriedade controle.
     * 
     * @return
     *     possible object is
     *     {@link DadosControleNsgdSType }
     *     
     */
    public DadosControleNsgdSType getCONTROLE() {
        return controle;
    }

    /**
     * Define o valor da propriedade controle.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosControleNsgdSType }
     *     
     */
    public void setCONTROLE(DadosControleNsgdSType value) {
        this.controle = value;
    }

    /**
     * Obtém o valor da propriedade saldos.
     * 
     * @return
     *     possible object is
     *     {@link DadosSaldoNsgdSType }
     *     
     */
    public DadosSaldoNsgdSType getSALDOS() {
        return saldos;
    }

    /**
     * Define o valor da propriedade saldos.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosSaldoNsgdSType }
     *     
     */
    public void setSALDOS(DadosSaldoNsgdSType value) {
        this.saldos = value;
    }

}
