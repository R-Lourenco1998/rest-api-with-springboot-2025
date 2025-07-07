package br.com.rlourenco1998.file.exporter.contract;

import br.com.rlourenco1998.data.dto.PersonDTO;
import org.springframework.core.io.Resource;

import java.util.List;

public interface FileExporter {

    Resource exportFile(List<PersonDTO> people) throws Exception;
}
