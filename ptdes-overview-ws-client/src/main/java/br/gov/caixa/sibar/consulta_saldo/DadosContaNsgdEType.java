
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_conta_nsgd_e_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_conta_nsgd_e_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UNIDADE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRODUTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DV">
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
@XmlType(name = "dados_conta_nsgd_e_Type", propOrder = {
    "unidade",
    "produto",
    "numero",
    "dv"
})
public class DadosContaNsgdEType {

    @XmlElement(name = "UNIDADE")
    protected int unidade;
    @XmlElement(name = "PRODUTO")
    protected short produto;
    @XmlElement(name = "NUMERO")
    protected long numero;
    @XmlElement(name = "DV")
    protected short dv;

    /**
     * Obtém o valor da propriedade unidade.
     * 
     */
    public int getUNIDADE() {
        return unidade;
    }

    /**
     * Define o valor da propriedade unidade.
     * 
     */
    public void setUNIDADE(int value) {
        this.unidade = value;
    }

    /**
     * Obtém o valor da propriedade produto.
     * 
     */
    public short getPRODUTO() {
        return produto;
    }

    /**
     * Define o valor da propriedade produto.
     * 
     */
    public void setPRODUTO(short value) {
        this.produto = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     */
    public long getNUMERO() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     */
    public void setNUMERO(long value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade dv.
     * 
     */
    public short getDV() {
        return dv;
    }

    /**
     * Define o valor da propriedade dv.
     * 
     */
    public void setDV(short value) {
        this.dv = value;
    }

}
