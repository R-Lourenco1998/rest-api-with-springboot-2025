package br.com.rlourenco1998.file.importer.contract;

import br.com.rlourenco1998.data.dto.PersonDTO;

import java.io.InputStream;
import java.util.List;

public interface FileImporter {

    List<PersonDTO> importFile(InputStream inputStream) throws Exception;
}
