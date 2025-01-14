package med.vol.api.doman.medico;

public record DadosListagemMedico(Long id, String nome, String email, String crm, String pais, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(),medico.getPais(), medico.getEspecialidade());
    }
}
