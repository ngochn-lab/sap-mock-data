package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "link_value")
public class LinkValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String link;

    @Column(nullable = false)
    private String value;

    public LinkValue(String link, String value) {
        this.link = link;
        this.value = value;
    }

    @Override
    public String toString() {
        return "LinkValue{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}