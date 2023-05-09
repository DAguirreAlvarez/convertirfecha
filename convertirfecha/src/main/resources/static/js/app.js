/**
 * 
 */
var url = window.location.pathname;
var filename = url.substring(url.lastIndexOf('/')+1);
if(filename=="time"){
	alert("Esta es la plantilla de Hora Actual");
}else if(filename=="date"){
	alert("Esta es la plantilla de Fecha");
}
 