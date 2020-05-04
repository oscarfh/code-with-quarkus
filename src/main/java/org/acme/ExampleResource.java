package org.acme;

import com.google.common.base.Strings;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        Strings.isNullOrEmpty("myString");

        return "hello";
    }
}