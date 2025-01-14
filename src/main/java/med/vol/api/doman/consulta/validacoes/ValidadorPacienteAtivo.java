package med.vol.api.doman.consulta.validacoes;

import med.vol.api.consulta.DadosAgendamentoConsulta;
import med.vol.api.doman.ValidacaoException;
import med.vol.api.doman.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta {
    @Autowired
    private PacienteRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var pacienteEstaAtivo = repository.findAtivoById(dados.idPaciente());
        if(!pacienteEstaAtivo){
            throw new ValidacaoException("Consulta não pode ser agendada com pacientes excluídos.");
        }
    }

}
