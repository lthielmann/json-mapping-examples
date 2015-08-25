package de.lth.examples.common.endpoint;


import de.lth.examples.common.domain.SimpleCollection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path( "/" )
@Produces( MediaType.APPLICATION_JSON )
public class SimpleService {

    @GET
    public SimpleCollection getSimpleObject() {
        SimpleCollection collection = new SimpleCollection();
        //collection.setId( 1L );
        collection.add( "A" );
        collection.add( "B" );
        return collection;
    }
}
