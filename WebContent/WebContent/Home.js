$('document').ready(function(){

	$('#calc').click(function(){


        var minions = document.getElementById("minions").value;
        var lazers = document.getElementById("lazers").value;

        var answer = minions * lazers + 12 / 2;
        

        //this code will be changed depending minion and plane requirements 
        //this code is just a basic example of code functionality + correct arithmetic implementaion to be added later
        
        $('#contents').append("<p><h2>Answer: " +answer +"</h2>");

    });
	
});