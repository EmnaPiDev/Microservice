import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Features/home/home.component';
import { UserComponent } from './Features/user/user.component';
import { EvenementsComponent } from './Features/evenements/evenements.component';
import { LieuxComponent } from './Features/lieux/lieux.component';
import { SponsorsComponent } from './Features/sponsors/sponsors.component';
import { ReservationsComponent } from './Features/reservations/reservations.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'user', component: UserComponent },
  { path: 'evenements', component: EvenementsComponent },
  { path: 'lieux', component: LieuxComponent },
  { path: 'sponsors', component: SponsorsComponent },
  { path: 'reservations', component: ReservationsComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' }, // Redirection par défaut vers 'accueil'
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
