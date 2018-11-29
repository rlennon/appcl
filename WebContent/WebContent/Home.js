$('document').ready(function(){

    //initilaise counters for minions and lazers on the island
    var planeCounter=0;
    var spaceshipCounter=0;

    //initialize limit variables for planes and spaceships that can be sent to the island
    var maxPlanes = 3;
    var maxSpaceships = 2;

    //initialize counter for planes and spaceships that the user wants to send to the island
    var planeCount=0;
    var spaceshipCount=0;
    
        
        //when the send button is clicked
        $('#send').click(function(){

        

            //check if neither radio button is selected
            if(document.getElementById("plane").checked == false && document.getElementById("spaceship").checked == false)
            {
                //display message to the user
                alert("Please select one of the options to send plane or send spaceship.");
            }
            else
            {   
                //if plane radio button is selected
                if(document.getElementById("plane").checked == true)
                {
                    //increment plane counter
                    planeCount++;
                    
                    //if the plane counter is less than the maximum let user send to the island
                    if(planeCount <= maxPlanes)
                    {
                        if(document.getElementById("plane").checked == true)
                        {
                            //console.log("checked");
                            planeCounter = planeCounter +3;
                        }
                        $("#contents").html("Plane sent to island!");
                        console.log(planeCount);
                    }
                    else if(planeCount > maxPlanes) //display error message indicating the maximum of planes are sent
                    {
                        alert("A maximum of 3 planes can be sent to the island at one time, please offload to island first before sending more.");
                    }
                }
                if(document.getElementById("spaceship").checked == true) //if spaceship radio button is selected
                {
                    //increment spaceship counter
                    spaceshipCount++;

                    //if the spceship counter is less than the maximum let user send to the island
                    if(spaceshipCount <= maxSpaceships)
                    {
                        if(document.getElementById("spaceship").checked == true)
                        {
                            spaceshipCounter = spaceshipCounter +6;
                        }
                        $("#contents").html("Spaceship sent to island!");
                        console.log(spaceshipCount);
                    }
                    else if(spaceshipCount > maxSpaceships) //display error message indicating the maximum of spaceships are sent
                    {
                        alert("A maximum of 2 spaceships can be sent to the island at one time, please offload to island first before sending more.");
                    }

                }
                
            }
        });
    

        //when offload button is clicked
	    $('#offload').click(function(){

        //uncheck both radio buttons
        $('input[id="plane"]').prop('checked', false);
        $('input[id="spaceship"]').prop('checked', false);
        
        //reset plane and spaceship counter back to 0 as they were offloaded to the island
        planeCount=0;
        spaceshipCount=0;


        //$('#contents').append("<p><h2>Answer: " +answer +"</h2>");

        //update island counter on screen
        $('#minionCount').html("&nbsp; Minions currently on the island: " +planeCounter);
        $('#lazerCount').html("&nbsp; Lazers currently on the island: " +spaceshipCounter);

        //display message to the user
        $("#contents").html("Dropped off at island!");

    });
	
});