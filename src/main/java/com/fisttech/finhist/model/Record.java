package com.fisttech.finhist.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
