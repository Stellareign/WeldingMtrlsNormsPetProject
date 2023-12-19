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

    private int positionСoefficient = 0;

    //******************************************************************************************************
    public SeamDTO addSeamToDB(SeamsGOSTs gost, SeamsNumber seamsNumber, int thick) {
        WeldingSeam weldingSeam = new WeldingSeam(gost, seamsNumber);
        return dtoFactory.fromWeldingSeamToSeamDTO(seamRepository.save(weldingSeam));
    }
    //******************************************************************************************************
    //добавить каскадное удаление расходов материалов
    public void deleteSeamFromDB(SeamsGOSTs gost, SeamsNumber seamsNumber) {
        WeldingSeam weldingSeam = new WeldingSeam(gost, seamsNumber;
        seamRepository.delete(weldingSeam);
    }

    //******************************************************************************************************
// рассчёт расхода материалов на стыковой шов
    public int calculateFlowRate(int detailsThick) {
        int seamCrossSectionalAreaButtWeld =
    }
    
    //******************************************************************************************************
    // рассчёт поперечного сечения шва
    public int calculateSeamCrossSectionalArea(int detailsThick) {

    }


}
