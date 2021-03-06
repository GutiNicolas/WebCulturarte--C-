
package servicios;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceContUsusario", targetNamespace = "http://WebServices/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceContUsusario {


    /**
     * 
     * @param pass
     * @param nickUsuario
     * @return
     *     returns servicios.DtUsuarioWeb
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/usuarioLoginRequest", output = "http://WebServices/WebServiceContUsusario/usuarioLoginResponse")
    public DtUsuarioWeb usuarioLogin(
        @WebParam(name = "nickUsuario", partName = "nickUsuario")
        String nickUsuario,
        @WebParam(name = "pass", partName = "pass")
        String pass);

    /**
     * 
     * @param nickname
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/usuarioDesactivadoRequest", output = "http://WebServices/WebServiceContUsusario/usuarioDesactivadoResponse")
    public boolean usuarioDesactivado(
        @WebParam(name = "nickname", partName = "nickname")
        String nickname);

    /**
     * 
     */
    @WebMethod
    @Action(input = "http://WebServices/WebServiceContUsusario/publicarRequest", output = "http://WebServices/WebServiceContUsusario/publicarResponse")
    public void publicar();

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/despublicarRequest", output = "http://WebServices/WebServiceContUsusario/despublicarResponse")
    public boolean despublicar();

    /**
     * 
     * @param nick
     * @return
     *     returns servicios.DtUsuarioWeb
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/infoUsuarioGeneralRequest", output = "http://WebServices/WebServiceContUsusario/infoUsuarioGeneralResponse")
    public DtUsuarioWeb infoUsuarioGeneral(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @param nick
     * @return
     *     returns servicios.DtUsuarioWeb
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/usuarioLoginAppRequest", output = "http://WebServices/WebServiceContUsusario/usuarioLoginAppResponse")
    public DtUsuarioWeb usuarioLoginApp(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @return
     *     returns servicios.DtarregloDtUsuWeb
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/rankingRequest", output = "http://WebServices/WebServiceContUsusario/rankingResponse")
    public DtarregloDtUsuWeb ranking();

    /**
     * 
     * @param nick
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/dardebajaRequest", output = "http://WebServices/WebServiceContUsusario/dardebajaResponse")
    public boolean dardebaja(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/holaRequest", output = "http://WebServices/WebServiceContUsusario/holaResponse")
    public String hola();

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/cargarDatosPruebaRequest", output = "http://WebServices/WebServiceContUsusario/cargarDatosPruebaResponse")
    public boolean cargarDatosPrueba();

    /**
     * 
     * @param nick
     * @param correo
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/verificaExistenciaRequest", output = "http://WebServices/WebServiceContUsusario/verificaExistenciaResponse")
    public int verificaExistencia(
        @WebParam(name = "nick", partName = "nick")
        String nick,
        @WebParam(name = "correo", partName = "correo")
        String correo);

    /**
     * 
     * @param fecha
     * @return
     *     returns servicios.DtFechaWeb
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/crearDtFechaRequest", output = "http://WebServices/WebServiceContUsusario/crearDtFechaResponse")
    public DtFechaWeb crearDtFecha(
        @WebParam(name = "fecha", partName = "fecha")
        String fecha);

    /**
     * 
     * @param nick
     * @return
     *     returns servicios.DtContieneArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/listarUsuariosRequest", output = "http://WebServices/WebServiceContUsusario/listarUsuariosResponse")
    public DtContieneArray listarUsuarios(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @param nick
     * @return
     *     returns servicios.DtContieneArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/cargarLosSeguidosPorRequest", output = "http://WebServices/WebServiceContUsusario/cargarLosSeguidosPorResponse")
    public DtContieneArray cargarLosSeguidosPor(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @param nick
     * @return
     *     returns servicios.DtUsuarioWeb
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/usuarioLoginSNRequest", output = "http://WebServices/WebServiceContUsusario/usuarioLoginSNResponse")
    public DtUsuarioWeb usuarioLoginSN(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @param nick
     * @return
     *     returns servicios.DtContieneArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/cargarLosSegPorRequest", output = "http://WebServices/WebServiceContUsusario/cargarLosSegPorResponse")
    public DtContieneArray cargarLosSegPor(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @param nick
     * @return
     *     returns servicios.DtarregloDtUsuWeb
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/listarUsuariosWebRequest", output = "http://WebServices/WebServiceContUsusario/listarUsuariosWebResponse")
    public DtarregloDtUsuWeb listarUsuariosWeb(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @param nick
     * @return
     *     returns servicios.DtarregloDtUsuWeb
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/listarMisSeguidoresRequest", output = "http://WebServices/WebServiceContUsusario/listarMisSeguidoresResponse")
    public DtarregloDtUsuWeb listarMisSeguidores(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @param nick
     * @return
     *     returns servicios.DtarregloDtSigoAWEB
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/listarMisSeguidosRequest", output = "http://WebServices/WebServiceContUsusario/listarMisSeguidosResponse")
    public DtarregloDtSigoAWEB listarMisSeguidos(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @param nick
     * @return
     *     returns servicios.DtContieneArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/misPropFavRequest", output = "http://WebServices/WebServiceContUsusario/misPropFavResponse")
    public DtContieneArray misPropFav(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @param nick
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/existeUsuarioRequest", output = "http://WebServices/WebServiceContUsusario/existeUsuarioResponse")
    public boolean existeUsuario(
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @param usuario
     * @throws Exception_Exception
     */
    @WebMethod
    @Action(input = "http://WebServices/WebServiceContUsusario/agregarUsuRequest", output = "http://WebServices/WebServiceContUsusario/agregarUsuResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://WebServices/WebServiceContUsusario/agregarUsu/Fault/Exception")
    })
    public void agregarUsu(
        @WebParam(name = "usuario", partName = "usuario")
        DtUsuarioWeb usuario)
        throws Exception_Exception
    ;

    /**
     * 
     * @param nickSeguidor
     * @param nickDejardeSeguir
     * @throws Exception_Exception
     */
    @WebMethod
    @Action(input = "http://WebServices/WebServiceContUsusario/dejarDeSeguirRequest", output = "http://WebServices/WebServiceContUsusario/dejarDeSeguirResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://WebServices/WebServiceContUsusario/dejarDeSeguir/Fault/Exception")
    })
    public void dejarDeSeguir(
        @WebParam(name = "nickSeguidor", partName = "nickSeguidor")
        String nickSeguidor,
        @WebParam(name = "nickDejardeSeguir", partName = "nickDejardeSeguir")
        String nickDejardeSeguir)
        throws Exception_Exception
    ;

    /**
     * 
     * @param nickUsuSeguir
     * @param nickusuario
     * @throws Exception_Exception
     */
    @WebMethod
    @Action(input = "http://WebServices/WebServiceContUsusario/seguirRequest", output = "http://WebServices/WebServiceContUsusario/seguirResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://WebServices/WebServiceContUsusario/seguir/Fault/Exception")
    })
    public void seguir(
        @WebParam(name = "nickusuario", partName = "nickusuario")
        String nickusuario,
        @WebParam(name = "nickUsuSeguir", partName = "nickUsuSeguir")
        String nickUsuSeguir)
        throws Exception_Exception
    ;

    /**
     * 
     * @param titulo
     * @return
     *     returns servicios.DtPropuestaWeb
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://WebServices/WebServiceContUsusario/infoPropuestaRequest", output = "http://WebServices/WebServiceContUsusario/infoPropuestaResponse")
    public DtPropuestaWeb infoPropuesta(
        @WebParam(name = "titulo", partName = "titulo")
        String titulo);

}
