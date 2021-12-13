package com.maciek.przysiezniak.sortitall.repositories;

import com.maciek.przysiezniak.sortitall.model.Trash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrashRepository extends JpaRepository<Trash,Long> {
}
