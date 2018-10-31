
package br.gov.caixa.sibar.consulta_saldo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.caixa.sibar.consulta_saldo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SERVICOENTRADA_QNAME = new QName("http://caixa.gov.br/sibar/consulta_saldo", "SERVICO_ENTRADA");
    private final static QName _SERVICOSAIDA_QNAME = new QName("http://caixa.gov.br/sibar/consulta_saldo", "SERVICO_SAIDA");
    private final static QName _DadosSaldoFiltroTypeTOTAL_QNAME = new QName("", "TOTAL");
    private final static QName _DadosSaldoFiltroTypeDISPONIVEL_QNAME = new QName("", "DISPONIVEL");
    private final static QName _DadosSaldoFiltroTypeBLOQUEADO24HORAS_QNAME = new QName("", "BLOQUEADO_24HORAS");
    private final static QName _DadosSaldoFiltroTypeDISPONIVELSEMLIMITE_QNAME = new QName("", "DISPONIVEL_SEM_LIMITE");
    private final static QName _DadosSaldoFiltroTypePOUPANCAINTEGRADA_QNAME = new QName("", "POUPANCA_INTEGRADA");
    private final static QName _DadosSaldoFiltroTypeVALORTOTALLIMITE_QNAME = new QName("", "VALOR_TOTAL_LIMITE");
    private final static QName _DadosSaldoFiltroTypeBLOQUEADOTEDDEVOLVIDA_QNAME = new QName("", "BLOQUEADO_TED_DEVOLVIDA");
    private final static QName _DadosSaldoFiltroTypeBLOQUEADOINDETERMINADO_QNAME = new QName("", "BLOQUEADO_INDETERMINADO");
    private final static QName _DadosSaldoFiltroTypeBLOQUEADOCONTAELETRONICASIMPLIFICADA_QNAME = new QName("", "BLOQUEADO_CONTA_ELETRONICA_SIMPLIFICADA");
    private final static QName _DadosSaldoFiltroTypeBLOQUEADO4872HORAS_QNAME = new QName("", "BLOQUEADO_48_72HORAS");
    private final static QName _DadosSaldoFiltroTypeBLOQUEADOFRAUDEDIA_QNAME = new QName("", "BLOQUEADO_FRAUDE_DIA");
    private final static QName _DadosSaldoFiltroTypeVALORCPMFEVENTUAL_QNAME = new QName("", "VALOR_CPMF_EVENTUAL");
    private final static QName _DadosSaldoFiltroTypeBLOQUEADOJUDICIAL_QNAME = new QName("", "BLOQUEADO_JUDICIAL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.caixa.sibar.consulta_saldo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServicoEntradaNegocialType }
     * 
     */
    public ServicoEntradaNegocialType createServicoEntradaNegocialType() {
        return new ServicoEntradaNegocialType();
    }

    /**
     * Create an instance of {@link ServicoSaidaNegocialType }
     * 
     */
    public ServicoSaidaNegocialType createServicoSaidaNegocialType() {
        return new ServicoSaidaNegocialType();
    }

    /**
     * Create an instance of {@link DadosSaldoNsgdSType }
     * 
     */
    public DadosSaldoNsgdSType createDadosSaldoNsgdSType() {
        return new DadosSaldoNsgdSType();
    }

    /**
     * Create an instance of {@link DadosConsultaSaldoEType }
     * 
     */
    public DadosConsultaSaldoEType createDadosConsultaSaldoEType() {
        return new DadosConsultaSaldoEType();
    }

    /**
     * Create an instance of {@link DadosCorrecaoNsuNsgdEType }
     * 
     */
    public DadosCorrecaoNsuNsgdEType createDadosCorrecaoNsuNsgdEType() {
        return new DadosCorrecaoNsuNsgdEType();
    }

    /**
     * Create an instance of {@link DadosConsultaSaldoNsgdSType }
     * 
     */
    public DadosConsultaSaldoNsgdSType createDadosConsultaSaldoNsgdSType() {
        return new DadosConsultaSaldoNsgdSType();
    }

    /**
     * Create an instance of {@link DadosConsultaSaldoNsgdEType }
     * 
     */
    public DadosConsultaSaldoNsgdEType createDadosConsultaSaldoNsgdEType() {
        return new DadosConsultaSaldoNsgdEType();
    }

    /**
     * Create an instance of {@link DadosSaldoBloqueadoType }
     * 
     */
    public DadosSaldoBloqueadoType createDadosSaldoBloqueadoType() {
        return new DadosSaldoBloqueadoType();
    }

    /**
     * Create an instance of {@link DadosListaSaldoNsgdSType }
     * 
     */
    public DadosListaSaldoNsgdSType createDadosListaSaldoNsgdSType() {
        return new DadosListaSaldoNsgdSType();
    }

    /**
     * Create an instance of {@link DadosCanalNsgdEType }
     * 
     */
    public DadosCanalNsgdEType createDadosCanalNsgdEType() {
        return new DadosCanalNsgdEType();
    }

    /**
     * Create an instance of {@link DadosOrigemIntermediarioEType }
     * 
     */
    public DadosOrigemIntermediarioEType createDadosOrigemIntermediarioEType() {
        return new DadosOrigemIntermediarioEType();
    }

    /**
     * Create an instance of {@link DadosConsultaSaldoSType }
     * 
     */
    public DadosConsultaSaldoSType createDadosConsultaSaldoSType() {
        return new DadosConsultaSaldoSType();
    }

    /**
     * Create an instance of {@link DadosContaNsgdEType }
     * 
     */
    public DadosContaNsgdEType createDadosContaNsgdEType() {
        return new DadosContaNsgdEType();
    }

    /**
     * Create an instance of {@link DadosControleNsgdEType }
     * 
     */
    public DadosControleNsgdEType createDadosControleNsgdEType() {
        return new DadosControleNsgdEType();
    }

    /**
     * Create an instance of {@link DadosTitularesType }
     * 
     */
    public DadosTitularesType createDadosTitularesType() {
        return new DadosTitularesType();
    }

    /**
     * Create an instance of {@link DadosFiltroType }
     * 
     */
    public DadosFiltroType createDadosFiltroType() {
        return new DadosFiltroType();
    }

    /**
     * Create an instance of {@link DadosSaldoTotalCntlSType }
     * 
     */
    public DadosSaldoTotalCntlSType createDadosSaldoTotalCntlSType() {
        return new DadosSaldoTotalCntlSType();
    }

    /**
     * Create an instance of {@link DadosSaldoType }
     * 
     */
    public DadosSaldoType createDadosSaldoType() {
        return new DadosSaldoType();
    }

    /**
     * Create an instance of {@link DadosSaldoFiltroType }
     * 
     */
    public DadosSaldoFiltroType createDadosSaldoFiltroType() {
        return new DadosSaldoFiltroType();
    }

    /**
     * Create an instance of {@link DadosCntlContinuacaoSType }
     * 
     */
    public DadosCntlContinuacaoSType createDadosCntlContinuacaoSType() {
        return new DadosCntlContinuacaoSType();
    }

    /**
     * Create an instance of {@link DadosMarcasType }
     * 
     */
    public DadosMarcasType createDadosMarcasType() {
        return new DadosMarcasType();
    }

    /**
     * Create an instance of {@link DadosEntradaType }
     * 
     */
    public DadosEntradaType createDadosEntradaType() {
        return new DadosEntradaType();
    }

    /**
     * Create an instance of {@link DadosSaidaType }
     * 
     */
    public DadosSaidaType createDadosSaidaType() {
        return new DadosSaidaType();
    }

    /**
     * Create an instance of {@link DadosSegurancaNsgdEType }
     * 
     */
    public DadosSegurancaNsgdEType createDadosSegurancaNsgdEType() {
        return new DadosSegurancaNsgdEType();
    }

    /**
     * Create an instance of {@link DadosCntlAutorizacaoSType }
     * 
     */
    public DadosCntlAutorizacaoSType createDadosCntlAutorizacaoSType() {
        return new DadosCntlAutorizacaoSType();
    }

    /**
     * Create an instance of {@link DadosCifNsgdEType }
     * 
     */
    public DadosCifNsgdEType createDadosCifNsgdEType() {
        return new DadosCifNsgdEType();
    }

    /**
     * Create an instance of {@link DadosCorrecaoNsgdEType }
     * 
     */
    public DadosCorrecaoNsgdEType createDadosCorrecaoNsgdEType() {
        return new DadosCorrecaoNsgdEType();
    }

    /**
     * Create an instance of {@link DadosContaType }
     * 
     */
    public DadosContaType createDadosContaType() {
        return new DadosContaType();
    }

    /**
     * Create an instance of {@link DadosPeriodoNsgdEType }
     * 
     */
    public DadosPeriodoNsgdEType createDadosPeriodoNsgdEType() {
        return new DadosPeriodoNsgdEType();
    }

    /**
     * Create an instance of {@link DadosControleNsgdSType }
     * 
     */
    public DadosControleNsgdSType createDadosControleNsgdSType() {
        return new DadosControleNsgdSType();
    }

    /**
     * Create an instance of {@link DadosTitularType }
     * 
     */
    public DadosTitularType createDadosTitularType() {
        return new DadosTitularType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicoEntradaNegocialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caixa.gov.br/sibar/consulta_saldo", name = "SERVICO_ENTRADA")
    public JAXBElement<ServicoEntradaNegocialType> createSERVICOENTRADA(ServicoEntradaNegocialType value) {
        return new JAXBElement<ServicoEntradaNegocialType>(_SERVICOENTRADA_QNAME, ServicoEntradaNegocialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicoSaidaNegocialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://caixa.gov.br/sibar/consulta_saldo", name = "SERVICO_SAIDA")
    public JAXBElement<ServicoSaidaNegocialType> createSERVICOSAIDA(ServicoSaidaNegocialType value) {
        return new JAXBElement<ServicoSaidaNegocialType>(_SERVICOSAIDA_QNAME, ServicoSaidaNegocialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOTAL", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeTOTAL(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeTOTAL_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DISPONIVEL", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeDISPONIVEL(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeDISPONIVEL_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BLOQUEADO_24HORAS", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeBLOQUEADO24HORAS(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeBLOQUEADO24HORAS_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DISPONIVEL_SEM_LIMITE", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeDISPONIVELSEMLIMITE(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeDISPONIVELSEMLIMITE_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POUPANCA_INTEGRADA", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypePOUPANCAINTEGRADA(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypePOUPANCAINTEGRADA_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VALOR_TOTAL_LIMITE", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeVALORTOTALLIMITE(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeVALORTOTALLIMITE_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BLOQUEADO_TED_DEVOLVIDA", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeBLOQUEADOTEDDEVOLVIDA(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeBLOQUEADOTEDDEVOLVIDA_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BLOQUEADO_INDETERMINADO", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeBLOQUEADOINDETERMINADO(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeBLOQUEADOINDETERMINADO_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BLOQUEADO_CONTA_ELETRONICA_SIMPLIFICADA", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeBLOQUEADOCONTAELETRONICASIMPLIFICADA(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeBLOQUEADOCONTAELETRONICASIMPLIFICADA_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BLOQUEADO_48_72HORAS", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeBLOQUEADO4872HORAS(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeBLOQUEADO4872HORAS_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BLOQUEADO_FRAUDE_DIA", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeBLOQUEADOFRAUDEDIA(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeBLOQUEADOFRAUDEDIA_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VALOR_CPMF_EVENTUAL", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeVALORCPMFEVENTUAL(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeVALORCPMFEVENTUAL_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BLOQUEADO_JUDICIAL", scope = DadosSaldoFiltroType.class)
    public JAXBElement<Object> createDadosSaldoFiltroTypeBLOQUEADOJUDICIAL(Object value) {
        return new JAXBElement<Object>(_DadosSaldoFiltroTypeBLOQUEADOJUDICIAL_QNAME, Object.class, DadosSaldoFiltroType.class, value);
    }

}
