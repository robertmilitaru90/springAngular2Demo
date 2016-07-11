import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {MyModel} from '../../../components/myModel/model/myModel';
import {Observable} from 'rxjs/Observable';
import 'rxjs/Rx';

@Injectable()
export class MyService {

    constructor (private http: Http) {}

    private _backendUrl = 'http://localhost:8080/server/welcome';  // URL to web api
    getModel(): Observable<MyModel> {
        return this.http.get(this._backendUrl)
            .map(result=> result.json())
            .catch(this.handleError);

    }


  private handleError (error: Response) {

        console.log(error);
        return Observable.throw(error.json().error || 'Server error');
    }
}
