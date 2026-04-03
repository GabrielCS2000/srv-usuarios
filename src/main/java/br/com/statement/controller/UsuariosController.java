package br.com.statement.controller;

import br.com.statement.controller.dto.consumes.request.UsuariosPostDTO;
import br.com.statement.controller.mapper.UsuariosMapper;
import br.com.statement.entity.Usuarios;
import br.com.statement.service.UsuariosService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuariosController {

    @Inject
    UsuariosService service;

    @Inject
    UsuariosMapper mapper;

    @GET
    public List<Usuarios> getAllUsers() {
        return Usuarios.listAll();
    }

    @GET
    @Path("/{email}")
    public Usuarios getByEmail(@PathParam("email") String email) {
        return service.findByEmail(email);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser(UsuariosPostDTO request) {
        service.insertUsuario(mapper.toDomain(request));
        return  Response.ok().build();
    }
}
