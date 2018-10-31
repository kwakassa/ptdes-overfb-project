
package br.gov.caixa.sibar.consulta_saldo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_correcao_nsu_nsgd_e_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_correcao_nsu_nsgd_e_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NSGD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ORIGEM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INTERMEDIARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999999999999999"/>
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
@XmlType(name = "dados_correcao_nsu_nsgd_e_Type", propOrder = {
    "nsgd",
    "origem",
    "intermediario"
})
public class DadosCorrecaoNsuNsgdEType {

    @XmlElement(name = "NSGD")
    protected int nsgd;
    @XmlElement(name = "ORIGEM", required = true)
    protected BigDecimal origem;
    @XmlElement(name = "INTERMEDIARIO", required = true)
    protected BigDecimal intermediario;

    /**
     * Obtém o valor da propriedade nsgd.
     * 
     */
    public int getNSGD() {
        return nsgd;
    }

    /**
     * Define o valor da propriedade nsgd.
     * 
     */
    public void setNSGD(int value) {
        this.nsgd = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getORIGEM() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setORIGEM(BigDecimal value) {
        this.origem = value;
    }

    /**
     * Obtém o valor da propriedade intermediario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTERMEDIARIO() {
        return intermediario;
    }

    /**
     * Define o valor da propriedade intermediario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTERMEDIARIO(BigDecimal value) {
        this.intermediario = value;
    }

}
