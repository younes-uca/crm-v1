package  ma.sir.crm.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.crm.zynerator.util.StringUtil;
import ma.sir.crm.zynerator.converter.AbstractConverter;
import ma.sir.crm.zynerator.util.DateUtil;
import ma.sir.crm.bean.history.TypeContratHistory;
import ma.sir.crm.bean.core.TypeContrat;
import ma.sir.crm.ws.dto.TypeContratDto;

@Component
public class TypeContratConverter extends AbstractConverter<TypeContrat, TypeContratDto, TypeContratHistory> {


    public  TypeContratConverter(){
        super(TypeContrat.class, TypeContratDto.class, TypeContratHistory.class);
    }

    @Override
    public TypeContrat toItem(TypeContratDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeContrat item = new TypeContrat();
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
    public TypeContratDto toDto(TypeContrat item) {
        if (item == null) {
            return null;
        } else {
            TypeContratDto dto = new TypeContratDto();
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
