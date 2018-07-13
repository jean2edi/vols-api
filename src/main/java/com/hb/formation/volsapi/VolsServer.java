package com.hb.formation.volsapi;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hb.formation.vols.datas.Vols;
import com.hb.formation.vols.model.Vol;

@Path("vols")
public class VolsServer {
    @GET
    @Path("vols")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Vol> getVols() {
        return Vols.getInstance().getDatas();
    }

    @GET
    @Path("vol/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Vol square(@PathParam("id") int id) {
        return Vols.getInstance().getVol(id);
    }

}
