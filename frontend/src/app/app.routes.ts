import { provideRouter, RouterConfig } from '@angular/router';

import {About} from './components/about/about';
import {Home} from './components/home/home';
import {MyModelPage} from './components/myModel/myModelPage';



const routes: RouterConfig = [
  { path: '', redirectTo: 'home', terminal: true },
  { path: 'home', component: Home },
  { path: 'about', component: About },
  { path: 'myModel', component: MyModelPage }
];

export const APP_ROUTER_PROVIDERS = [
  provideRouter(routes)
];
