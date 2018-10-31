
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_conta_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_conta_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGENCIA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OPERACAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999"/>
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
@XmlType(name = "dados_conta_Type", propOrder = {
    "agencia",
    "operacao",
    "numero",
    "dv"
})
public class DadosContaType {

    @XmlElement(name = "AGENCIA", defaultValue = "0")
    protected short agencia;
    @XmlElement(name = "OPERACAO", defaultValue = "0")
    protected short operacao;
    @XmlElement(name = "NUMERO", defaultValue = "0")
    protected int numero;
    @XmlElement(name = "DV", defaultValue = "0")
    protected short dv;

    /**
     * Obtém o valor da propriedade agencia.
     * 
     */
    public short getAGENCIA() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     */
    public void setAGENCIA(short value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade operacao.
     * 
     */
    public short getOPERACAO() {
        return operacao;
    }

    /**
     * Define o valor da propriedade operacao.
     * 
     */
    public void setOPERACAO(short value) {
        this.operacao = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     */
    public int getNUMERO() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     */
    public void setNUMERO(int value) {
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
