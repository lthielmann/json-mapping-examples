package de.lth.examples.common.domain;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
public class SimpleCollection {

    private Long id;

    @XmlElementWrapper(name = "elements")
    @XmlElement(name = "element")
    private List< SimpleElement > collection = new ArrayList< SimpleElement >();

    public void add( String name ) {
        collection.add( new SimpleElement( name ) );
    }
}
