package com.example.wedingnorms;

import com.example.wedingnorms.model.WeldingSeam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeamRepository extends JpaRepository<WeldingSeam, Integer> {
    WeldingSeam findByGostAndSeamTypeAndThink();

    WeldingSeam save(WeldingSeam entity);

}
