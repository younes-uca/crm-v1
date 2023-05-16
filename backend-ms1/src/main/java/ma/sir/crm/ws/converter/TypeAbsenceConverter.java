package  ma.sir.crm.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.crm.zynerator.util.StringUtil;
import ma.sir.crm.zynerator.converter.AbstractConverter;
import ma.sir.crm.zynerator.util.DateUtil;
import ma.sir.crm.bean.history.TypeAbsenceHistory;
import ma.sir.crm.bean.core.TypeAbsence;
import ma.sir.crm.ws.dto.TypeAbsenceDto;

@Component
public class TypeAbsenceConverter extends AbstractConverter<TypeAbsence, TypeAbsenceDto, TypeAbsenceHistory> {


    public  TypeAbsenceConverter(){
        super(TypeAbsence.class, TypeAbsenceDto.class, TypeAbsenceHistory.class);
    }

    @Override
    public TypeAbsence toItem(TypeAbsenceDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeAbsence item = new TypeAbsence();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


        return item;
        }
    }

    @Override
    public TypeAbsenceDto toDto(TypeAbsence item) {
        if (item == null) {
            return null;
        } else {
            TypeAbsenceDto dto = new TypeAbsenceDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
