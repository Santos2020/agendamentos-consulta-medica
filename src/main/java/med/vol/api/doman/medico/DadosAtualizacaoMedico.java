package med.vol.api.doman.medico;

import jakarta.validation.constraints.NotNull;
import med.vol.api.doman.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
