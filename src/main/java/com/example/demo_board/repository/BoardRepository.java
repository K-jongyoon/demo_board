package com.example.demo_board.repository;

import com.example.demo_board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board,Long> { // <Entity명, 기본키의 데이터값>


}
