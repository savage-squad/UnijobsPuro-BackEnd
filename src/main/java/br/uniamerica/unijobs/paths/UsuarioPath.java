package br.uniamerica.unijobs.paths;

import br.uniamerica.unijobs.dao.UsuarioDao;
import br.uniamerica.unijobs.model.Usuario;
import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/usuarios")
public class UsuarioPath {
    private List<Usuario> usuarios;
    {
        UsuarioDao usuarioDao = new UsuarioDao();
        try {
            usuarios = usuarioDao.findAll();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @GET
    @Produces("application/json")
    public Response usuarios(){
        return Response.ok(new Gson().toJson(usuarios)).build();
    }
}
