//package br.uniamerica.unijobs.paths;
//
//import br.uniamerica.unijobs.dao.TipoProdutoDao;
//import br.uniamerica.unijobs.model.TipoProduto;
//import com.google.gson.Gson;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.Response;
//import java.sql.SQLException;
//import java.util.List;
//
//@Path("/")
//public class TipoProdutoPath {
//    private List<TipoProduto> tipos_produtos;
//    {
//        TipoProdutoDao tipoProdutoDao = new TipoProdutoDao();
//        try {
//            tipos_produtos = tipoProdutoDao.findAll();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//
//    @GET
//    @Path("/tipos_produtos")
//    @Produces("application/json")
//    public Response tipos_produtos(){
//        return Response.ok(new Gson().toJson(tipos_produtos)).build();
//    }
//
//    @GET
//    @Path("/tipos_produtos/{id}")
//    @Produces("application/json")
//    public Response tipo_produto(@PathParam("id") Integer id) {
//        TipoProdutoDao tipoProdutoDao = new TipoProdutoDao();
//        return Response.ok(new Gson().toJson(tipoProdutoDao.find(id))).build();
//    }
//}
