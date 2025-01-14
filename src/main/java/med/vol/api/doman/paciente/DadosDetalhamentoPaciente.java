package med.vol.api.doman.paciente;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String telefone, String cpf) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getTelefone(), paciente.getEmail(),
                paciente.getEmail());
    }

}
