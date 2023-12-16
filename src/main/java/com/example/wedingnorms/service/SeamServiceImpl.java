package com.example.wedingnorms.service;

import com.example.wedingnorms.SeamRepository;
import com.example.wedingnorms.dto.SeamDTO;
import com.example.wedingnorms.enums.SeamsGOSTs;
import com.example.wedingnorms.enums.SeamsNumber;
import com.example.wedingnorms.model.WeldingSeam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeamServiceImpl implements SeamService {
    private final SeamRepository seamRepository;
    private final DtoFactory dtoFactory;

    public SeamDTO addSeamToDB(SeamsGOSTs gost, SeamsNumber seamsNumber, int think) {
        WeldingSeam weldingSeam = new WeldingSeam(gost, seamsNumber, think);
        return dtoFactory.fromWeldingSeamToSeamDTO(seamRepository.save(weldingSeam));
    }

    public int calculateFlowRate (int detailsThink) {
        int seamCrossSectionalAreaButtWeld =
    }

    public int calculateSeamCrossSectionalArea (int detailsThink){

    }


}
