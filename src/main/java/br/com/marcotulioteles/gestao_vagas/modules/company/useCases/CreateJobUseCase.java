package br.com.marcotulioteles.gestao_vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcotulioteles.gestao_vagas.modules.company.entities.JobEntity;
import br.com.marcotulioteles.gestao_vagas.modules.company.repositories.JobRespository;

@Service
public class CreateJobUseCase {
    
    @Autowired
    private JobRespository jobRespository;

    public JobEntity execute(JobEntity jobEntity) {
        return this.jobRespository.save(jobEntity);
    }
}
