
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_controle_nsgd_s_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_controle_nsgd_s_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRANSACAO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AUTORIZACAO" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_cntl_autorizacao_s_Type" minOccurs="0"/>
 *         &lt;element name="CONTINUACAO" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_cntl_continuacao_s_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_controle_nsgd_s_Type", propOrder = {
    "transacao",
    "autorizacao",
    "continuacao"
})
public class DadosControleNsgdSType {

    @XmlElement(name = "TRANSACAO")
    protected String transacao;
    @XmlElement(name = "AUTORIZACAO")
    protected DadosCntlAutorizacaoSType autorizacao;
    @XmlElement(name = "CONTINUACAO")
    protected DadosCntlContinuacaoSType continuacao;

    /**
     * Obtém o valor da propriedade transacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACAO() {
        return transacao;
    }

    /**
     * Define o valor da propriedade transacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACAO(String value) {
        this.transacao = value;
    }

    /**
     * Obtém o valor da propriedade autorizacao.
     * 
     * @return
     *     possible object is
     *     {@link DadosCntlAutorizacaoSType }
     *     
     */
    public DadosCntlAutorizacaoSType getAUTORIZACAO() {
        return autorizacao;
    }

    /**
     * Define o valor da propriedade autorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCntlAutorizacaoSType }
     *     
     */
    public void setAUTORIZACAO(DadosCntlAutorizacaoSType value) {
        this.autorizacao = value;
    }

    /**
     * Obtém o valor da propriedade continuacao.
     * 
     * @return
     *     possible object is
     *     {@link DadosCntlContinuacaoSType }
     *     
     */
    public DadosCntlContinuacaoSType getCONTINUACAO() {
        return continuacao;
    }

    /**
     * Define o valor da propriedade continuacao.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCntlContinuacaoSType }
     *     
     */
    public void setCONTINUACAO(DadosCntlContinuacaoSType value) {
        this.continuacao = value;
    }

}
