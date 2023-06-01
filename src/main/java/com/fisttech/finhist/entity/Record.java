package com.fisttech.finhist.entity;

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
public class Record { // TODO: AuditableEntity?

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String type;

    private BigDecimal qty;

    private BigDecimal amount;

    private BigDecimal additionalAmount; // // TODO: ?

    private BigDecimal totalAmount; // TODO: ?

    @NonNull
    private String description;

    private LocalDateTime transactionDate = LocalDateTime.now();



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
