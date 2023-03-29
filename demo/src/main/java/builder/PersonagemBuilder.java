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
            throw new IllegalArgumentException("Nome Inválido");
        }
        if (personagem.getForca() == 0) {
            throw new IllegalArgumentException("Atributo de Força Inválido");
        }
        if (personagem.getDestreza() == 0) {
            throw new IllegalArgumentException("Atributo de Destreza Inválido");
        }
        if (personagem.getConstituicao() == 0) {
            throw new IllegalArgumentException("Atributo de Constituição Inválido");
        }
        if (personagem.getInteligencia() == 0) {
            throw new IllegalArgumentException("Atributo de Inteligencia Inválido");
        }
        if (personagem.getSabedoria() == 0) {
            throw new IllegalArgumentException("Atributo de Sabedoria Inválido");
        }
        if (personagem.getCarisma() == 0) {
            throw new IllegalArgumentException("Atributo de Carisma Inválido");
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