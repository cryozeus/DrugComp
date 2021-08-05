package com.licious.DrugComp.Repositories;

import com.licious.DrugComp.models.Molecule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MoleculeRepository extends JpaRepository {
    List<Molecule> findAll();
    Molecule findById(int id);
    List<Molecule> findByName(String name);
}