package com.insper.cuida_heliopolis.usuario.dto;

import com.insper.cuida_heliopolis.usuario.Cuidador;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CuidadorReturnDTO {
    private String nome;
    private String email;
    private String telefone;

    private String bio;
    private Integer numCriancas;

    private double notaMedia;
    private double espacoMedia;
    private double disponibilidadeMedia;
    private double qualificacaoMedia;
    private double vinculoMedia;
    private double atividadesMedia;

    public static CuidadorReturnDTO convert(Cuidador cuidador) {
        CuidadorReturnDTO cuidadorReturnDTO = new CuidadorReturnDTO();

        cuidadorReturnDTO.setNome(cuidador.getNome());
        cuidadorReturnDTO.setEmail(cuidador.getEmail());
        cuidadorReturnDTO.setTelefone(cuidador.getTelefone());

        cuidadorReturnDTO.setBio(cuidador.getBio());
        cuidadorReturnDTO.setNumCriancas(cuidador.getNumCriancas());

        cuidadorReturnDTO.setNotaMedia(cuidador.getNotaMedia());
        cuidadorReturnDTO.setEspacoMedia(cuidador.getEspacoMedia());
        cuidadorReturnDTO.setDisponibilidadeMedia(cuidador.getDisponibilidadeMedia());
        cuidadorReturnDTO.setQualificacaoMedia(cuidador.getQualificacaoMedia());
        cuidadorReturnDTO.setVinculoMedia(cuidador.getVinculoMedia());
        cuidadorReturnDTO.setAtividadesMedia(cuidador.getAtividadesMedia());

        return cuidadorReturnDTO;
    }
}