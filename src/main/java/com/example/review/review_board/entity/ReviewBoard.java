package com.example.review.review_board.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ReviewBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reviewBoardId;
    @Column(length = 300)
    private String title;
    @Column(length = 1000)
    private String review;
    private int wish;
    private String thumbnail;
    private boolean adulted;
}
