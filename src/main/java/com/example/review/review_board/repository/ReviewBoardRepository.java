package com.example.review.review_board.repository;

import com.example.review.review_board.entity.ReviewBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewBoardRepository extends JpaRepository<ReviewBoard,Long> {
}
