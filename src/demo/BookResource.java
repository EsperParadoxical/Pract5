package demo;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Created by 151260D on 11/14/2016.
 */

@Path ("/book")
public class BookResource {
    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public String getBook() {
        Gson gson = new Gson();
        return gson.toJson(new Book());
    }

}
