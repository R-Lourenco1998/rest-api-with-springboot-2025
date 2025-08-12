package br.com.rlourenco1998.integrationtests.dto.wrappers.json;

import br.com.rlourenco1998.integrationtests.dto.wrappers.PersonEmbeddedDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class WrapperPersonDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("_embedded")
    private PersonEmbeddedDTO embedded;

    public WrapperPersonDTO() {
    }

    public WrapperPersonDTO(PersonEmbeddedDTO embedded) {
        this.embedded= embedded;
    }

    public PersonEmbeddedDTO getEmbedded() {
        return embedded;
    }

    public void setEmbeddedDTO(PersonEmbeddedDTO embedded) {
        this.embedded = embedded;
    }
}
