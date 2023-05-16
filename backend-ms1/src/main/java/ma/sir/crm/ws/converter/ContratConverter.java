package  ma.sir.crm.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.crm.zynerator.util.StringUtil;
import ma.sir.crm.zynerator.converter.AbstractConverter;
import ma.sir.crm.zynerator.util.DateUtil;
import ma.sir.crm.bean.history.ContratHistory;
import ma.sir.crm.bean.core.Contrat;
import ma.sir.crm.ws.dto.ContratDto;

@Component
public class ContratConverter extends AbstractConverter<Contrat, ContratDto, ContratHistory> {

    @Autowired
    private TypeContratConverter typeContratConverter ;
    private boolean typeContrat;

    public  ContratConverter(){
        super(Contrat.class, ContratDto.class, ContratHistory.class);
    }

    @Override
    public Contrat toItem(ContratDto dto) {
        if (dto == null) {
            return null;
        } else {
        Contrat item = new Contrat();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDateContrat()))
                item.setDateContrat(DateUtil.stringEnToDate(dto.getDateContrat()));
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.typeContrat && dto.getTypeContrat()!=null)
                item.setTypeContrat(typeContratConverter.toItem(dto.getTypeContrat())) ;



        return item;
        }
    }

    @Override
    public ContratDto toDto(Contrat item) {
        if (item == null) {
            return null;
        } else {
            ContratDto dto = new ContratDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(item.getDateContrat()!=null)
                dto.setDateContrat(DateUtil.dateTimeToString(item.getDateContrat()));
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.typeContrat && item.getTypeContrat()!=null) {
            dto.setTypeContrat(typeContratConverter.toDto(item.getTypeContrat())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.typeContrat = value;
    }


    public TypeContratConverter getTypeContratConverter(){
        return this.typeContratConverter;
    }
    public void setTypeContratConverter(TypeContratConverter typeContratConverter ){
        this.typeContratConverter = typeContratConverter;
    }
    public boolean  isTypeContrat(){
        return this.typeContrat;
    }
    public void  setTypeContrat(boolean typeContrat){
        this.typeContrat = typeContrat;
    }
}
