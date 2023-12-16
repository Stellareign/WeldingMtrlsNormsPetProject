package com.example.wedingnorms.service;

import com.example.wedingnorms.dto.SeamDTO;
import com.example.wedingnorms.model.WeldingSeam;
import org.springframework.stereotype.Service;

@Service
public class DtoFactory {
    public SeamDTO fromWeldingSeamToSeamDTO (WeldingSeam seam){
     return   new SeamDTO(seam.getGost().gostName(), seam.getSeamType().name(), seam.getThink());
    }
}
