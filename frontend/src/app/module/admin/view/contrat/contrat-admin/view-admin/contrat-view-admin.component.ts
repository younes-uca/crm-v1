import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ContratService} from 'src/app/controller/service/Contrat.service';
import {ContratDto} from 'src/app/controller/model/Contrat.model';
import {ContratCriteria} from 'src/app/controller/criteria/ContratCriteria.model';

import {TypeContratDto} from 'src/app/controller/model/TypeContrat.model';
import {TypeContratService} from 'src/app/controller/service/TypeContrat.service';
@Component({
  selector: 'app-contrat-view-admin',
  templateUrl: './contrat-view-admin.component.html'
})
export class ContratViewAdminComponent extends AbstractViewController<ContratDto, ContratCriteria, ContratService> implements OnInit {


    constructor(private contratService: ContratService, private typeContratService: TypeContratService){
        super(contratService);
    }

    ngOnInit(): void {
        this.typeContrat = new TypeContratDto();
        this.typeContratService.findAll().subscribe((data) => this.typeContrats = data);
    }


    get typeContrat(): TypeContratDto {
       return this.typeContratService.item;
    }
    set typeContrat(value: TypeContratDto) {
        this.typeContratService.item = value;
    }
    get typeContrats():Array<TypeContratDto> {
       return this.typeContratService.items;
    }
    set typeContrats(value: Array<TypeContratDto>) {
        this.typeContratService.items = value;
    }


}
