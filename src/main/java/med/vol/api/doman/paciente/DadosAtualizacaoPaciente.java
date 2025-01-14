package med.vol.api.doman.paciente;

import jakarta.validation.constraints.NotNull;
import med.vol.api.doman.endereco.DadosEndereco;


public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
