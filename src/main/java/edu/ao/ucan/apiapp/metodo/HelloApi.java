package edu.ao.ucan.apiapp.metodo;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * 2020.03.25 18:16:45 UTF-8
 *
 * @author Jotajota Costa Resende [JJ at bpc.ao] ApiApp
 */
@Stateless
@Path("hello")
public class HelloApi
{

    @Path("/givehello")
    @GET
    public String hello()
    {
        return "Hello API";
    }

}
