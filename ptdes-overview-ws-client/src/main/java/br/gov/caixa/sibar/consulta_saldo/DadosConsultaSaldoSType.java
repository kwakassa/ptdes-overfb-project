
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_consulta_saldo_s_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_consulta_saldo_s_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TITULARES" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_titulares_Type" minOccurs="0"/>
 *         &lt;element name="SALDO" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_saldo_Type" minOccurs="0"/>
 *         &lt;element name="MARCAS" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_marcas_Type" minOccurs="0"/>
 *         &lt;element name="TIPO_CONTA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9"/>
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
@XmlType(name = "dados_consulta_saldo_s_Type", propOrder = {
    "titulares",
    "saldo",
    "marcas",
    "tipoconta"
})
public class DadosConsultaSaldoSType {

    @XmlElement(name = "TITULARES")
    protected DadosTitularesType titulares;
    @XmlElement(name = "SALDO")
    protected DadosSaldoType saldo;
    @XmlElement(name = "MARCAS")
    protected DadosMarcasType marcas;
    @XmlElement(name = "TIPO_CONTA", defaultValue = "0")
    protected Short tipoconta;

    /**
     * Obtém o valor da propriedade titulares.
     * 
     * @return
     *     possible object is
     *     {@link DadosTitularesType }
     *     
     */
    public DadosTitularesType getTITULARES() {
        return titulares;
    }

    /**
     * Define o valor da propriedade titulares.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosTitularesType }
     *     
     */
    public void setTITULARES(DadosTitularesType value) {
        this.titulares = value;
    }

    /**
     * Obtém o valor da propriedade saldo.
     * 
     * @return
     *     possible object is
     *     {@link DadosSaldoType }
     *     
     */
    public DadosSaldoType getSALDO() {
        return saldo;
    }

    /**
     * Define o valor da propriedade saldo.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosSaldoType }
     *     
     */
    public void setSALDO(DadosSaldoType value) {
        this.saldo = value;
    }

    /**
     * Obtém o valor da propriedade marcas.
     * 
     * @return
     *     possible object is
     *     {@link DadosMarcasType }
     *     
     */
    public DadosMarcasType getMARCAS() {
        return marcas;
    }

    /**
     * Define o valor da propriedade marcas.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosMarcasType }
     *     
     */
    public void setMARCAS(DadosMarcasType value) {
        this.marcas = value;
    }

    /**
     * Obtém o valor da propriedade tipoconta.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTIPOCONTA() {
        return tipoconta;
    }

    /**
     * Define o valor da propriedade tipoconta.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTIPOCONTA(Short value) {
        this.tipoconta = value;
    }

}
