
package clientWsExo1;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AvisService", targetNamespace = "http://exo1.eval.interop.ensim.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AvisService {


    /**
     * 
     * @param note
     * @param refProduit
     * @param refFourniss
     * @param commentaire
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "enregistrerAvis", targetNamespace = "http://exo1.eval.interop.ensim.fr/", className = "clientWsExo1.EnregistrerAvis")
    @ResponseWrapper(localName = "enregistrerAvisResponse", targetNamespace = "http://exo1.eval.interop.ensim.fr/", className = "clientWsExo1.EnregistrerAvisResponse")
    @Action(input = "http://exo1.eval.interop.ensim.fr/AvisService/enregistrerAvisRequest", output = "http://exo1.eval.interop.ensim.fr/AvisService/enregistrerAvisResponse")
    public int enregistrerAvis(
        @WebParam(name = "refProduit", targetNamespace = "")
        String refProduit,
        @WebParam(name = "note", targetNamespace = "")
        int note,
        @WebParam(name = "commentaire", targetNamespace = "")
        String commentaire,
        @WebParam(name = "refFourniss", targetNamespace = "")
        String refFourniss);

    /**
     * 
     * @param refProduit
     * @return
     *     returns java.util.List<clientWsExo1.Avis>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerAvis", targetNamespace = "http://exo1.eval.interop.ensim.fr/", className = "clientWsExo1.ListerAvis")
    @ResponseWrapper(localName = "listerAvisResponse", targetNamespace = "http://exo1.eval.interop.ensim.fr/", className = "clientWsExo1.ListerAvisResponse")
    @Action(input = "http://exo1.eval.interop.ensim.fr/AvisService/listerAvisRequest", output = "http://exo1.eval.interop.ensim.fr/AvisService/listerAvisResponse")
    public List<Avis> listerAvis(
        @WebParam(name = "refProduit", targetNamespace = "")
        String refProduit);

}