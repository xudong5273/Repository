package org.lostandfound.service.impl;

import org.lostandfound.dao.SumDao;
import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;
import org.lostandfound.service.SumService;
import org.lostandfound.web.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SumServiceImpl implements SumService {

    @Autowired
    private SumDao sumDao;


    public List<ResultDto> getResultDto() {

            List<Lost> losts = sumDao.queryLost();
            Map<String,Integer> maplost = new HashMap<String,Integer>();
            Set<String> set = new HashSet<String>();

            for(Lost lost:losts){
                    if(maplost.containsKey(lost.getClasses())){
                        maplost.put(lost.getClasses(),maplost.get(lost.getClasses())+1);
                    }else{
                        maplost.put(lost.getClasses(),1);
                    }
                set.add(lost.getClasses());

            }

        List<Found> founds = sumDao.queryFound();
        System.out.println(founds);
        Map<String,Integer> mapfound = new HashMap<String,Integer>();
        for(Found found:founds){
            if(mapfound.containsKey(found.getClasses())){
                mapfound.put(found.getClasses(),mapfound.get(found.getClasses())+1);
            }else{
                mapfound.put(found.getClasses(),1);
            }
            set.add(found.getClasses());

        }
        List<ResultDto> resultDtos = new ArrayList<ResultDto>();
        for (String s : set) {
            ResultDto resultDto = new ResultDto();
            resultDto.setClassess(s);
            Integer lostcounts = maplost.get(s);
            Integer foundcounts = mapfound.get(s);
            resultDto.setLostcount(lostcounts==null?0:lostcounts);
            resultDto.setFoundcount(foundcounts==null?0:foundcounts);
            resultDtos.add(resultDto);
        }
        return resultDtos;
    }
}
