window.onload = function(){ 
    const eventDetails = []; 
    document.getElementById("addEvent").addEventListener("click", addEvent); 
    document.getElementById('displayEvent').addEventListener("click", displayElement); 
    let add = document.getElementById("eventName"); 
    let successMessage = document.getElementById("successMessage"); 
    let result = document.getElementById("result"); 
    let resultTable=document.getElementById("resultTable");
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
            successMessage.innerText = "There is no list to display"; 
        } 
        else{ 
            document.getElementById("h3").textContent="The Event Name after sorting is";
            let str = ""; 
            let sortedEvents=eventDetails.sort();
            for (let event of sortedEvents) { 
                str += "<center><li>" + event + "</li></center>"; 
             } 
             resultTable.innerHTML = str; 
        } 
    }
  }