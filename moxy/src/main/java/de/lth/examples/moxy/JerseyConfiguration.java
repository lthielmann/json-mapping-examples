package de.lth.examples.moxy;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        packages( "de.lth.examples.common.endpoint" );
    }
}
