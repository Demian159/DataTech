//fetch('https://restcountries.eu/rest/v2/all')
fetch('https://my-json-server.typicode.com/Demian159/dbServicioTecnico/productos')
  .then(function(respuesta){
    return respuesta.json();
  })
  .then(function(dataCruda) {
    console.log(dataCruda);
    var i=0;
    //Pagina Catalogo
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
    //Pagina Administración
    let tituloProducto2 = document.querySelectorAll('td.nombreProducto');
    let descProducto2 = document.querySelectorAll('td.descProducto');
    let precioProducto2 = document.querySelectorAll('td.precioProducto');
    let stockProducto2 = document.querySelectorAll('td.stockProducto');
    tituloProducto2.forEach(function(elemento){
      console.log("Soy un forEach cambiando parametros del HTML");
      tituloProducto2[i].innerHTML=dataCruda[i].nombre;
      descProducto2[i].innerHTML=dataCruda[i].desc;
      precioProducto2[i].innerHTML=dataCruda[i].precio;
      stockProducto2[i].innerHTML=dataCruda[i].tipo;
      i++;
    });

  });
