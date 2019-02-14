//
//Users service homepage javascript
//

//DOM variables
//
// let textArea = document.getElementById('text-area'),

var allUsers = document.getElementById('listUsers');

import $ from 'jquery';
allUsers.addEventListener('click', function(){
    $.get("http://localhost:8080/api/v1/users", data => console.log('data: ', data));
}


var message = null;

// listUsers.addEventListener('click', function(){
//
//     var responseText = document.getElementById('text-area');
//     var xmlhttp = new XMLHttpRequest();
//     var url = "";
//     xmlhttp.open("GET", http://localhost:8080/api/v1/users, true);
//     xmlhttp.setRequestHeader("Content-type", "application/json");
//     xmlhttp.onload = (res) => {
//     console.log(res['target']['response']);
//     message = res['target']['response'];
//     responseText.innerText = message;
// };
//     xmlhttp.send();
// }







