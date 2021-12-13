package com.maciek.przysiezniak.sortitall.services;

import com.maciek.przysiezniak.sortitall.model.Trash;
import com.maciek.przysiezniak.sortitall.repositories.TrashRepository;
import org.springframework.stereotype.Service;

@Service
public class TrashService {
    private final TrashRepository trashRepository;

    public TrashService(TrashRepository trashRepository) {
        this.trashRepository = trashRepository;
    }
    public Trash addTrash(Trash trash){
        return trashRepository.save(trash);
    }

}
