package com.fisttech.finhist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//
//    @Builder.Default
//    private boolean active=false;

    @NonNull
    private String type;

    @NonNull
    private String description;

    private LocalDateTime transactionDate = LocalDateTime.now();

    private BigDecimal qty;

    private BigDecimal amount;


    private BigDecimal sumAmount; // olsun. ileriye


//    @OneToMany(mappedBy = "link")
//    private List<Comment> comments = new ArrayList<>();

//    public Link(@NonNull String title, @NonNull String url) {
//        this.title = title;
//        this.url = url;
//    }

//    public void addComment(Comment comment) {
//        comments.add(comment);
//    }
}
