$(document).ready(function () {
	
   //registro evento pulsante search	
   $('#btn-add').click(function (event) {   
    //preparo la request in json
    var requestData = {
	    'aereo':{
		     'id':$('#txt-aereo').val()
	    }
     };
    
     //chiamo il server---------------
    var response=fire_ajax_post("api/add", requestData);
    var response_object=response.responseJSON;   //questo torna un oggetto complesso che posso navigare
    
    //elaboro la risposta in formato testo
    var response_text=response.responseText;   //questo torna una stringa pura
    $('#text-feedback').text(response_text);
    
    //elaboro la risposta in formato ogetto
    $("#table-feedback tr.mia").remove();
    $.each(response_object.aerei, function(i, item) {
	     var riga="<tr class='mia'>";
	     riga+="<td>"+item.id+"</td>";
	     riga+="<td>"+item.nome+"</td>";
	     riga+="<td>"+item.nunPasseggeri+"</td>";
	     riga+="<td><button onClick='deleteAereo(\""+item.id+"\")' type='button' class='btn btn-danger'>delete</button></td>";
	     riga+="</tr>";
         $("#table-feedback").append(riga);
    });
 });


});

function deleteAereo(itemId){
//chiamo il server---------------	
var response=fire_ajax_pathvar("api/delete/"+itemId);
var response_object=response.responseJSON;

//elaboro la risposta in formato testo
 var response_text=response.responseText;
$('#text-feedback').text(response_text);
    

$("#table-feedback tr.mia").remove();

 //elaboro la risposta in formato ogetto
$.each(response_object.aerei, function(i, item) {
   var riga="<tr class='mia'>";
   riga+="<td>"+item.id+"</td>";
   riga+="<td>"+item.nome+"</td>";
   riga+="<td>"+item.nunPasseggeri+"</td>";
   riga+="<td><button onClick='deleteAereo(\""+item.id+"\")' type='button' class='btn btn-danger'>delete</button></td>";
   riga+="</tr>";
   $("#table-feedback").append(riga);
    });	
}