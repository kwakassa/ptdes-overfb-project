
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_cif_nsgd_e_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_cif_nsgd_e_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACAO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MODO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GRUPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SUBGRUPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SUBTIPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
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
@XmlType(name = "dados_cif_nsgd_e_Type", propOrder = {
    "acao",
    "modo",
    "grupo",
    "subgrupo",
    "tipo",
    "subtipo"
})
public class DadosCifNsgdEType {

    @XmlElement(name = "ACAO")
    protected short acao;
    @XmlElement(name = "MODO")
    protected short modo;
    @XmlElement(name = "GRUPO")
    protected short grupo;
    @XmlElement(name = "SUBGRUPO")
    protected short subgrupo;
    @XmlElement(name = "TIPO")
    protected short tipo;
    @XmlElement(name = "SUBTIPO")
    protected short subtipo;

    /**
     * Obtém o valor da propriedade acao.
     * 
     */
    public short getACAO() {
        return acao;
    }

    /**
     * Define o valor da propriedade acao.
     * 
     */
    public void setACAO(short value) {
        this.acao = value;
    }

    /**
     * Obtém o valor da propriedade modo.
     * 
     */
    public short getMODO() {
        return modo;
    }

    /**
     * Define o valor da propriedade modo.
     * 
     */
    public void setMODO(short value) {
        this.modo = value;
    }

    /**
     * Obtém o valor da propriedade grupo.
     * 
     */
    public short getGRUPO() {
        return grupo;
    }

    /**
     * Define o valor da propriedade grupo.
     * 
     */
    public void setGRUPO(short value) {
        this.grupo = value;
    }

    /**
     * Obtém o valor da propriedade subgrupo.
     * 
     */
    public short getSUBGRUPO() {
        return subgrupo;
    }

    /**
     * Define o valor da propriedade subgrupo.
     * 
     */
    public void setSUBGRUPO(short value) {
        this.subgrupo = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     */
    public short getTIPO() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     */
    public void setTIPO(short value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade subtipo.
     * 
     */
    public short getSUBTIPO() {
        return subtipo;
    }

    /**
     * Define o valor da propriedade subtipo.
     * 
     */
    public void setSUBTIPO(short value) {
        this.subtipo = value;
    }

}
