
window.onload = function(){ 
  const eventDetails = []; 
  document.getElementById("addEvent").addEventListener("click", addEvent); 
  document.getElementById('displayEvent').addEventListener("click", displayElement); 
  let add = document.getElementById("eventName"); 
  let successMessage = document.getElementById("successMessage"); 
  let resultTable = document.getElementById("resultTable"); 
  function addEvent() { 
      let name = add.value; 
      resultTable.innerHTML = ""; 
      if (name === "") 
      { 
          successMessage.innerText = "Please Enter an event name";
      } 
      else { 
              if(eventDetails.includes(name)){
                  successMessage.innerText='Event name already exists..';
              }
              else{
                  eventDetails.push(name);
                  add.value = "";
                  successMessage.innerText='Event name added successfully';
              }
      } 
  } 
  function displayElement() { 
      successMessage.innerText = ""; 
      if(eventDetails.length === 0 ){ 
          console.log('List is empty'); 
          resultTable.innerHTML = "<tr><td>There is no list to display</td></tr>"; 
      } 
      else{ 
          let str = "<tr><th>Event Names</th></tr>"; 
          eventDetails.sort();
          for (let event of eventDetails) { 
              str += "<tr><td>" + event + "</td></tr>"; 
           } 
           resultTable.innerHTML = str; 
      } 
  }
}



