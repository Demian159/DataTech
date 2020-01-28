//fetch('https://restcountries.eu/rest/v2/all')
fetch('https://my-json-server.typicode.com/Demian159/dbServicioTecnico/productos')
  .then(function(respuesta){
    return respuesta.json();
  })
  .then(function(dataCruda) {
    console.log(dataCruda);
    var i=0;
    let tituloProducto = document.querySelectorAll('h2.nombreProducto');
    let descProducto = document.querySelectorAll('p.descProducto');
    let imgProducto = document.querySelectorAll('img.imgProducto');
    tituloProducto.forEach(function(elemento){
      console.log("Soy un forEach cambiando parametros del HTML");
      tituloProducto[i].innerHTML=dataCruda[i].nombre;
      descProducto[i].innerHTML=dataCruda[i].desc;
      imgProducto[i].setAttribute("src", dataCruda[i].img);
      i++;
    });


  });
