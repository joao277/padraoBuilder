package builder;

public class PersonagemBuilder {
    
    private Personagem personagem;

    public PersonagemBuilder() {
        personagem = new Personagem();
    }

    public Personagem build() {
        if (personagem.getId() == 0) {
            throw new IllegalArgumentException("Id Inválido");
        }
        if (personagem.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return personagem;
    }


    public PersonagemBuilder setId(int id) {
        personagem.setId(id);
        return this;
    }

    public PersonagemBuilder setNome(String nome) {
        personagem.setNome(nome);
        return this;
    }

    public PersonagemBuilder setForca(int forca) {
        personagem.setForca(forca);
        return this;
    }

    public PersonagemBuilder setDestreza(int destreza) {
        personagem.setDestreza(destreza);
        return this;
    }

    public PersonagemBuilder setConstituicao(int constitucao) {
        personagem.setConstituicao(constitucao);
        return this;
    }

    public PersonagemBuilder setInteligencia(int inteligencia) {
        personagem.setInteligencia(inteligencia);
        return this;
    }

    public PersonagemBuilder setSabedoria(int sabedoria) {
        personagem.setSabedoria(sabedoria);
        return this;
    }

    public PersonagemBuilder setCarisma(int carisma) {
        personagem.setCarisma(carisma);
        return this;
    }
}