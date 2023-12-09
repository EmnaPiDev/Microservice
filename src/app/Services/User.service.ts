// user.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../Models/User.model';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  private baseUrl = 'http://localhost:8084/micro/user';

  constructor(private http: HttpClient) {}

  addUser(user: User): Observable<User> {
    const url = `${this.baseUrl}/add-user`;
    return this.http.post<User>(url, user);
  }

  updateUser(id: number, updatedUser: User): Observable<User> {
    const url = `${this.baseUrl}/update-user/${id}`;
    return this.http.put<User>(url, updatedUser);
  }

  deleteUser(id: number): Observable<void> {
    const url = `${this.baseUrl}/${id}`;
    return this.http.delete<void>(url);
  }

  retrieveUser(id: number): Observable<User | null> {
    const url = `${this.baseUrl}/retrieve-user/${id}`;
    return this.http.get<User | null>(url);
  }
}
