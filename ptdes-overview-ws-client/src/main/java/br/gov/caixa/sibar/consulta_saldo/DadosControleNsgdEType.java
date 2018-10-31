
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_controle_nsgd_e_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_controle_nsgd_e_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPO_PESQUISA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *               &lt;enumeration value="AUTORIZACAO_EMISSAO_EXTRATO"/>
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
@XmlType(name = "dados_controle_nsgd_e_Type", propOrder = {
    "tipopesquisa"
})
public class DadosControleNsgdEType {

    @XmlElement(name = "TIPO_PESQUISA", required = true)
    protected String tipopesquisa;

    /**
     * Obtém o valor da propriedade tipopesquisa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPESQUISA() {
        return tipopesquisa;
    }

    /**
     * Define o valor da propriedade tipopesquisa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPESQUISA(String value) {
        this.tipopesquisa = value;
    }

}
