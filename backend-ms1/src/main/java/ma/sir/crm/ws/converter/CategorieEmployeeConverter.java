package  ma.sir.crm.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.crm.zynerator.util.StringUtil;
import ma.sir.crm.zynerator.converter.AbstractConverter;
import ma.sir.crm.zynerator.util.DateUtil;
import ma.sir.crm.bean.history.CategorieEmployeeHistory;
import ma.sir.crm.bean.core.CategorieEmployee;
import ma.sir.crm.ws.dto.CategorieEmployeeDto;

@Component
public class CategorieEmployeeConverter extends AbstractConverter<CategorieEmployee, CategorieEmployeeDto, CategorieEmployeeHistory> {


    public  CategorieEmployeeConverter(){
        super(CategorieEmployee.class, CategorieEmployeeDto.class, CategorieEmployeeHistory.class);
    }

    @Override
    public CategorieEmployee toItem(CategorieEmployeeDto dto) {
        if (dto == null) {
            return null;
        } else {
        CategorieEmployee item = new CategorieEmployee();
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
    public CategorieEmployeeDto toDto(CategorieEmployee item) {
        if (item == null) {
            return null;
        } else {
            CategorieEmployeeDto dto = new CategorieEmployeeDto();
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
