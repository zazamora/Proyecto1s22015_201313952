$(document).on("ready",function(){

	var ajax_load = "<div id='loader-wrap'><img src='loaders/loading.gif'></img>" +
		   			"<p class='smallBox'>Cargando Contenido</p></div>";
	var parameter = "";

	
	$('nav#menu-bar').delegate('nav#menu-bar ul li a.ajax', 'click',function(evento){
		evento.preventDefault();
		$("section#contenido")
			.html(ajax_load).load($(this).attr("href") , null);
	});
	
	$('a.ajax.delete').click(function(evento){
		evento.preventDefault();
		$("section#contenido")
			.html(ajax_load).load($(this).attr("href"),{isbn : $(this).attr("id") });
	
	});
	
	
	$(':submit.ajax, a.button.ajax').click(function(evento){
		evento.preventDefault();
		parameter = "";
		$("form[name='catalogo-libros'] :checked").each(function(){
			parameter += $(this).val() + "/";
		});
		
		$("section#contenido")
			.html(ajax_load).load($(this).attr("id")+".do" ,{productos:parameter});
	
	});

});