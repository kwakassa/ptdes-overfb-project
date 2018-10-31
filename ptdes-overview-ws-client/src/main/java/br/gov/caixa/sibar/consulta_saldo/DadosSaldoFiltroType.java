
package br.gov.caixa.sibar.consulta_saldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dados_saldo_filtro_Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dados_saldo_filtro_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="DISPONIVEL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="DISPONIVEL_SEM_LIMITE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="BLOQUEADO_24HORAS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="BLOQUEADO_48_72HORAS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="BLOQUEADO_INDETERMINADO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="BLOQUEADO_JUDICIAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="BLOQUEADO_FRAUDE_DIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="BLOQUEADO_TED_DEVOLVIDA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="BLOQUEADO_CONTA_ELETRONICA_SIMPLIFICADA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="VALOR_TOTAL_LIMITE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="VALOR_CPMF_EVENTUAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="POUPANCA_INTEGRADA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *           &lt;element name="TOTAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dados_saldo_filtro_Type", propOrder = {
    "disponivelOrDISPONIVELSEMLIMITEOrBLOQUEADO24HORAS"
})
public class DadosSaldoFiltroType {

    @XmlElementRefs({
        @XmlElementRef(name = "BLOQUEADO_48_72HORAS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VALOR_TOTAL_LIMITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BLOQUEADO_JUDICIAL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BLOQUEADO_INDETERMINADO", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BLOQUEADO_FRAUDE_DIA", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BLOQUEADO_CONTA_ELETRONICA_SIMPLIFICADA", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TOTAL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DISPONIVEL_SEM_LIMITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BLOQUEADO_24HORAS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DISPONIVEL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BLOQUEADO_TED_DEVOLVIDA", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "POUPANCA_INTEGRADA", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VALOR_CPMF_EVENTUAL", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<Object>> disponivelOrDISPONIVELSEMLIMITEOrBLOQUEADO24HORAS;

    /**
     * Gets the value of the disponivelOrDISPONIVELSEMLIMITEOrBLOQUEADO24HORAS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disponivelOrDISPONIVELSEMLIMITEOrBLOQUEADO24HORAS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDISPONIVELOrDISPONIVELSEMLIMITEOrBLOQUEADO24HORAS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getDISPONIVELOrDISPONIVELSEMLIMITEOrBLOQUEADO24HORAS() {
        if (disponivelOrDISPONIVELSEMLIMITEOrBLOQUEADO24HORAS == null) {
            disponivelOrDISPONIVELSEMLIMITEOrBLOQUEADO24HORAS = new ArrayList<JAXBElement<Object>>();
        }
        return this.disponivelOrDISPONIVELSEMLIMITEOrBLOQUEADO24HORAS;
    }

}
