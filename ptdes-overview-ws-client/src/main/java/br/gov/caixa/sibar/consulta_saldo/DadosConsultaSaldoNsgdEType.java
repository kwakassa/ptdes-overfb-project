
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de dados_consulta_saldo_nsgd_e_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_consulta_saldo_nsgd_e_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA_MOVIMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CANAL" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_canal_nsgd_e_Type"/>
 *         &lt;element name="ORIGEM" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_origem_intermediario_e_Type"/>
 *         &lt;element name="CIF" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_cif_nsgd_e_Type"/>
 *         &lt;element name="CONTA" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_conta_nsgd_e_Type"/>
 *         &lt;element name="DOCUMENTO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AUTORIZADOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
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
@XmlType(name = "dados_consulta_saldo_nsgd_e_Type", propOrder = {
    "datamovimento",
    "canal",
    "origem",
    "cif",
    "conta",
    "documento",
    "autorizador"
})
public class DadosConsultaSaldoNsgdEType {

    @XmlElement(name = "DATA_MOVIMENTO", required = true)
    protected XMLGregorianCalendar datamovimento;
    @XmlElement(name = "CANAL", required = true)
    protected DadosCanalNsgdEType canal;
    @XmlElement(name = "ORIGEM", required = true)
    protected DadosOrigemIntermediarioEType origem;
    @XmlElement(name = "CIF", required = true)
    protected DadosCifNsgdEType cif;
    @XmlElement(name = "CONTA", required = true)
    protected DadosContaNsgdEType conta;
    @XmlElement(name = "DOCUMENTO")
    protected Integer documento;
    @XmlElement(name = "AUTORIZADOR")
    protected String autorizador;

    /**
     * Obtém o valor da propriedade datamovimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAMOVIMENTO() {
        return datamovimento;
    }

    /**
     * Define o valor da propriedade datamovimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAMOVIMENTO(XMLGregorianCalendar value) {
        this.datamovimento = value;
    }

    /**
     * Obtém o valor da propriedade canal.
     * 
     * @return
     *     possible object is
     *     {@link DadosCanalNsgdEType }
     *     
     */
    public DadosCanalNsgdEType getCANAL() {
        return canal;
    }

    /**
     * Define o valor da propriedade canal.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCanalNsgdEType }
     *     
     */
    public void setCANAL(DadosCanalNsgdEType value) {
        this.canal = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link DadosOrigemIntermediarioEType }
     *     
     */
    public DadosOrigemIntermediarioEType getORIGEM() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosOrigemIntermediarioEType }
     *     
     */
    public void setORIGEM(DadosOrigemIntermediarioEType value) {
        this.origem = value;
    }

    /**
     * Obtém o valor da propriedade cif.
     * 
     * @return
     *     possible object is
     *     {@link DadosCifNsgdEType }
     *     
     */
    public DadosCifNsgdEType getCIF() {
        return cif;
    }

    /**
     * Define o valor da propriedade cif.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCifNsgdEType }
     *     
     */
    public void setCIF(DadosCifNsgdEType value) {
        this.cif = value;
    }

    /**
     * Obtém o valor da propriedade conta.
     * 
     * @return
     *     possible object is
     *     {@link DadosContaNsgdEType }
     *     
     */
    public DadosContaNsgdEType getCONTA() {
        return conta;
    }

    /**
     * Define o valor da propriedade conta.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosContaNsgdEType }
     *     
     */
    public void setCONTA(DadosContaNsgdEType value) {
        this.conta = value;
    }

    /**
     * Obtém o valor da propriedade documento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDOCUMENTO() {
        return documento;
    }

    /**
     * Define o valor da propriedade documento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDOCUMENTO(Integer value) {
        this.documento = value;
    }

    /**
     * Obtém o valor da propriedade autorizador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTORIZADOR() {
        return autorizador;
    }

    /**
     * Define o valor da propriedade autorizador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTORIZADOR(String value) {
        this.autorizador = value;
    }

}
