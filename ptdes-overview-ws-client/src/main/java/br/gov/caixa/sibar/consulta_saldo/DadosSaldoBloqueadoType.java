
package br.gov.caixa.sibar.consulta_saldo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_saldo_bloqueado_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_saldo_bloqueado_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TEMPO_24HORAS" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="TEMPO_48_72HORAS" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="TEMPO_INDETERMINADO" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="JUDICIAL" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="FRAUDE_DIA" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="SUAFI_TED_DEVOLVIDA" type="{http://caixa.gov.br/sibar/consulta_saldo}saldo_var_type" minOccurs="0"/>
 *         &lt;element name="CONTA_ELETRONICA_SIMPLIFICADA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999999.99"/>
 *               &lt;fractionDigits value="2"/>
 *               &lt;totalDigits value="14"/>
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
@XmlType(name = "dados_saldo_bloqueado_Type", propOrder = {
    "tempo24HORAS",
    "tempo4872HORAS",
    "tempoindeterminado",
    "judicial",
    "fraudedia",
    "suafiteddevolvida",
    "contaeletronicasimplificada"
})
public class DadosSaldoBloqueadoType {

    @XmlElement(name = "TEMPO_24HORAS", defaultValue = "0")
    protected BigDecimal tempo24HORAS;
    @XmlElement(name = "TEMPO_48_72HORAS", defaultValue = "0")
    protected BigDecimal tempo4872HORAS;
    @XmlElement(name = "TEMPO_INDETERMINADO", defaultValue = "0")
    protected BigDecimal tempoindeterminado;
    @XmlElement(name = "JUDICIAL", defaultValue = "0")
    protected BigDecimal judicial;
    @XmlElement(name = "FRAUDE_DIA", defaultValue = "0")
    protected BigDecimal fraudedia;
    @XmlElement(name = "SUAFI_TED_DEVOLVIDA", defaultValue = "0")
    protected BigDecimal suafiteddevolvida;
    @XmlElement(name = "CONTA_ELETRONICA_SIMPLIFICADA", defaultValue = "0")
    protected BigDecimal contaeletronicasimplificada;

    /**
     * Obtém o valor da propriedade tempo24HORAS.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTEMPO24HORAS() {
        return tempo24HORAS;
    }

    /**
     * Define o valor da propriedade tempo24HORAS.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTEMPO24HORAS(BigDecimal value) {
        this.tempo24HORAS = value;
    }

    /**
     * Obtém o valor da propriedade tempo4872HORAS.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTEMPO4872HORAS() {
        return tempo4872HORAS;
    }

    /**
     * Define o valor da propriedade tempo4872HORAS.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTEMPO4872HORAS(BigDecimal value) {
        this.tempo4872HORAS = value;
    }

    /**
     * Obtém o valor da propriedade tempoindeterminado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTEMPOINDETERMINADO() {
        return tempoindeterminado;
    }

    /**
     * Define o valor da propriedade tempoindeterminado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTEMPOINDETERMINADO(BigDecimal value) {
        this.tempoindeterminado = value;
    }

    /**
     * Obtém o valor da propriedade judicial.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJUDICIAL() {
        return judicial;
    }

    /**
     * Define o valor da propriedade judicial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJUDICIAL(BigDecimal value) {
        this.judicial = value;
    }

    /**
     * Obtém o valor da propriedade fraudedia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFRAUDEDIA() {
        return fraudedia;
    }

    /**
     * Define o valor da propriedade fraudedia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFRAUDEDIA(BigDecimal value) {
        this.fraudedia = value;
    }

    /**
     * Obtém o valor da propriedade suafiteddevolvida.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSUAFITEDDEVOLVIDA() {
        return suafiteddevolvida;
    }

    /**
     * Define o valor da propriedade suafiteddevolvida.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSUAFITEDDEVOLVIDA(BigDecimal value) {
        this.suafiteddevolvida = value;
    }

    /**
     * Obtém o valor da propriedade contaeletronicasimplificada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCONTAELETRONICASIMPLIFICADA() {
        return contaeletronicasimplificada;
    }

    /**
     * Define o valor da propriedade contaeletronicasimplificada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCONTAELETRONICASIMPLIFICADA(BigDecimal value) {
        this.contaeletronicasimplificada = value;
    }

}
