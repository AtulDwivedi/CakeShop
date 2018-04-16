$(document).ready(function(){

	// HOME PRODUCT SCROLLER TABS
	$('.productThumb ul').tabs('.productsWarp > ul > li', {effect:'horizontal'}).slideshow({autoplay:true});


	// HOME PRODUCT SLIDER
	$('#fresh .newCakes .scroller').each(function(){       
        var rowDiv = document.createElement("div");
        $(rowDiv).addClass("cake-row");
        for(i=0; i< $(this).find("> .newCake").length ; i+= 4)
        {       
                $(rowDiv).append( $(this).find("> .newCake").slice(i, i+4).clone() );           
                $(this).append(rowDiv);
                rowDiv = document.createElement("div");
                $(rowDiv).addClass("cake-row");
        }
        $(this).find("> .newCake").remove(); 
	});
	$('#fresh').scrollable({items:'.scroller',next:'.nextButton',prev:'.prevButton'});
});