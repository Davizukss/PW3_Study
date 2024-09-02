package br.com.etechoracio.pw3_study.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "TBL_MONITOR")
public class Monitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MONITOR")
    private Long id;

    @Column(name = "TX_NOME")
    private String tx_nome;

    @Column(name = "TX_FOTO")
    private String tx_foto;

    @Column(name = "TX_WHATSAPP")
    private String tx_whatsapp;

    @Column(name = "TX_EMAIL")
    private String tx_email;

    @Column(name = "TX_CONTEUDO")
    private String tx_conteudo;

    @ManyToOne
    @JoinColumn(name = "ID_DISCIPLINA")
    private Disciplina id_disciplina;
}
