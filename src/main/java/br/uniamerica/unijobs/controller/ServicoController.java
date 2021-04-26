package br.uniamerica.unijobs.controller;

import br.uniamerica.unijobs.dao.ServicoDao;
import br.uniamerica.unijobs.model.Servico;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("servicos")
public class ServicoController {
    @GET
    @Produces("application/json")
    public Response visualizar() {
        ServicoDao servicoDao = new ServicoDao();
        List<Servico> servicos = servicoDao.visualizar();
//        return Response.ok(new G(servicos)).build();
        return  null;
    }
    @PUT
    @Produces("application/json")
    @Consumes("application/json")
    public Response criar(Servico servico){
        return null;
    }
//    @PUT
//    @Path("id")
//    @Consumes("application/json")
//    @Produces("application/json")
//    public Response procurar( Servico servico, @PathParam("id") Integer id){
//        ServicoDao servicoDao = new ServicoDao();
//        if (servicoDao.procurar(id != null)){
//        }
//        return null;
//    }

//    @GET
//    @Path({"id"})
//    @Produces("application/json")
//    public Response findServicoById(@PathParam("id") Integer id){
//        Servico servico = new Servico();
//        return Response.ok(new GsonBuilderUtils() {
//            @Override
//            public int hashCode() {
//                return super.hashCode();
//            }
//        })
//    }
//


}
