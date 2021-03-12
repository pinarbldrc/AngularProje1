import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Friend } from './friends/friend';

@Injectable({
  providedIn: 'root'
})
export class FriendServiceService {

  path="http://localhost:8089/friend";

  friends:Friend[]=[];
  friend= new Friend();

  constructor(private httpClient:HttpClient) { }

 
     getFriends():Friend[] { 
   this.httpClient.get<Friend[]>(this.path +'/getAllFriends').subscribe(
   response =>{
   console.log(response);
   this.friends=response as Friend[];
   }
  
   );
   return this.friends;
  }

  getFriend(id:number):Friend{

    this.httpClient.get<Friend>(this.path +'/getFriend/'+id).subscribe(
      response =>{
      console.log(response);
         this.friend=response as Friend;
      }
    );
   return this.friend;

  }

  addFriend(friend : Friend) : Observable<Friend> {
    const url = `${this.path}/addFriend`;
    const response = this.httpClient.post<Friend>(url, friend);
    return response
  }


  
  


}
