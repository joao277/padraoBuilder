package builder;

import builder.Personagem;
import builder.PersonagemBuilder;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class PersonagemBuilderTest {

    @Test
    void deveRetornarExcecaoParaPersonagemSemID() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setNome("Pedrin")
                    .setForca(1)
                    .setDestreza(1)
                    .setConstituicao(1)
                    .setInteligencia(1)
                    .setSabedoria(1)
                    .setCarisma(1)
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "ID inválido");
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemSemNome() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setId(1)
                    .setForca(1)
                    .setDestreza(1)
                    .setConstituicao(1)
                    .setInteligencia(1)
                    .setSabedoria(1)
                    .setCarisma(1)
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Nome Inválido");
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemSemForça() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setId(1)
                    .setNome("Pedrin")
                    .setDestreza(1)
                    .setConstituicao(1)
                    .setInteligencia(1)
                    .setSabedoria(1)
                    .setCarisma(1)
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Atributo de Força Inválido");
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemSemDestreza() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setId(1)
                    .setNome("Pedrin")
                    .setForca(1)
                    .setConstituicao(1)
                    .setInteligencia(1)
                    .setSabedoria(1)
                    .setCarisma(1)
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Atributo de Destreza Inválido");
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemSemConstituicao() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setId(1)
                    .setNome("Pedrin")
                    .setForca(1)
                    .setDestreza(1)
                    .setInteligencia(1)
                    .setSabedoria(1)
                    .setCarisma(1)
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Atributo de Constituição Inválido");
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemSemInteligencia() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setId(1)
                    .setNome("Pedrin")
                    .setForca(1)
                    .setDestreza(1)
                    .setConstituicao(1)
                    .setSabedoria(1)
                    .setCarisma(1)
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Atributo de Inteligencia Inválido");
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemSemSabedoria() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setId(1)
                    .setNome("Pedrin")
                    .setForca(1)
                    .setDestreza(1)
                    .setConstituicao(1)
                    .setInteligencia(1)
                    .setCarisma(1)
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Atributo de Sabedoria Inválido");
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemSemCarisma() {
        try {
            PersonagemBuilder personagemBuilder = new PersonagemBuilder();
            Personagem personagem = personagemBuilder
                    .setId(1)
                    .setNome("Pedrin")
                    .setForca(1)
                    .setDestreza(1)
                    .setConstituicao(1)
                    .setInteligencia(1)
                    .setSabedoria(1)
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Atributo de Carisma Inválido");
        }
    }



    @Test
    void deveRetornarPersonagemValido() {
        PersonagemBuilder personagemBuilder = new PersonagemBuilder();
        Personagem personagem = personagemBuilder
            .setId(1)
            .setNome("Pedrin")
            .build();

        assertNotNull(personagem);
    }
}
