
package br.gov.caixa.sibar.consulta_saldo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_saldo_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_saldo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DISPONIVEL" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="DISPONIVEL_SEM_LIMITE" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="BLOQUEADO" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_saldo_bloqueado_Type" minOccurs="0"/>
 *         &lt;element name="VALOR_TOTAL_LIMITE" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="VALOR_CPMF_EVENTUAL" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="POUPANCA_INTEGRADA" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="TOTAL" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="SITUACAO_SALDO" minOccurs="0">
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
@XmlType(name = "dados_saldo_Type", propOrder = {
    "disponivel",
    "disponivelsemlimite",
    "bloqueado",
    "valortotallimite",
    "valorcpmfeventual",
    "poupancaintegrada",
    "total",
    "situacaosaldo"
})
public class DadosSaldoType {

    @XmlElement(name = "DISPONIVEL")
    protected BigDecimal disponivel;
    @XmlElement(name = "DISPONIVEL_SEM_LIMITE")
    protected BigDecimal disponivelsemlimite;
    @XmlElement(name = "BLOQUEADO")
    protected DadosSaldoBloqueadoType bloqueado;
    @XmlElement(name = "VALOR_TOTAL_LIMITE", defaultValue = "0")
    protected BigDecimal valortotallimite;
    @XmlElement(name = "VALOR_CPMF_EVENTUAL", defaultValue = "0")
    protected BigDecimal valorcpmfeventual;
    @XmlElement(name = "POUPANCA_INTEGRADA", defaultValue = "0")
    protected BigDecimal poupancaintegrada;
    @XmlElement(name = "TOTAL", defaultValue = "0")
    protected BigDecimal total;
    @XmlElement(name = "SITUACAO_SALDO", defaultValue = "0")
    protected Short situacaosaldo;

    /**
     * Obtém o valor da propriedade disponivel.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDISPONIVEL() {
        return disponivel;
    }

    /**
     * Define o valor da propriedade disponivel.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDISPONIVEL(BigDecimal value) {
        this.disponivel = value;
    }

    /**
     * Obtém o valor da propriedade disponivelsemlimite.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDISPONIVELSEMLIMITE() {
        return disponivelsemlimite;
    }

    /**
     * Define o valor da propriedade disponivelsemlimite.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDISPONIVELSEMLIMITE(BigDecimal value) {
        this.disponivelsemlimite = value;
    }

    /**
     * Obtém o valor da propriedade bloqueado.
     * 
     * @return
     *     possible object is
     *     {@link DadosSaldoBloqueadoType }
     *     
     */
    public DadosSaldoBloqueadoType getBLOQUEADO() {
        return bloqueado;
    }

    /**
     * Define o valor da propriedade bloqueado.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosSaldoBloqueadoType }
     *     
     */
    public void setBLOQUEADO(DadosSaldoBloqueadoType value) {
        this.bloqueado = value;
    }

    /**
     * Obtém o valor da propriedade valortotallimite.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALORTOTALLIMITE() {
        return valortotallimite;
    }

    /**
     * Define o valor da propriedade valortotallimite.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALORTOTALLIMITE(BigDecimal value) {
        this.valortotallimite = value;
    }

    /**
     * Obtém o valor da propriedade valorcpmfeventual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVALORCPMFEVENTUAL() {
        return valorcpmfeventual;
    }

    /**
     * Define o valor da propriedade valorcpmfeventual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVALORCPMFEVENTUAL(BigDecimal value) {
        this.valorcpmfeventual = value;
    }

    /**
     * Obtém o valor da propriedade poupancaintegrada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPOUPANCAINTEGRADA() {
        return poupancaintegrada;
    }

    /**
     * Define o valor da propriedade poupancaintegrada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPOUPANCAINTEGRADA(BigDecimal value) {
        this.poupancaintegrada = value;
    }

    /**
     * Obtém o valor da propriedade total.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTAL() {
        return total;
    }

    /**
     * Define o valor da propriedade total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTAL(BigDecimal value) {
        this.total = value;
    }

    /**
     * Obtém o valor da propriedade situacaosaldo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSITUACAOSALDO() {
        return situacaosaldo;
    }

    /**
     * Define o valor da propriedade situacaosaldo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSITUACAOSALDO(Short value) {
        this.situacaosaldo = value;
    }

}
