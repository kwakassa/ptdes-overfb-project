
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.caixa.sibar.SERVICOENTRADATYPE;


/**
 * <p>Classe Java de servico_entrada_negocial_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="servico_entrada_negocial_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar}SERVICO_ENTRADA_TYPE">
 *       &lt;sequence>
 *         &lt;element name="DADOS" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_entrada_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servico_entrada_negocial_Type", propOrder = {
    "dados"
})
public class ServicoEntradaNegocialType
    extends SERVICOENTRADATYPE
{

    @XmlElement(name = "DADOS", required = true)
    protected DadosEntradaType dados;

    /**
     * Obtém o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link DadosEntradaType }
     *     
     */
    public DadosEntradaType getDADOS() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosEntradaType }
     *     
     */
    public void setDADOS(DadosEntradaType value) {
        this.dados = value;
    }

}
