
function style84()  {
 document.getElementById("css").href = "css/main84.css";
}
function styleNow()  {
    document.getElementById("css").href = "css/main.css";
}

$("#os-phrases > h2")
    .css('opacity', 1).lettering( 'words' )
    .children( "span" ).lettering()
    .children( "span" ).lettering();

function RedirectionAcceuil() {
    document.location.href = "/Users/wannyould-amrouche/Documents/mywebsite/index.html";
}
if ( navigator.platform.indexOf('Win') != -1 ) {
    window.document.getElementById("wrapper").setAttribute("class", "windows");
} else if ( navigator.platform.indexOf('Mac') != -1 ) {
    window.document.getElementById("wrapper").setAttribute("class", "mac");
}

