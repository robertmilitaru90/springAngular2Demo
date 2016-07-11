import {Component, OnInit, Inject} from '@angular/core';
import {MyService} from '../../components/myModel/services/my.service';
import {MyModel} from '../../components/myModel/model/myModel';
import {HTTP_PROVIDERS}    from '@angular/http';


@Component({
  selector: 'myModel',
  templateUrl: './myModel.html',
  providers:  [HTTP_PROVIDERS, MyService]}
)
export class MyModelPage implements OnInit{

  constructor(@Inject (MyService) public myService){

  }

  errorMessage: string;
  data : MyModel[];
  getModels(){
    this.myService.getModel().subscribe(
      (data) => this.data = data,
      error =>  this.errorMessage = <any>error);

  }
  ngOnInit(){
    this.getModels();
  }

}


