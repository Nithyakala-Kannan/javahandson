window.onload=function{
    const eventDetails=[];
    document.getElementById("push").addEventListener("click",pushEvent);
    document.getElementById("pop").addEventListener("click",popEvent);
    document.getElementById("display").addEventListener("click",displayEvent);

    let addEvents = document.getElementById("eventName"); 

    let successMessage = document.getElementById("successMessage"); 

    let result = document.getElementById("result"); 

    let resultTable = document.getElementById("resultTable"); 

    function pushEvent() { 
        let name = addEvents.value; 
        eventList.innerHTML = "";
        if (name === "") { 
            successMessage.innerText = "Please Enter a valid event name"; 
        } else { 

            if(eventDetails.includes(name)){
                    successMessage.innerText='Event name already exists.Try with some other name';
                }
                else{
                    eventDetails.push(name);
                    addEvents.value = "";
                    successMessage.innerText='Added successfully';
                }
           
        } 
    } 
    function popEvent(){
        eventDetails.pop();
        successMessage.innerText='Removed successfully';
    }

    function displayEvent() { 

        successmessage.innerText = ""; 

        if(eventDetails.length === 0 ){

            successmessage.innerText = "There is no List to display";

        } 

        else{ 
            document.getElementById("h3").textContent="The Events in the Array";
            let str = ""; 
            for (let event of eventDetails) { 
                str += "<li>" + event + "</li>"; 

             } 

             eventList.innerHTML = str; 

        } 

    }   
} 




