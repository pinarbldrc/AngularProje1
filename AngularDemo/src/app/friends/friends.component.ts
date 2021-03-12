import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { FriendServiceService } from '../friend-service.service';
import { Friend } from './friend';

@Component({
  selector: 'app-friends',
  templateUrl: './friends.component.html',
  styleUrls: ['./friends.component.css']
})
export class FriendsComponent implements OnInit {

  friends:Friend[]=[];
  friend: Friend=new Friend();
  constructor(private service:FriendServiceService) { }

  ngOnInit(): void {
    //this.friends=this.service.getFriends()
    //this.friend=this.service.getFriend(1)
  }



  onSubmit(){
     
   
     
    console.log(this.friend)
    
      
           
    

   //this.service.addFriend(this.service.friend);
   this.service.addFriend(this.friend).subscribe(res => {
       console.log(res);
  });

   

  }

 

}
