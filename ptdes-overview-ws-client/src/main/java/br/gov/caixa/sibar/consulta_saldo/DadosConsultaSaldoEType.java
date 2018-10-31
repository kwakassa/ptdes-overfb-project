
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_consulta_saldo_e_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_consulta_saldo_e_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTA" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_conta_Type"/>
 *         &lt;element name="OPERACAO_CONTABIL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FILTRO" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_filtro_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_consulta_saldo_e_Type", propOrder = {
    "conta",
    "operacaocontabil",
    "filtro"
})
public class DadosConsultaSaldoEType {

    @XmlElement(name = "CONTA", required = true)
    protected DadosContaType conta;
    @XmlElement(name = "OPERACAO_CONTABIL", defaultValue = "0")
    protected Short operacaocontabil;
    @XmlElement(name = "FILTRO")
    protected DadosFiltroType filtro;

    /**
     * Obtém o valor da propriedade conta.
     * 
     * @return
     *     possible object is
     *     {@link DadosContaType }
     *     
     */
    public DadosContaType getCONTA() {
        return conta;
    }

    /**
     * Define o valor da propriedade conta.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosContaType }
     *     
     */
    public void setCONTA(DadosContaType value) {
        this.conta = value;
    }

    /**
     * Obtém o valor da propriedade operacaocontabil.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOPERACAOCONTABIL() {
        return operacaocontabil;
    }

    /**
     * Define o valor da propriedade operacaocontabil.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOPERACAOCONTABIL(Short value) {
        this.operacaocontabil = value;
    }

    /**
     * Obtém o valor da propriedade filtro.
     * 
     * @return
     *     possible object is
     *     {@link DadosFiltroType }
     *     
     */
    public DadosFiltroType getFILTRO() {
        return filtro;
    }

    /**
     * Define o valor da propriedade filtro.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosFiltroType }
     *     
     */
    public void setFILTRO(DadosFiltroType value) {
        this.filtro = value;
    }

}
