
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.caixa.sibar.DADOSSAIDATYPE;


/**
 * <p>Classe Java de dados_saida_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_saida_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar}DADOS_SAIDA_TYPE">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="CONSULTA_SALDO" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_consulta_saldo_s_Type" minOccurs="0"/>
 *           &lt;element name="CONSULTA_SALDO_NSGD" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_consulta_saldo_nsgd_s_Type" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_saida_Type", propOrder = {
    "consultasaldo",
    "consultasaldonsgd"
})
public class DadosSaidaType
    extends DADOSSAIDATYPE
{

    @XmlElement(name = "CONSULTA_SALDO")
    protected DadosConsultaSaldoSType consultasaldo;
    @XmlElement(name = "CONSULTA_SALDO_NSGD")
    protected DadosConsultaSaldoNsgdSType consultasaldonsgd;

    /**
     * Obtém o valor da propriedade consultasaldo.
     * 
     * @return
     *     possible object is
     *     {@link DadosConsultaSaldoSType }
     *     
     */
    public DadosConsultaSaldoSType getCONSULTASALDO() {
        return consultasaldo;
    }

    /**
     * Define o valor da propriedade consultasaldo.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosConsultaSaldoSType }
     *     
     */
    public void setCONSULTASALDO(DadosConsultaSaldoSType value) {
        this.consultasaldo = value;
    }

    /**
     * Obtém o valor da propriedade consultasaldonsgd.
     * 
     * @return
     *     possible object is
     *     {@link DadosConsultaSaldoNsgdSType }
     *     
     */
    public DadosConsultaSaldoNsgdSType getCONSULTASALDONSGD() {
        return consultasaldonsgd;
    }

    /**
     * Define o valor da propriedade consultasaldonsgd.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosConsultaSaldoNsgdSType }
     *     
     */
    public void setCONSULTASALDONSGD(DadosConsultaSaldoNsgdSType value) {
        this.consultasaldonsgd = value;
    }

}
