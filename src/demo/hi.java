package demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by 151260D on 11/14/2016.
 */
@Path("/hi")

public class hi {
    @GET
    @Produces (MediaType.TEXT_PLAIN)
    public String getPlainMessage() {
        return "HI WORLD.";
    }

    @GET
    @Produces (MediaType.TEXT_XML)
    public String getMessage() {
        return "HI WORLD.";
    }

    @GET
    @Produces (MediaType.TEXT_HTML)
    public String getHTMLMessage() {
        return "HI WORLD.";
    }



}
