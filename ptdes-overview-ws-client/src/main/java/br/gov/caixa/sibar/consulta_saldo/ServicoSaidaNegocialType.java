
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.caixa.sibar.SERVICOSAIDATYPE;


/**
 * <p>Classe Java de servico_saida_negocial_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="servico_saida_negocial_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caixa.gov.br/sibar}SERVICO_SAIDA_TYPE">
 *       &lt;sequence>
 *         &lt;element name="DADOS" type="{http://caixa.gov.br/sibar/consulta_saldo}dados_saida_Type" minOccurs="0"/>
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
@XmlType(name = "servico_saida_negocial_Type", propOrder = {
    "dados"
})
public class ServicoSaidaNegocialType
    extends SERVICOSAIDATYPE
{

    @XmlElement(name = "DADOS")
    protected DadosSaidaType dados;

    /**
     * Obtém o valor da propriedade dados.
     * 
     * @return
     *     possible object is
     *     {@link DadosSaidaType }
     *     
     */
    public DadosSaidaType getDADOS() {
        return dados;
    }

    /**
     * Define o valor da propriedade dados.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosSaidaType }
     *     
     */
    public void setDADOS(DadosSaidaType value) {
        this.dados = value;
    }

}
